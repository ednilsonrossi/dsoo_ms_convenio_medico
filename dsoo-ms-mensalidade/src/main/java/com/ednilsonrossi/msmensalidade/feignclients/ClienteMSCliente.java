package com.ednilsonrossi.msmensalidade.feignclients;

import com.ednilsonrossi.msmensalidade.model.Cliente;

public class ClienteMSCliente {

	private long cardNumber;
	private String name;
	private int startYear;
	private long ansNumber;
	private double coparticipationValue;
	
	public ClienteMSCliente() {
	
	}
	
	public ClienteMSCliente(long cardNumber, String name, int startYear, long ansNumber, double coparticipationValue) {
		super();
		this.cardNumber = cardNumber;
		this.name = name;
		this.startYear = startYear;
		this.ansNumber = ansNumber;
		this.coparticipationValue = coparticipationValue;
	}
	
	public Cliente toCliente() {
		Cliente c = new Cliente(cardNumber, startYear);
		return c;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStartYear() {
		return startYear;
	}

	public void setStartYear(int startYear) {
		this.startYear = startYear;
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
	
	
	
}
