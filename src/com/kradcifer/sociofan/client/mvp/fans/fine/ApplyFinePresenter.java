package com.kradcifer.sociofan.client.mvp.fans.fine;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HasWidgets;
import com.kradcifer.sociofan.client.Environment;
import com.kradcifer.sociofan.client.mvp.Presenter;
import com.kradcifer.sociofan.shared.dto.ApplyFineDTO;
import com.kradcifer.sociofan.shared.dto.SaveFanDTO;

@SuppressWarnings("static-access")
public class ApplyFinePresenter extends Presenter<ApplyFineView> {

	public ApplyFinePresenter(Environment _Env, ApplyFineView _View, HasWidgets _Slot) {
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
			loadFanLogin();
	}
	
	@Override
	protected void clear() {
		fanId = null;
		getView().formElement.reset();
	}

	@Override
	protected void initPresenter() {

		getView().apply.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				save();
			}
		});
	}

	protected void save() {
		
		ApplyFineDTO applyFineDTO = new ApplyFineDTO();
		applyFineDTO.fanId = fanId;

		applyFineDTO.description = getView().description.getValue();
		
		String valueStr = getView().value.getValue();
		try {
			applyFineDTO.value = Double.parseDouble(valueStr);
		} catch (NumberFormatException e) {
			Window.alert("'" + valueStr + "' não é um valor válido.");
			return;
		}
		
		applyFineDTO.when = getView().when.getValue();
		
		getEnv().getFanService().applyFine(applyFineDTO, new AsyncCallback<Void>() {

			@Override
			public void onSuccess(Void result) {
				getEnv().getHistory().back();
			}

			@Override
			public void onFailure(Throwable caught) {
				Window.alert(caught.getMessage());
				caught.printStackTrace();
			}
		});
	}
	
	private void loadFanLogin() {
		
		getEnv().getFanService().getFan(fanId, new AsyncCallback<SaveFanDTO>() {

			@Override
			public void onSuccess(SaveFanDTO result) {
				getView().login.setText(result.email);
			}

			@Override
			public void onFailure(Throwable caught) {
				Window.alert(caught.getMessage());
			}
		});
	}

}
