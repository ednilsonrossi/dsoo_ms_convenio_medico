package com.ednilsonrossi.msfinanceiro.model;

public class NoPrazo implements MensalidadeState{

	private static NoPrazo instance = null;

	private NoPrazo() {

	}

	public static NoPrazo getInstance() {
		if(instance == null) {
			instance = new NoPrazo();
		}
		return instance;
	}

}
