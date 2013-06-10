package com.kradcifer.sociofan.shared;

import java.util.Date;
import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.kradcifer.sociofan.shared.dto.GridReservationInfoDTO;
import com.kradcifer.sociofan.shared.dto.SaveReservationDTO;
import com.kradcifer.sociofan.shared.dto.SuggestionDTO;

@RemoteServiceRelativePath("seats")
public interface SeatService extends RemoteService {

	List<SuggestionDTO> requestSuggestions();

	void saveReservation(SaveReservationDTO saveReservation) throws Exception;

	GridReservationInfoDTO getReservations(Date date, String seatCode,
			String login);

	void delete(Long reservationId);

}
