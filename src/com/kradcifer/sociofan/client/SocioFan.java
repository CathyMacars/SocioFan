package com.kradcifer.sociofan.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.ui.RootPanel;
import com.kradcifer.sociofan.shared.FanService;
import com.kradcifer.sociofan.shared.FanServiceAsync;
import com.kradcifer.sociofan.shared.LoginService;
import com.kradcifer.sociofan.shared.LoginServiceAsync;
import com.kradcifer.sociofan.shared.SeatService;
import com.kradcifer.sociofan.shared.SeatServiceAsync;

public class SocioFan implements EntryPoint {
	
	public void onModuleLoad() {
		
		final FanServiceAsync fanService = GWT.create(FanService.class);
		final SeatServiceAsync seatService = GWT.create(SeatService.class);
		final LoginServiceAsync loginService = GWT.create(LoginService.class);
		
		new AppController(
				RootPanel.get("main"),
				new History(),
				fanService,
				seatService,
				loginService)
		.init();
		
	}
}
