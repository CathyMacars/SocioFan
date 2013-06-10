package com.kradcifer.sociofan.shared.dto;

import java.io.Serializable;

import com.kradcifer.sociofan.shared.FanModality;

@SuppressWarnings("serial")
public class GridFanDTO implements Serializable {

	public Long fanId;
	public String login;
	public FanModality fanModality;

}
