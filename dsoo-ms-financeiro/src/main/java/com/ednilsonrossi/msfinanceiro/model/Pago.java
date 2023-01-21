package com.ednilsonrossi.msfinanceiro.model;

public class Pago implements MensalidadeState{
	
	private static Pago instance = null;
	
	private Pago() {
		
	}
	
	public static Pago getInstance() {
		if(instance == null) {
			instance = new Pago();
		}
		return instance;
	}
}
