package com.kradcifer.sociofan.client;

import com.kradcifer.sociofan.shared.FanServiceAsync;
import com.kradcifer.sociofan.shared.LoginServiceAsync;
import com.kradcifer.sociofan.shared.SeatServiceAsync;

public abstract class Environment {
	
	private final History history;
	
	private final FanServiceAsync fanService;
	private final SeatServiceAsync seatService;
	private final LoginServiceAsync loginService;

	public Environment(History _History, FanServiceAsync _FanService, SeatServiceAsync _SeatService, LoginServiceAsync _LoginService) {
		history = _History;
		fanService =_FanService;
		seatService = _SeatService;
		loginService = _LoginService;
	}
	
	public History getHistory() {
		return history;
	}

	public FanServiceAsync getFanService() {
		return fanService;
	}

	public SeatServiceAsync getSeatService() {
		return seatService;
	}

	public LoginServiceAsync getLoginService() {
		return loginService;
	}
	
}
