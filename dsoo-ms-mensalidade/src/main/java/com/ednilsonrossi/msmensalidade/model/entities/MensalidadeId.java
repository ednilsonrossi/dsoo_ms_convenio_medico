package com.ednilsonrossi.msmensalidade.model.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class MensalidadeId implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private long carteirinha;
	private long referencia;
	
	public MensalidadeId() {

	}
	
	public MensalidadeId(long carteirinha, long referencia) {
		super();
		this.carteirinha = carteirinha;
		this.referencia = referencia;
	}

	public long getCarteirinha() {
		return carteirinha;
	}

	public void setCarteirinha(long carteirinha) {
		this.carteirinha = carteirinha;
	}

	public long getReferencia() {
		return referencia;
	}

	public void setReferencia(long referencia) {
		this.referencia = referencia;
	}
	
	
}
