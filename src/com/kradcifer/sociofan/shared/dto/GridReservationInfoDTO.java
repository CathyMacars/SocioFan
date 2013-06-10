package com.kradcifer.sociofan.shared.dto;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class GridReservationInfoDTO implements Serializable {
	
	public int totalReservations;
	public List<GridReservationDTO> reservations;

}
