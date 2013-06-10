package com.kradcifer.sociofan.client.mvp.fans;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class GridFanActionsWidget extends Composite {

	private static GridFanActionsUiBinder uiBinder = GWT
			.create(GridFanActionsUiBinder.class);

	interface GridFanActionsUiBinder extends UiBinder<Widget, GridFanActionsWidget> {
	}

	public GridFanActionsWidget() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@UiField Anchor edit;
	@UiField Anchor exclude;
	@UiField Anchor applyFine;
	
}
