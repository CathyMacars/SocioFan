package com.kradcifer.sociofan.server.domain;

import java.util.Date;

import com.googlecode.objectify.Key;

public class FanInfo {

	private String address;
	private String comp;
	private String district;
	private String city;
	private String zip;
	private Date birth;
	private String cellular;
	private String commercialPhone;
	private String email;
	private String fathersName;
	private Integer gender;
	private String job;
	private String maritalStatus;
	private Double monthlyValue;
	private String mothersName;
	private String name;
	private Date regDate;
	private String residencialPhone;
	private String rg;
	private String cpf;
	private Key<Seat> seat;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getCellular() {
		return cellular;
	}

	public void setCellular(String cellular) {
		this.cellular = cellular;
	}

	public String getCommercialPhone() {
		return commercialPhone;
	}

	public void setCommercialPhone(String commercialPhone) {
		this.commercialPhone = commercialPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFathersName() {
		return fathersName;
	}

	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public Double getMonthlyValue() {
		return monthlyValue;
	}

	public void setMonthlyValue(Double monthlyValue) {
		this.monthlyValue = monthlyValue;
	}

	public String getMothersName() {
		return mothersName;
	}

	public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getResidencialPhone() {
		return residencialPhone;
	}

	public void setResidencialPhone(String residencialPhone) {
		this.residencialPhone = residencialPhone;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Key<Seat> getSeat() {
		return seat;
	}

	public void setSeat(Key<Seat> seat) {
		this.seat = seat;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getComp() {
		return comp;
	}

	public void setComp(String comp) {
		this.comp = comp;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
}
