package com.kradcifer.sociofan.server.domain;

import java.util.Date;

public class Fine {

	private String description;
	private Double value;
	private Date when;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Date getWhen() {
		return when;
	}

	public void setWhen(Date when) {
		this.when = when;
	}

}
