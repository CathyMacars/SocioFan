package com.kradcifer.sociofan.shared;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.kradcifer.sociofan.shared.dto.SaveReservationsDTO;
import com.kradcifer.sociofan.shared.dto.SuggestionDTO;

@RemoteServiceRelativePath("seats")
public interface SeatService extends RemoteService {

	List<SuggestionDTO> requestSuggestions();

	void saveReservation(SaveReservationsDTO saveReservation) throws Exception;

}
