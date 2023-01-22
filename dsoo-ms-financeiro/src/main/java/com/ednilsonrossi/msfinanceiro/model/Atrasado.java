package com.ednilsonrossi.msfinanceiro.model;

public class Atrasado implements MensalidadeState{

	private static Atrasado instance = null;

	private Atrasado() {

	}

	public static Atrasado getInstance() {
		if(instance == null) {
			instance = new Atrasado();
		}
		return instance;
	}
}
