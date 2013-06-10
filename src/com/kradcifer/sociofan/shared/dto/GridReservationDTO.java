package com.kradcifer.sociofan.shared.dto;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class GridReservationDTO implements Serializable {
	
	public Long reservationId;
	public Date date;
	public String seatCode;
	public String fanEmail;

}
