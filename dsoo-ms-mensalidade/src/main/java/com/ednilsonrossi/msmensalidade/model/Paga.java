package com.ednilsonrossi.msmensalidade.model;

public class Paga implements IMensalidadeState{

	private static Paga instance;
	
	private Paga() {
		
	}
	
	public static Paga getInstance() {
		if(instance == null) {
			instance = new Paga();
		}
		return instance;
	}
	
}
