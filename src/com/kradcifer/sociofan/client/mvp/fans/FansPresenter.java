package com.kradcifer.sociofan.client.mvp.fans;

import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Label;
import com.kradcifer.sociofan.client.Environment;
import com.kradcifer.sociofan.client.mvp.Presenter;
import com.kradcifer.sociofan.shared.FanModality;
import com.kradcifer.sociofan.shared.dto.GridFanDTO;
import com.kradcifer.sociofan.shared.dto.GridFanInfoDTO;

@SuppressWarnings("static-access")
public class FansPresenter extends Presenter<FansView> {

	public FansPresenter(Environment _Env, FansView _View, HasWidgets _Slot) {
		super(_Env, _View, _Slot);
	}

	@Override
	protected void initPresenter() {
		getView().addFan.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				getEnv().getHistory().newItem(ADD_FAN);
			}
		});
		
		getView().modalities.addChangeHandler(new ChangeHandler() {
			@Override
			public void onChange(ChangeEvent event) {
				loadFans();
			}
		});
		
		getView().login.addValueChangeHandler(new ValueChangeHandler<String>() {
			@Override
			public void onValueChange(ValueChangeEvent<String> event) {
				loadFans();
			}
		});
	}
	
	@Override
	protected void initDisplay() {
		loadFans();
	}

	private void loadFans() {
		
		for (int i = 1; i < getView().gridContent.getRowCount(); i++)
			getView().gridContent.removeRow(i);
		
		String typedLogin = getView().login.getValue().trim();
		String login = typedLogin.equals("") ? null : typedLogin;
		
		String fanModalityText = getView().modalities.getValue(getView().modalities.getSelectedIndex());
		FanModality fanModality = fanModalityText.equals("") ? null : FanModality.valueOf(fanModalityText);
		
		getEnv().getFanService().loadFans(login, fanModality, new AsyncCallback<GridFanInfoDTO>() {
			@Override
			public void onSuccess(GridFanInfoDTO result) {
				
				getView().fansQtt.setText(result.fans.size() + "/" + result.totalFans);
				
				for (int i = 0; i < result.fans.size(); i++) {
					
					final int index = i + 1; // Cause of the header.
					final GridFanDTO gridFan = result.fans.get(i);
					
					getView().gridContent.setWidget(index, 0, new Label(gridFan.login));
					getView().gridContent.setWidget(index, 1, new Label(gridFan.fanModality.label));
					
					GridFanActionsWidget fanActions = new GridFanActionsWidget();
					getView().gridContent.setWidget(index, 2, fanActions);
					
					fanActions.edit.addClickHandler(new ClickHandler() {
						@Override
						public void onClick(ClickEvent event) {
							getEnv().getHistory().newItem(EDIT_FAN, gridFan.fanId);
						}
					});

					fanActions.exclude.addClickHandler(new ClickHandler() {
						@Override
						public void onClick(ClickEvent event) {
							getEnv().getFanService().deleteFan(gridFan.fanId, new AsyncCallback<Void>() {
								@Override
								public void onSuccess(Void result) {
									getView().gridContent.removeRow(index);
								}
								@Override
								public void onFailure(Throwable caught) {
									Window.alert(caught.getMessage());
								}
							});
						}
					});
					
					fanActions.applyFine.addClickHandler(new ClickHandler() {
						@Override
						public void onClick(ClickEvent event) {
							getEnv().getHistory().newItem(APPLY_FINE, gridFan.fanId);
						}
					});
				}
			}

			@Override
			public void onFailure(Throwable caught) {
				Window.alert(caught.getMessage());
			}
		});
	}
}
