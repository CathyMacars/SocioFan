package com.kradcifer.sociofan.client.mvp.reservations;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class GridReservationActionsWidget extends Composite {

	private static GridReservationActionsWidgetUiBinder uiBinder = GWT
			.create(GridReservationActionsWidgetUiBinder.class);

	interface GridReservationActionsWidgetUiBinder extends
			UiBinder<Widget, GridReservationActionsWidget> {
	}

	public GridReservationActionsWidget() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@UiField Anchor exclude;

}
