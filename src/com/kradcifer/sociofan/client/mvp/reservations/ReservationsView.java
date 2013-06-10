package com.kradcifer.sociofan.client.mvp.reservations;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DateBox;
import com.kradcifer.sociofan.client.mvp.View;

public class ReservationsView extends Composite implements View {

	private static ReservationsViewUiBinder uiBinder = GWT.create(ReservationsViewUiBinder.class);

	interface ReservationsViewUiBinder extends UiBinder<Widget, ReservationsView> {
	}

	public ReservationsView() {
		initWidget(uiBinder.createAndBindUi(this));
		
		gridContent.setWidget(0, 0, new HTML("<th>Data</th>"));
		gridContent.setWidget(0, 1, new HTML("<th>Cod. Cadeira</th>"));
		gridContent.setWidget(0, 2, new HTML("<th>Torcedor</th>"));
		gridContent.setWidget(0, 3, reservationsQtt);
		
		date.getTextBox().getElement().setAttribute("placeholder", "Filtrar por data...");
		seatCode.getElement().setAttribute("placeholder", "Filtrar por cód. cadeira...");
		login.getElement().setAttribute("placeholder", "Filtrar por torcedor...");
		
		date.setFormat(new DateBox.DefaultFormat(DateTimeFormat.getFormat("dd/MM/yyyy")));
	}
	
	@UiField Button addReservation;

	@UiField DateBox date;
	@UiField TextBox seatCode;
	@UiField TextBox login;
	
	HTML reservationsQtt = new HTML();
	@UiField FlexTable gridContent;
	
}
