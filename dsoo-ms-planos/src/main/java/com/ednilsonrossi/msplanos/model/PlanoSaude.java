package com.ednilsonrossi.msplanos.model;

public abstract class PlanoSaude {

	private Long ansNumber;
	private String description;
	
	public PlanoSaude(Long ansNumber, String description) {
		super();
		this.ansNumber = ansNumber;
		this.description = description;
	}

	public Long getAnsNumber() {
		return ansNumber;
	}

	public void setAnsNumber(Long ansNumber) {
		this.ansNumber = ansNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public abstract Double getCoparticipationValue();
	
}
