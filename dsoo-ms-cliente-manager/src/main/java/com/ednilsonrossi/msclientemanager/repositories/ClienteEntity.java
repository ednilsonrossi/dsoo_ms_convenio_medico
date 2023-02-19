package com.ednilsonrossi.msclientemanager.repositories;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ednilsonrossi.msclientemanager.model.Cliente;

@Entity
@Table(name = "tb_cliente")
public class ClienteEntity {

	@Id
	private long cardNumber;
	private String name;
	private int startYear;
	private long ansNumber;
	private double coparticipationValue;
	
	public ClienteEntity() {
	
	}
	
	public ClienteEntity(long cardNumber, String name, int startYear, long ansNumber, double coparticipationValue) {
		super();
		this.cardNumber = cardNumber;
		this.name = name;
		this.startYear = startYear;
		this.ansNumber = ansNumber;
		this.coparticipationValue = coparticipationValue;
	}

	public ClienteEntity(Cliente cliente) {
		this.cardNumber = cliente.getCardNumber();
		this.name = cliente.getName();
		this.startYear = cliente.getStartYear();
		this.ansNumber = cliente.getPlano().getAnsNumber();
		this.coparticipationValue = cliente.getPlano().getCoparticipationValue();
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
