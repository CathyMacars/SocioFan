package com.kradcifer.sociofan.client.login;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HasWidgets;
import com.kradcifer.sociofan.client.Environment;
import com.kradcifer.sociofan.client.mvp.Presenter;

@SuppressWarnings("static-access")
public class LoginPresenter extends Presenter<LoginView> {

	public LoginPresenter(Environment _Env, LoginView _View, HasWidgets _Slot) {
		super(_Env, _View, _Slot);
	}
	
	@Override
	protected void initPresenter() {
		
		getView().enter.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				login();
			}
		});
	}

	protected void login() {
		
		getEnv().getLoginService().login(getView().login.getValue(), getView().pass.getValue(), new AsyncCallback<Void>() {
			
			@Override
			public void onSuccess(Void result) {
				getEnv().getHistory().newItem(MAIN);
			}
			
			@Override
			public void onFailure(Throwable caught) {
				Window.alert(caught.getMessage());
			}
		});
	}

}
