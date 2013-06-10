package com.kradcifer.sociofan.client;

public class History extends com.google.gwt.user.client.History {
	
	public void newItem(String token, Object param) {
		newItem(token + "=" + param);
	}
	
}
