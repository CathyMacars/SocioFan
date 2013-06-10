package com.kradcifer.sociofan.client.login;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.kradcifer.sociofan.client.mvp.View;

public class LoginView extends Composite implements View {

	private static LoginViewUiBinder uiBinder = GWT
			.create(LoginViewUiBinder.class);

	interface LoginViewUiBinder extends UiBinder<Widget, LoginView> {
	}

	public LoginView() {
		initWidget(uiBinder.createAndBindUi(this));

		login.getElement().setAttribute("placeholder", "Email");
		pass.getElement().setAttribute("placeholder", "Senha");
	}
	
	@UiField TextBox login;
	@UiField PasswordTextBox pass;
	@UiField Button enter;

}
