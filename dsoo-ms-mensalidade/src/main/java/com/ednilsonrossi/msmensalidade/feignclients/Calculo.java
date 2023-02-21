package com.ednilsonrossi.msmensalidade.feignclients;

import java.io.Serializable;

public class Calculo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public double valor;

	public Calculo() {
	
	}
	
	public Calculo(double valor) {
		super();
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
