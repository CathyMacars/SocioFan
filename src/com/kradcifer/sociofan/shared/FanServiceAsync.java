package com.kradcifer.sociofan.shared;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.kradcifer.sociofan.shared.dto.ApplyFineDTO;
import com.kradcifer.sociofan.shared.dto.GridFanInfoDTO;
import com.kradcifer.sociofan.shared.dto.SaveFanDTO;
import com.kradcifer.sociofan.shared.dto.SuggestionDTO;

public interface FanServiceAsync {

	void saveFan(SaveFanDTO saveFanDTO, AsyncCallback<Void> callback);

	void loadFans(String login, FanModality fanModality,
			AsyncCallback<GridFanInfoDTO> asyncCallback);

	void deleteFan(Long fanId, AsyncCallback<Void> asyncCallback);

	void getFan(Long fanId, AsyncCallback<SaveFanDTO> asyncCallback);

	void applyFine(ApplyFineDTO applyFineDTO, AsyncCallback<Void> asyncCallback);

	void requestSuggestions(FanModality fanModality, AsyncCallback<List<SuggestionDTO>> asyncCallback);

}
