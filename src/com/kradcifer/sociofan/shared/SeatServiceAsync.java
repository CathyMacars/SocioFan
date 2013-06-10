package com.kradcifer.sociofan.shared;

import java.util.Date;
import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.kradcifer.sociofan.shared.dto.GridReservationInfoDTO;
import com.kradcifer.sociofan.shared.dto.SaveReservationDTO;
import com.kradcifer.sociofan.shared.dto.SuggestionDTO;

public interface SeatServiceAsync {

	void requestSuggestions(AsyncCallback<List<SuggestionDTO>> asyncCallback);

	void saveReservation(SaveReservationDTO saveReservation, AsyncCallback<Void> asyncCallback);

	void getReservations(Date date, String seatCode, String login,
			AsyncCallback<GridReservationInfoDTO> asyncCallback);

	void delete(Long reservationId, AsyncCallback<Void> asyncCallback);

}
