package com.kradcifer.sociofan.client.mvp.fans;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.kradcifer.sociofan.client.mvp.View;
import com.kradcifer.sociofan.shared.FanModality;

public class FansView extends Composite implements View {

	private static FansViewUiBinder uiBinder = GWT.create(FansViewUiBinder.class);

	interface FansViewUiBinder extends UiBinder<Widget, FansView> {
	}

	public FansView() {
		initWidget(uiBinder.createAndBindUi(this));
		
		gridContent.setWidget(0, 0, new HTML("<th>Login</th>"));
		gridContent.setWidget(0, 1, new HTML("<th>Modalidade</th>"));
		gridContent.setWidget(0, 2, fansQtt);

		modalities.addItem("Filtrar por modalidade", "");
		for (FanModality modality : FanModality.values()) {
			modalities.addItem(modality.label, modality.name());
		}
		
		login.getElement().setAttribute("placeHolder", "Filtrar por login...");
	}
	
	@UiField Button addFan;
	
	HTML fansQtt = new HTML();
	@UiField FlexTable gridContent;
	
	@UiField ListBox modalities;
	@UiField TextBox login;
	
}
