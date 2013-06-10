package com.kradcifer.sociofan.server;

import java.util.ArrayList;
import java.util.List;

import com.google.appengine.api.datastore.QueryResultIterator;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.Query;
import com.kradcifer.sociofan.server.domain.Fan;
import com.kradcifer.sociofan.server.domain.FanInfo;
import com.kradcifer.sociofan.server.domain.Fine;
import com.kradcifer.sociofan.shared.FanModality;
import com.kradcifer.sociofan.shared.FanService;
import com.kradcifer.sociofan.shared.dto.ApplyFineDTO;
import com.kradcifer.sociofan.shared.dto.GridFanDTO;
import com.kradcifer.sociofan.shared.dto.GridFanInfoDTO;
import com.kradcifer.sociofan.shared.dto.SaveFanDTO;
import com.kradcifer.sociofan.shared.dto.SuggestionDTO;

@SuppressWarnings("serial")
public class FanServiceServlet extends RemoteServiceServlet implements FanService {

	private final MasterDAO dao = new MasterDAO();
	
	@Override
	public void saveFan(SaveFanDTO saveFanDTO) {
		
		Fan fan;

		Long fanId = saveFanDTO.fanId;
		if (fanId != null) {
			fan = dao.ofy().get(Fan.class, fanId);
		} else {
			fan = new Fan();
		}
		
		FanInfo fanInfo = new FanInfo();
		fanInfo.setEmail(saveFanDTO.email);
		fanInfo.setAddress(saveFanDTO.address);
		fanInfo.setBirth(saveFanDTO.birth);
		fanInfo.setCellular(saveFanDTO.cellular);
		fanInfo.setCity(saveFanDTO.city);
		fanInfo.setCommercialPhone(saveFanDTO.commercialPhone);
		fanInfo.setComp(saveFanDTO.comp);
		fanInfo.setCpf(saveFanDTO.cpf);
		fanInfo.setDistrict(saveFanDTO.district);
		fanInfo.setEmail(saveFanDTO.email);
		fanInfo.setFathersName(saveFanDTO.fathersName);
		fanInfo.setGender(saveFanDTO.gender);
		fanInfo.setJob(saveFanDTO.job);
		fanInfo.setMaritalStatus(saveFanDTO.maritalStatus);
		fanInfo.setMonthlyValue(saveFanDTO.monthlyValue);
		fanInfo.setMothersName(saveFanDTO.mothersName);
		fanInfo.setName(saveFanDTO.name);
		fanInfo.setRegDate(saveFanDTO.regDate);
		fanInfo.setResidencialPhone(saveFanDTO.residencialPhone);
		fanInfo.setRg(saveFanDTO.rg);
		fanInfo.setZip(saveFanDTO.zip);
		
		fan.setFanInfo(fanInfo);
		fan.setFanModality(saveFanDTO.fanModality);
		
		dao.ofy().put(fan);
	}

	@Override
	public GridFanInfoDTO loadFans(String login, FanModality fanModality) {
		
		GridFanInfoDTO response = new GridFanInfoDTO();
		
		Query<Fan> query = dao.ofy().query(Fan.class);
		int totalFans = query.count();
		
		if (login != null)
			query = query.filter("fanInfo.email", login);
		
		if (fanModality != null)
			query = query.filter("fanModality", fanModality);
		
		List<Fan> fans = query.list();

		List<GridFanDTO> gridFans = new ArrayList<GridFanDTO>();
		for (Fan fan : fans) {
			
			GridFanDTO current = new GridFanDTO();
			current.fanId = fan.getId();
			current.fanModality = fan.getFanModality();
			current.login = fan.getFanInfo().getEmail();
			
			gridFans.add(current);
		}
		
		response.totalFans = totalFans;
		response.fans = gridFans;
		
		return response;
	}

	@Override
	public void deleteFan(Long fanId) {
		dao.ofy().delete(Fan.class, fanId);
	}

	@Override
	public SaveFanDTO getFan(Long fanId) {
		
		Fan fan;

		if (fanId != null) {
			fan = dao.ofy().get(Fan.class, fanId);
		} else {
			fan = new Fan();
		}
		
		SaveFanDTO response = new SaveFanDTO();
		
		response.fanId = fan.getId();
		response.fanModality = fan.getFanModality();

		FanInfo fanInfo = fan.getFanInfo();
		response.address = fanInfo.getAddress();
		response.birth = fanInfo.getBirth();
		response.cellular = fanInfo.getCellular();
		response.city = fanInfo.getCity();
		response.commercialPhone = fanInfo.getCommercialPhone();
		response.comp = fanInfo.getComp();
		response.cpf = fanInfo.getCpf();
		response.district = fanInfo.getDistrict();
		response.email = fanInfo.getEmail();
		response.fathersName = fanInfo.getFathersName();
		response.gender = fanInfo.getGender();
		response.job = fanInfo.getJob();
		response.maritalStatus = fanInfo.getMaritalStatus();
		response.monthlyValue = fanInfo.getMonthlyValue();
		response.mothersName = fanInfo.getMothersName();
		response.name = fanInfo.getName();
		response.regDate = fanInfo.getRegDate();
		response.residencialPhone = fanInfo.getResidencialPhone();
		response.rg = fanInfo.getRg();
		response.zip = fanInfo.getZip();
		
		return response;
	}

	@Override
	public void applyFine(ApplyFineDTO applyFineDTO) {
		
		Fan fan = dao.ofy().get(Fan.class, applyFineDTO.fanId);
		
		List<Fine> fines = fan.getFines();
		if (fines == null)
			fines = new ArrayList<Fine>();
		
		Fine fine = new Fine();
		fine.setDescription(applyFineDTO.description);
		fine.setValue(applyFineDTO.value);
		fine.setWhen(applyFineDTO.when);
		fines.add(fine);
		
		fan.setFines(fines);
		dao.ofy().put(fan);
	}

	@Override
	public List<SuggestionDTO> requestSuggestions(FanModality fanModality) {
		
		List<SuggestionDTO> result = new ArrayList<SuggestionDTO>();
		
		QueryResultIterator<Key<Fan>> it = dao.ofy().query(Fan.class).filter("fanModality", fanModality).fetchKeys().iterator();
		while (it.hasNext()) {
			
			Fan current = dao.ofy().get(it.next());
			
			SuggestionDTO suggestion = new SuggestionDTO();
			suggestion.entityId = current.getId();
			suggestion.text = current.getFanInfo().getEmail();
			
			result.add(suggestion);
		}
		
		return result;
	}

}
