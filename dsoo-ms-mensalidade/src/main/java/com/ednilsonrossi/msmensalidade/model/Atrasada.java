package com.ednilsonrossi.msmensalidade.model;

public class Atrasada implements IMensalidadeState{

	private static Atrasada instance;
	
	private Atrasada() {
		
	}
	
	public static Atrasada getInstance() {
		if(instance == null)
			instance = new Atrasada();
		return instance;
	}
	
}
