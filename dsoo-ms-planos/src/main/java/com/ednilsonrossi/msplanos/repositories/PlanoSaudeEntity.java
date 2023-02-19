package com.ednilsonrossi.msplanos.repositories;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ednilsonrossi.msplanos.model.PlanoCoparticipacao;
import com.ednilsonrossi.msplanos.model.PlanoPleno;
import com.ednilsonrossi.msplanos.model.PlanoSaude;

@Entity
@Table(name = "tb_planosaude")
public class PlanoSaudeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ansNumber;
	private String description;
	private int coparticipation;
	private double coparticipationValue;
	
	public PlanoSaudeEntity() {
	
	}
	
	public PlanoSaudeEntity(PlanoSaude p) {
		this.ansNumber = p.getAnsNumber();
		this.description = p.getDescription();
		this.coparticipationValue = p.getCoparticipationValue();
		
		if(p instanceof PlanoCoparticipacao) {
			this.coparticipation = 1;
		}else {
			this.coparticipation = 0;
		}
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

	public int getCoparticipation() {
		return coparticipation;
	}

	public void setCoparticipation(int coparticipation) {
		this.coparticipation = coparticipation;
	}

	public double getCoparticipationValue() {
		return coparticipationValue;
	}

	public void setCoparticipationValue(double coparticipationValue) {
		this.coparticipationValue = coparticipationValue;
	}
	
	public PlanoSaude getPlanoSaude() {
		PlanoSaude plano;
		if(this.coparticipation == 1) {
			plano = new PlanoCoparticipacao(this.ansNumber, this.description);
		}else {
			plano = new PlanoPleno(this.ansNumber, this.description);
		}
		return plano;
	}

}