package com.ednilsonrossi.msmensalidade.model;

public class Aberta implements IMensalidadeState{

	private static Aberta instance;
	
	private Aberta() {
		
	}
	
	public static Aberta getInstance() {
		if(instance == null) {
			instance = new Aberta();
		}
		return instance;
	}
	
}
