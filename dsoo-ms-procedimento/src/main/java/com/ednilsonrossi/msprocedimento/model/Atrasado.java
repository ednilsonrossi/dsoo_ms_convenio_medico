package com.ednilsonrossi.msprocedimento.model;

import java.io.Serializable;

public class Atrasado implements MensalidadeState, Serializable{

	private static final long serialVersionUID = 1L;
	private static Atrasado instance = null;

	private Atrasado() {

	}
	
	public int getEstado() {
		return 2;
	}

	public static Atrasado getInstance() {
		if(instance == null) {
			instance = new Atrasado();
		}
		return instance;
	}
}
