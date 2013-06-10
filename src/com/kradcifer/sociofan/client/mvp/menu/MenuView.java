package com.kradcifer.sociofan.client.mvp.menu;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.kradcifer.sociofan.client.mvp.View;

public class MenuView extends Composite implements View {

	private static MenuViewUiBinder uiBinder = GWT.create(MenuViewUiBinder.class);

	interface MenuViewUiBinder extends UiBinder<Widget, MenuView> {
	}

	public MenuView() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@UiField Anchor fans;
	@UiField Anchor reservations;
	
}
