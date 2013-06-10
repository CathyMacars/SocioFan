package com.kradcifer.sociofan.shared;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.kradcifer.sociofan.shared.dto.SaveReservationsDTO;
import com.kradcifer.sociofan.shared.dto.SuggestionDTO;

public interface SeatServiceAsync {

	void requestSuggestions(AsyncCallback<List<SuggestionDTO>> asyncCallback);

	void saveReservation(SaveReservationsDTO saveReservation, AsyncCallback<Void> asyncCallback);

}
