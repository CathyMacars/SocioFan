package com.kradcifer.sociofan.shared.dto;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class GridFanInfoDTO implements Serializable {
	
	public int totalFans;
	public List<GridFanDTO> fans;

}
