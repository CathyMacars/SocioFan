package com.kradcifer.sociofan.client.mvp.fans.addedit;

import java.util.Date;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HasWidgets;
import com.kradcifer.sociofan.client.Environment;
import com.kradcifer.sociofan.client.mvp.Presenter;
import com.kradcifer.sociofan.shared.FanModality;
import com.kradcifer.sociofan.shared.dto.SaveFanDTO;

@SuppressWarnings("static-access")
public class AddEditFanPresenter extends Presenter<AddEditFanView> {

	
	public AddEditFanPresenter(Environment _Env, AddEditFanView _View, HasWidgets _Slot) {
		super(_Env, _View, _Slot);
	}

	private Long fanId;
	
	@Override
	protected void initDisplay() {
		
		try {
			fanId = new Long(getParam());
		} catch (Exception e) {
			// No param.
			getEnv().getHistory().back();
		}
		
		if (fanId != null)
			loadFan();
	}
	
	@Override
	protected void clear() {
		fanId = null;
		getView().formElement.reset();
	}
	
	@Override
	protected void initPresenter() {
		
		getView().save.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				save();
			}
		});
	}
	
	private void loadFan() {
		
		getEnv().getFanService().getFan(fanId, new AsyncCallback<SaveFanDTO>() {

			@Override
			public void onSuccess(SaveFanDTO result) {
				
				getView().fanName.setValue(result.name);
				getView().address.setValue(result.address);
				getView().comp.setValue(result.comp);
				getView().city.setValue(result.city);
				getView().district.setValue(result.district);
				getView().zip.setValue(result.zip);
				getView().birth.setValue(result.birth);
				getView().cellular.setValue(result.cellular);
				getView().commercialPhone.setValue(result.commercialPhone);
				getView().email.setValue(result.email);
				
				for (int i = 0; i < getView().modalities.getItemCount(); i++)
					if (getView().modalities.getValue(i).endsWith(result.fanModality.name())) {
						getView().modalities.setSelectedIndex(i);
						break;
					}

				getView().fathersName.setValue(result.fathersName);
				getView().radioMale.setValue(result.gender.equals(1));
				getView().job.setValue(result.job);
				
				for (int i = 0; i < getView().maritalStatus.getItemCount(); i++)
					if (getView().maritalStatus.getValue(i).endsWith(result.maritalStatus)) {
						getView().maritalStatus.setSelectedIndex(i);
						break;
					}

				getView().mothersName.setValue(result.mothersName);
				getView().residencialPhone.setValue(result.residencialPhone);
				getView().rg.setValue(result.rg);
				getView().cpf.setValue(result.cpf);
			}

			@Override
			public void onFailure(Throwable caught) {
				caught.printStackTrace();
			}
		});
	}

	private void save() {
		
		SaveFanDTO saveFanDTO = new SaveFanDTO();
		
		if (fanId != null) {
			saveFanDTO.fanId = fanId;
			saveFanDTO.regDate = new Date();
		}
		
		saveFanDTO.address = getView().address.getValue();
		saveFanDTO.comp = getView().comp.getValue();
		saveFanDTO.city = getView().city.getValue();
		saveFanDTO.district = getView().district.getValue();
		saveFanDTO.zip = getView().zip.getValue();
		saveFanDTO.birth = getView().birth.getValue();
		saveFanDTO.cellular = getView().cellular.getValue();
		saveFanDTO.commercialPhone = getView().commercialPhone.getValue();
		saveFanDTO.email = getView().email.getValue();
		saveFanDTO.fanModality = FanModality.valueOf(getView().modalities.getValue(getView().modalities.getSelectedIndex()));
		saveFanDTO.fathersName = getView().fathersName.getValue();
		
		saveFanDTO.gender = getView().radioMale.getValue()? 1 : 0;
		saveFanDTO.job = getView().job.getValue();
		saveFanDTO.maritalStatus = getView().maritalStatus.getValue(getView().maritalStatus.getSelectedIndex());

		saveFanDTO.mothersName = getView().mothersName.getValue();
		saveFanDTO.name = getView().fanName.getValue();
		saveFanDTO.residencialPhone = getView().residencialPhone.getValue();
		saveFanDTO.rg = getView().rg.getValue();
		saveFanDTO.cpf = getView().cpf.getValue();
		
		getEnv().getFanService().saveFan(saveFanDTO, new AsyncCallback<Void>() {

			@Override
			public void onSuccess(Void result) {
				getEnv().getHistory().back();
			}

			@Override
			public void onFailure(Throwable caught) {
				caught.printStackTrace();
			}
		});
		
	}
}
