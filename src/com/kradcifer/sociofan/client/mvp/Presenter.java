package com.kradcifer.sociofan.client.mvp;

import com.google.gwt.user.client.ui.HasWidgets;
import com.kradcifer.sociofan.client.Environment;

public abstract class Presenter<V extends View> implements PlaceTokens {
	
	private final Environment env;
	private final V view;
	
	private final HasWidgets slot;
	private String param;
	
	public Presenter(Environment _Env, V _View, HasWidgets _Slot) {
		env = _Env;
		view =_View;
		slot = _Slot;
		initPresenter();
	}
	
	public void go() {
		go(null);
	}
	
	public void go(String _Param) {
		slot.clear();
		slot.add(view.asWidget());
		clear();
		
		param = _Param;
		
		initDisplay();
	}
	
	protected void clear() {
	}
	
	protected void initDisplay() {
	}
	
	protected void initPresenter() {
	}

	public Environment getEnv() {
		return env;
	}

	public V getView() {
		return view;
	}

	public String getParam() {
		return param;
	}
}
