package com.kradcifer.sociofan.shared;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.kradcifer.sociofan.shared.dto.ApplyFineDTO;
import com.kradcifer.sociofan.shared.dto.GridFanInfoDTO;
import com.kradcifer.sociofan.shared.dto.SaveFanDTO;
import com.kradcifer.sociofan.shared.dto.SuggestionDTO;

@RemoteServiceRelativePath("fans")
public interface FanService extends RemoteService {

	void saveFan(SaveFanDTO saveFanDTO);

	GridFanInfoDTO loadFans(String login, FanModality fanModality);

	void deleteFan(Long fanId);

	SaveFanDTO getFan(Long fanId);

	void applyFine(ApplyFineDTO applyFineDTO);

	List<SuggestionDTO> requestSuggestions(FanModality fanModality);

}
