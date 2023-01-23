package com.ednilsonrossi.msfinanceiro.model;

import java.io.Serializable;

public class NoPrazo implements MensalidadeState, Serializable{

	private static final long serialVersionUID = 1L;
	private static NoPrazo instance = null;

	private NoPrazo() {

	}
	
	public int getEstado() {
		return 1;
	}

	public static NoPrazo getInstance() {
		if(instance == null) {
			instance = new NoPrazo();
		}
		return instance;
	}

}
