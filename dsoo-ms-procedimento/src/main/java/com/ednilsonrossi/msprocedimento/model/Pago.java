package com.ednilsonrossi.msprocedimento.model;

import java.io.Serializable;

public class Pago implements MensalidadeState, Serializable{

	private static final long serialVersionUID = 1L;
	private static Pago instance = null;
	
	private Pago() {

	}

	public int getEstado() {
		return 0;
	}



	public static Pago getInstance() {
		if(instance == null) {
			instance = new Pago();
		}
		return instance;
	}
}
