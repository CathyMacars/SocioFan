package com.kradcifer.sociofan.shared.dto;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class SaveReservationDTO implements Serializable {

	public Long fanId;
	public Long seatId;
	public Date gameDate;
	
	// TODO: Not right :P
	public String seatCode;

}
