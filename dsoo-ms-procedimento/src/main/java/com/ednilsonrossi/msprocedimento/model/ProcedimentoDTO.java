package com.ednilsonrossi.msprocedimento.model;

import java.io.Serializable;

public class ProcedimentoDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String carteirinha;
	private boolean autorizado;
	private double valorReceber;
	
	public ProcedimentoDTO(String carteirinha, boolean autorizado, double valorReceber) {
		super();
		this.carteirinha = carteirinha;
		this.autorizado = autorizado;
		this.valorReceber = valorReceber;
	}

	public String getCarteirinha() {
		return carteirinha;
	}

	public void setCarteirinha(String carteirinha) {
		this.carteirinha = carteirinha;
	}

	public boolean isAutorizado() {
		return autorizado;
	}

	public void setAutorizado(boolean autorizado) {
		this.autorizado = autorizado;
	}

	public double getValorReceber() {
		return valorReceber;
	}

	public void setValorReceber(double valorReceber) {
		this.valorReceber = valorReceber;
	}

}
