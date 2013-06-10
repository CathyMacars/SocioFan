package com.kradcifer.sociofan.client.mvp.fans.fine;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.FormElement;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DateBox;
import com.kradcifer.sociofan.client.mvp.View;

public class ApplyFineView extends Composite implements View {

	private static ApplyFineViewUiBinder uiBinder = GWT.create(ApplyFineViewUiBinder.class);

	interface ApplyFineViewUiBinder extends UiBinder<Widget, ApplyFineView> {
	}

	public ApplyFineView() {
		initWidget(uiBinder.createAndBindUi(this));
		
		when.setFormat(new DateBox.DefaultFormat(DateTimeFormat.getFormat("dd/MM/yyyy")));
	}
	
	@UiField FormElement formElement;
	@UiField Label login;
	
	@UiField TextArea description;
	@UiField TextBox value;
	@UiField DateBox when;
	
	@UiField Button apply;
	
}
