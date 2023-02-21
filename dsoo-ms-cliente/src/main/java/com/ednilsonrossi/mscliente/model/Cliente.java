package com.ednilsonrossi.mscliente.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "tb_cliente")
public class Cliente {

	@Id
	private long cardNumber;
	private String name;
	private int startYear;
	private long ansNumber;
	private double coparticipationValue;
	
	public Cliente() {
	
	}
	
	public Cliente(Long cardNumber, String name, Integer startYear, Long ansNumber, Double coparticipationValue) {
		super();
		this.cardNumber = cardNumber;
		this.name = name;
		this.startYear = startYear;
		this.ansNumber = ansNumber;
		this.coparticipationValue = coparticipationValue;
	}

	public Long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStartYear() {
		return startYear;
	}

	public void setStartYear(Integer startYear) {
		this.startYear = startYear;
	}

	public Long getAnsNumber() {
		return ansNumber;
	}

	public void setAnsNumber(Long ansNumber) {
		this.ansNumber = ansNumber;
	}

	public Double getCoparticipationValue() {
		return coparticipationValue;
	}

	public void setCoparticipationValue(Double coparticipationValue) {
		this.coparticipationValue = coparticipationValue;
	}
	
}
