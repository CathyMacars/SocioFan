package com.kradcifer.sociofan.server;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.appengine.api.datastore.QueryResultIterator;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.Query;
import com.kradcifer.sociofan.server.domain.Fan;
import com.kradcifer.sociofan.server.domain.Reservation;
import com.kradcifer.sociofan.server.domain.Seat;
import com.kradcifer.sociofan.shared.SeatService;
import com.kradcifer.sociofan.shared.dto.GridReservationDTO;
import com.kradcifer.sociofan.shared.dto.GridReservationInfoDTO;
import com.kradcifer.sociofan.shared.dto.SaveReservationDTO;
import com.kradcifer.sociofan.shared.dto.SuggestionDTO;

@SuppressWarnings("serial")
public class SeatServiceServlet extends RemoteServiceServlet implements SeatService {
	
	private final MasterDAO dao = new MasterDAO();

	@Override
	public List<SuggestionDTO> requestSuggestions() {
		
		List<SuggestionDTO> result = new ArrayList<SuggestionDTO>();
		
		QueryResultIterator<Key<Seat>> it = dao.ofy().query(Seat.class).filter("available", true).fetchKeys().iterator();
		while (it.hasNext()) {
			
			Seat current = dao.ofy().get(it.next());
			
			SuggestionDTO suggestion = new SuggestionDTO();
			suggestion.entityId = current.getId();
			suggestion.text = current.getCode();
			
			result.add(suggestion);
		}
		
		return result;
	}

	@Override
	public void saveReservation(SaveReservationDTO saveReservation) throws Exception {
		
		if (saveReservation.fanId == null)
			throw new Exception("O torcedor selecionado não existe.");
		
		if (saveReservation.seatId == null) {
			
			Seat seat = new Seat();
			seat.setAvailable(true);
			seat.setCode(saveReservation.seatCode);
			dao.ofy().put(seat);
			saveReservation.seatId = seat.getId();
			
			// TODO: For now we will create the seat. We are missing the seat handling module.
//			throw new Exception("A cadeira selecionada não existe.");
		}
		
		boolean available = dao.ofy().query(Reservation.class)
								.filter("gameDate", saveReservation.gameDate)
								.filter("seat.id", saveReservation.seatId).count() == 0;
		
		if (!available)
			throw new Exception("O lugar selecionado não está disponível para a data do jogo.");
		
		Reservation reservation = new Reservation();
		
		reservation.setFan(dao.ofy().query(Fan.class).filter("id", saveReservation.fanId).getKey());
		reservation.setSeat(dao.ofy().query(Seat.class).filter("id", saveReservation.seatId).getKey());
		reservation.setGameDate(saveReservation.gameDate);
		
		dao.ofy().put(reservation);
	}

	@Override
	public GridReservationInfoDTO getReservations(Date date, String seatCode, String login) {
		
		GridReservationInfoDTO result = new GridReservationInfoDTO();
		
		Query<Reservation> query = dao.ofy().query(Reservation.class);
		
		result.totalReservations = query.count();
		
		if (date != null)
			query = query.filter("gameDate", date);
		
		if (seatCode != null && !seatCode.equals(""))
			query = query.filter("seat.code", seatCode);
		
		if (login != null && !login.equals(""))
			query = query.filter("fan.fanInfo.email", login);
		
		query = query.order("gameDate");
		
		result.reservations = new ArrayList<GridReservationDTO>();;
		
		QueryResultIterator<Key<Reservation>> it = query.fetchKeys().iterator();
		while (it.hasNext()) {
			
			Reservation current = dao.ofy().get(it.next());
			
			GridReservationDTO dto = new GridReservationDTO();
			dto.reservationId = current.getId();
			dto.date = current.getGameDate();
			dto.seatCode = dao.ofy().get(current.getSeat()).getCode();
			dto.fanEmail = dao.ofy().get(current.getFan()).getFanInfo().getEmail();
			
			result.reservations.add(dto);
		}
		
		return result;
	}

	@Override
	public void delete(Long reservationId) {
		dao.ofy().delete(Reservation.class, reservationId);
	}

}
