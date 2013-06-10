package com.kradcifer.sociofan.client.mvp.reservations;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Label;
import com.kradcifer.sociofan.client.Environment;
import com.kradcifer.sociofan.client.mvp.Presenter;
import com.kradcifer.sociofan.shared.dto.GridReservationDTO;
import com.kradcifer.sociofan.shared.dto.GridReservationInfoDTO;

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

		for (int i = 1; i < getView().gridContent.getRowCount(); i++)
			getView().gridContent.removeRow(i);
		
		getEnv().getSeatService().getReservations(
				getView().date.getValue(), 
				getView().seatCode.getValue(), 
				getView().login.getValue(), new AsyncCallback<GridReservationInfoDTO>() {

			@Override
			public void onSuccess(GridReservationInfoDTO result) {
				
				getView().reservationsQtt.setText(result.reservations.size() + "/" + result.totalReservations);
				DateTimeFormat format = DateTimeFormat.getFormat("dd/MM/yyyy");
				
				for (int i = 0; i < result.reservations.size(); i++) {

					final int index = i + 1; // Cause of the header.
					final GridReservationDTO current = result.reservations.get(i);

					getView().gridContent.setWidget(index, 0, new Label(format.format(current.date)));
					getView().gridContent.setWidget(index, 1, new Label(current.seatCode));
					getView().gridContent.setWidget(index, 2, new Label(current.fanEmail));
					
					GridReservationActionsWidget widget = new GridReservationActionsWidget();
					getView().gridContent.setWidget(index, 3, widget);
					
					widget.exclude.addClickHandler(new ClickHandler() {
						@Override
						public void onClick(ClickEvent event) {
							getEnv().getSeatService().delete(current.reservationId, new AsyncCallback<Void>() {
								@Override
								public void onSuccess(Void result) {
									getView().gridContent.removeRow(index);
								}
								@Override
								public void onFailure(Throwable caught) {
									Window.alert(caught.getMessage());
								}
							});
						}
					});
				}
			}

			@Override
			public void onFailure(Throwable caught) {
				Window.alert(caught.getMessage());
			}
		});
		
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
