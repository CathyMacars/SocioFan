package com.kradcifer.sociofan.shared.dto;

import java.io.Serializable;
import java.util.Date;

import com.kradcifer.sociofan.shared.FanModality;

@SuppressWarnings("serial")
public class SaveFanDTO implements Serializable {

	public Long fanId;
	public FanModality fanModality;

	public String address;
	public String comp;
	public String district;
	public String city;
	public String zip;
	public Date birth;
	public String cellular;
	public String commercialPhone;
	public String email;
	public String fathersName;
	public Integer gender;
	public String job;
	public String maritalStatus;
	public Double monthlyValue;
	public String mothersName;
	public String name;
	public Date regDate;
	public String residencialPhone;
	public String rg;
	public String cpf;

}
