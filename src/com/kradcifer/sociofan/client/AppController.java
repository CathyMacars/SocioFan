package com.kradcifer.sociofan.client;

import java.util.HashMap;
import java.util.Map;

import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.ui.HasWidgets;
import com.kradcifer.sociofan.client.login.LoginPresenter;
import com.kradcifer.sociofan.client.login.LoginView;
import com.kradcifer.sociofan.client.mvp.PlaceTokens;
import com.kradcifer.sociofan.client.mvp.Presenter;
import com.kradcifer.sociofan.client.mvp.fans.FansPresenter;
import com.kradcifer.sociofan.client.mvp.fans.FansView;
import com.kradcifer.sociofan.client.mvp.fans.addedit.AddEditFanPresenter;
import com.kradcifer.sociofan.client.mvp.fans.addedit.AddEditFanView;
import com.kradcifer.sociofan.client.mvp.fans.fine.ApplyFinePresenter;
import com.kradcifer.sociofan.client.mvp.fans.fine.ApplyFineView;
import com.kradcifer.sociofan.client.mvp.main.MainPresenter;
import com.kradcifer.sociofan.client.mvp.main.MainView;
import com.kradcifer.sociofan.client.mvp.menu.MenuPresenter;
import com.kradcifer.sociofan.client.mvp.menu.MenuView;
import com.kradcifer.sociofan.client.mvp.reservations.ReservationsPresenter;
import com.kradcifer.sociofan.client.mvp.reservations.ReservationsView;
import com.kradcifer.sociofan.client.mvp.reservations.addedit.AddEditReservationPresenter;
import com.kradcifer.sociofan.client.mvp.reservations.addedit.AddEditReservationView;
import com.kradcifer.sociofan.shared.FanServiceAsync;
import com.kradcifer.sociofan.shared.LoginServiceAsync;
import com.kradcifer.sociofan.shared.SeatServiceAsync;

@SuppressWarnings({ "rawtypes", "static-access" })
public class AppController extends Environment implements ValueChangeHandler<String>, PlaceTokens {

	private final Map<String, Presenter> presenters = new HashMap<String, Presenter>();
	private final HasWidgets mainSlot;
	
	public AppController(HasWidgets _MainSlot, History _History, FanServiceAsync _FanService, SeatServiceAsync _SeatService, LoginServiceAsync _LoginService) {
		super(_History, _FanService, _SeatService, _LoginService);
		
		mainSlot = _MainSlot;
	}
	
	protected void init() {
		getHistory().addValueChangeHandler(this);
		
		MainPresenter mainPresenter = new MainPresenter(this, new MainView(), mainSlot);
		presenters.put(MAIN, mainPresenter);
		
		MenuPresenter menuPresenter = new MenuPresenter(this, new MenuView(), mainPresenter.getMenuSlot());
		menuPresenter.go();
		
		ReservationsPresenter reservationsPresenter = 
				new ReservationsPresenter(this, new ReservationsView(), mainPresenter.getHistorySlot());
		presenters.put(RESERVATIONS, reservationsPresenter);
		
		FansPresenter fansPresenter = new FansPresenter(this, new FansView(), mainPresenter.getHistorySlot());
		presenters.put(FANS, fansPresenter);
		
		AddEditReservationPresenter addEditReservationPresenter = 
				new AddEditReservationPresenter(this, new AddEditReservationView(), mainPresenter.getHistorySlot());
		presenters.put(ADD_RESERVATION, addEditReservationPresenter);
		
		AddEditFanPresenter addEditFanPresenter = 
				new AddEditFanPresenter(this, new AddEditFanView(), mainPresenter.getHistorySlot());
		presenters.put(ADD_FAN, addEditFanPresenter);
		presenters.put(EDIT_FAN, addEditFanPresenter);
		
		ApplyFinePresenter applyFinePresenter = 
				new ApplyFinePresenter(this, new ApplyFineView(), mainPresenter.getHistorySlot());
		presenters.put(APPLY_FINE, applyFinePresenter);
		
		LoginPresenter loginPresenter = new LoginPresenter(this, new LoginView(), mainSlot);
		presenters.put(LOGIN, loginPresenter);
		
		getHistory().newItem(LOGIN);
	}
	
	@Override
	public void onValueChange(ValueChangeEvent<String> event) {
		
		String[] token = event.getValue().split("=");
		
		Presenter presenter = presenters.get(token[0]);
		if (presenter != null) {
			
			if (token.length > 1)
				presenter.go(token[1]);
			else
				presenter.go();
		} else
			getHistory().newItem("");
	}

}
