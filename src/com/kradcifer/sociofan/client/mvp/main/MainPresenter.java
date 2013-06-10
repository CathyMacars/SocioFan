package com.kradcifer.sociofan.client.mvp.main;

import com.google.gwt.user.client.ui.HasWidgets;
import com.kradcifer.sociofan.client.Environment;
import com.kradcifer.sociofan.client.mvp.Presenter;

public class MainPresenter extends Presenter<MainView> {

	public MainPresenter(Environment _Env, MainView _View, HasWidgets _Slot) {
		super(_Env, _View, _Slot);
	}

	public HasWidgets getHistorySlot() {
		return getView().historySlot;
	}

	public HasWidgets getMenuSlot() {
		return getView().menuSlot;
	}
	
}
