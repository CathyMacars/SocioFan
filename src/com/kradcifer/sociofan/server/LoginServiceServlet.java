package com.kradcifer.sociofan.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.kradcifer.sociofan.shared.LoginService;

@SuppressWarnings("serial")
public class LoginServiceServlet extends RemoteServiceServlet implements LoginService {

	private static final String CORRECT_LOGIN 	= "admin";
	private static final String CORRECT_PASS 	= "admin";
	
	@Override
	public void login(String login, String pass) throws Exception {
		
		if ( !(login.equals(CORRECT_LOGIN) && pass.equals(CORRECT_PASS)))
			throw new Exception("Email e/ou senha incorretos.");
	}

}
