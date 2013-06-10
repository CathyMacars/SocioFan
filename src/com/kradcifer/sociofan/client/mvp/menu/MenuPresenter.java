package com.kradcifer.sociofan.client.mvp.menu;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.HasWidgets;
import com.kradcifer.sociofan.client.Environment;
import com.kradcifer.sociofan.client.mvp.Presenter;

@SuppressWarnings("static-access")
public class MenuPresenter extends Presenter<MenuView> {

	public MenuPresenter(Environment _Env, MenuView _View, HasWidgets _Slot) {
		super(_Env, _View, _Slot);
	}
	
	@Override
	protected void initPresenter() {
		
		getView().fans.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				getEnv().getHistory().newItem(FANS);
			}
		});
		
		getView().reservations.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				getEnv().getHistory().newItem(RESERVATIONS);
			}
		});
	}
}
