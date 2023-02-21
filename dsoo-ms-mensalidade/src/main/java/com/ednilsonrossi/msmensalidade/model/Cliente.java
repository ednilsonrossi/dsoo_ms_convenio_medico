package com.ednilsonrossi.msmensalidade.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	protected long carteirinha;
	protected int anoIngresso;
	protected List<Mensalidade> mensalidades;
	
	public Cliente(long carteirinha, int anoIngresso) {
		super();
		this.carteirinha = carteirinha;
		this.anoIngresso = anoIngresso;
		mensalidades = new ArrayList<>();
	}

	public long getCarteirinha() {
		return carteirinha;
	}

	public void setCarteirinha(long carteirinha) {
		this.carteirinha = carteirinha;
	}

	public int getAnoIngresso() {
		return anoIngresso;
	}

	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}

	public List<Mensalidade> getMensalidades() {
		return mensalidades;
	}

	public void setMensalidades(List<Mensalidade> mensalidades) {
		this.mensalidades = mensalidades;
	}

	@Override
	public String toString() {
		return "Cliente [carteirinha=" + carteirinha + ", anoIngresso=" + anoIngresso + ", mensalidades=" + mensalidades
				+ "]";
	}

	
	
	
}
