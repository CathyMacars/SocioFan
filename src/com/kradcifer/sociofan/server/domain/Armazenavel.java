package com.kradcifer.sociofan.server.domain;

import java.io.Serializable;

import javax.persistence.Id;

@SuppressWarnings("serial")
public abstract class Armazenavel implements Serializable {

	@Id
	private Long id;
	private int version;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}
