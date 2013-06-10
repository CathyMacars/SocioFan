package com.kradcifer.sociofan.server.domain;

import java.util.Date;

public class Documentation {
	
	private Boolean docsOk;
	private Date nextEvalutation;

	public Boolean isDocsOk() {
		return docsOk;
	}

	public void setDocsOk(Boolean docsOk) {
		this.docsOk = docsOk;
	}

	public Date getNextEvalutation() {
		return nextEvalutation;
	}

	public void setNextEvalutation(Date nextEvalutation) {
		this.nextEvalutation = nextEvalutation;
	}

}
