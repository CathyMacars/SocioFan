package com.kradcifer.sociofan.client.mvp.reservations.addedit;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.MultiWordSuggestOracle;
import com.kradcifer.sociofan.client.Environment;
import com.kradcifer.sociofan.client.mvp.Presenter;
import com.kradcifer.sociofan.shared.FanModality;
import com.kradcifer.sociofan.shared.dto.SaveReservationDTO;
import com.kradcifer.sociofan.shared.dto.SuggestionDTO;

@SuppressWarnings("static-access")
public class AddEditReservationPresenter extends Presenter<AddEditReservationView> {

	public AddEditReservationPresenter(Environment _Env, AddEditReservationView _View, HasWidgets _Slot) {
		super(_Env, _View, _Slot);
	}
	
	private Map<String, Long> fanKeys;
	private Map<String, Long> seatKeys;
	
	@Override
	protected void initPresenter() {
		
		getView().apply.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				save();
			}
		});
	}

	@Override
	protected void initDisplay() {
		
		// Here, we load all ALVINEGRO, because we can only make a reservation to this modality.
		getEnv().getFanService().requestSuggestions(
				FanModality.ALVINEGRO, suggestionsAsyncCallback(fanKeys, getView().fanOracle));
		
		getEnv().getSeatService().requestSuggestions(
				suggestionsAsyncCallback(seatKeys, getView().seatOracle));
	}

	private AsyncCallback<List<SuggestionDTO>> suggestionsAsyncCallback(final Map<String, Long> keys, final MultiWordSuggestOracle oracle) {
		return new AsyncCallback<List<SuggestionDTO>>() {

			@Override
			public void onSuccess(List<SuggestionDTO> result) {
				
				oracle.clear();
				for (SuggestionDTO current : result) {
					oracle.add(current.text);
					keys.put(current.text, current.entityId);
					System.out.println("current.text: " + current.text);
				}
			}

			@Override
			public void onFailure(Throwable caught) {
				caught.printStackTrace();
				Window.alert(caught.getMessage());
			}
		};
	}
	
	@Override
	protected void clear() {
		fanKeys = new HashMap<String, Long>();
		seatKeys = new HashMap<String, Long>();
		getView().formElement.reset();
	}
	
	private void save() {
		
		SaveReservationDTO saveReservation = new SaveReservationDTO();
		
		saveReservation.fanId = fanKeys.get(getView().suggestFan.getValue());
		saveReservation.seatId = seatKeys.get(getView().suggestSeat.getValue());
		saveReservation.gameDate = getView().gameDate.getValue();
		saveReservation.seatCode = getView().suggestSeat.getValue();
		
		getEnv().getSeatService().saveReservation(saveReservation, new AsyncCallback<Void>() {

			@Override
			public void onSuccess(Void result) {
				getEnv().getHistory().back();
			}

			@Override
			public void onFailure(Throwable caught) {
				Window.alert(caught.getMessage());
			}
		});
	}
	
}
