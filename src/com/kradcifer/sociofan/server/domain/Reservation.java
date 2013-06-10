package com.kradcifer.sociofan.server.domain;

import java.util.Date;

import com.googlecode.objectify.Key;

@SuppressWarnings("serial")
public class Reservation extends Armazenavel {

	private Key<Fan> fan;
	private Key<Seat> seat;
	private Date gameDate;

	public Date getGameDate() {
		return gameDate;
	}

	public void setGameDate(Date gameDate) {
		this.gameDate = gameDate;
	}

	public Key<Fan> getFan() {
		return fan;
	}

	public void setFan(Key<Fan> fan) {
		this.fan = fan;
	}

	public Key<Seat> getSeat() {
		return seat;
	}

	public void setSeat(Key<Seat> seat) {
		this.seat = seat;
	}

}
