package com.kradcifer.sociofan.server;

import java.util.ArrayList;
import java.util.List;

import com.google.appengine.api.datastore.QueryResultIterator;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.googlecode.objectify.Key;
import com.kradcifer.sociofan.server.domain.Fan;
import com.kradcifer.sociofan.server.domain.Reservation;
import com.kradcifer.sociofan.server.domain.Seat;
import com.kradcifer.sociofan.shared.SeatService;
import com.kradcifer.sociofan.shared.dto.SaveReservationsDTO;
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
	public void saveReservation(SaveReservationsDTO saveReservation) throws Exception {
		
		if (saveReservation.fanId == null)
			throw new Exception("O torcedor selecionado não existe.");
		
		if (saveReservation.seatId == null)
			throw new Exception("A cadeira selecionada não existe.");
		
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

}
