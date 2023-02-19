package com.ednilsonrossi.msclientemanager.model;

public class Cliente {
	
	private long cardNumber;
	private String name;
	private int startYear;
	private PlanoSaude plano;
	
	public Cliente(long cardNumber, String name, int startYear, PlanoSaude plano) {
		super();
		this.cardNumber = cardNumber;
		this.name = name;
		this.startYear = startYear;
		this.plano = plano;
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

	public PlanoSaude getPlano() {
		return plano;
	}

	public void setPlano(PlanoSaude plano) {
		this.plano = plano;
	}

}
