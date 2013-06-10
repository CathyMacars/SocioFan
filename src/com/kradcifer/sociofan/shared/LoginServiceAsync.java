package com.kradcifer.sociofan.shared;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface LoginServiceAsync {

	void login(String login, String pass, AsyncCallback<Void> callback);

}
