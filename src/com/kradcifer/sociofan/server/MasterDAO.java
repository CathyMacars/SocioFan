package com.kradcifer.sociofan.server;

import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.util.DAOBase;
import com.kradcifer.sociofan.server.domain.Fan;
import com.kradcifer.sociofan.server.domain.Reservation;
import com.kradcifer.sociofan.server.domain.Seat;

public class MasterDAO extends DAOBase {
	
	static {
		ObjectifyService.register(Fan.class);
		ObjectifyService.register(Reservation.class);
		ObjectifyService.register(Seat.class);
	}

}
