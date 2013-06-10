package com.kradcifer.sociofan.client.mvp.reservations;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Widget;
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
	}
	
	@UiField Button addReservation;

	HTML reservationsQtt = new HTML();
	@UiField FlexTable gridContent;
	
}
