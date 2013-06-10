package com.kradcifer.sociofan.client.mvp.reservations.addedit;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.FormElement;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.MultiWordSuggestOracle;
import com.google.gwt.user.client.ui.SuggestBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DateBox;
import com.kradcifer.sociofan.client.mvp.View;

public class AddEditReservationView extends Composite implements View {

	private static AddEditReservationViewUiBinder uiBinder = GWT.create(AddEditReservationViewUiBinder.class);

	interface AddEditReservationViewUiBinder extends
			UiBinder<Widget, AddEditReservationView> {
	}

	public AddEditReservationView() {
		
		suggestFan = new SuggestBox(fanOracle);
		suggestSeat = new SuggestBox(seatOracle);
		
		initWidget(uiBinder.createAndBindUi(this));
		
		suggestFan.getElement().setAttribute("placeholder", "Digite o nome do torcedor");
		
		gameDate.setFormat(new DateBox.DefaultFormat(DateTimeFormat.getFormat("dd/MM/yyyy")));
	}
	
	@UiField FormElement formElement;
	
	final MultiWordSuggestOracle fanOracle = new MultiWordSuggestOracle();
	@UiField(provided = true) SuggestBox suggestFan;
	
	final MultiWordSuggestOracle seatOracle = new MultiWordSuggestOracle();
	@UiField(provided = true) SuggestBox suggestSeat;
	
	@UiField DateBox gameDate;
	
	@UiField Button apply;

}
