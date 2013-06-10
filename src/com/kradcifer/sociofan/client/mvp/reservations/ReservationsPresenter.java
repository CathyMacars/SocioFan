package com.kradcifer.sociofan.client.mvp.reservations;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.HasWidgets;
import com.kradcifer.sociofan.client.Environment;
import com.kradcifer.sociofan.client.mvp.Presenter;

@SuppressWarnings("static-access")
public class ReservationsPresenter extends Presenter<ReservationsView> {

	public ReservationsPresenter(Environment _Env, ReservationsView _View, HasWidgets _Slot) {
		super(_Env, _View, _Slot);
	}
	
	@Override
	protected void initPresenter() {
		getView().addReservation.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				getEnv().getHistory().newItem(ADD_RESERVATION);
			}
		});
	}
	
	@Override
	protected void initDisplay() {
		loadReservations();
	}

	private void loadReservations() {
		// TODO Auto-generated method stub
//		index++; // Cause of the header.
//		
//		gridContent.setWidget(index, 0, new Label(date));
//		gridContent.setWidget(index, 1, new Label(seatCode));
//		gridContent.setWidget(index, 2, new Label(login));
//		
//		GridReservationActionsWidget widget = new GridReservationActionsWidget();
//		gridContent.setWidget(index, 3, widget);
	}
	
}
