package com.kradcifer.sociofan.shared.dto;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class ApplyFineDTO implements Serializable {
	
	public Long fanId;
	
	public String description;
	public Double value;
	public Date when;

}
