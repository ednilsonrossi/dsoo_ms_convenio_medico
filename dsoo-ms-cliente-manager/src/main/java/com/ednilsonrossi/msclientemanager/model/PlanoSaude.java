package com.ednilsonrossi.msclientemanager.model;

public class PlanoSaude {

	private long ansNumber;
	private String description;
	private double coparticipationValue;
	
	public PlanoSaude(long ansNumber, String description, double coparticipationValue) {
		super();
		this.ansNumber = ansNumber;
		this.description = description;
		this.coparticipationValue = coparticipationValue;
	}

	public long getAnsNumber() {
		return ansNumber;
	}

	public void setAnsNumber(long ansNumber) {
		this.ansNumber = ansNumber;
	}

	public double getCoparticipationValue() {
		return coparticipationValue;
	}

	public void setCoparticipationValue(double coparticipationValue) {
		this.coparticipationValue = coparticipationValue;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
