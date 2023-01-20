package com.ednilsonrossi.mscliente.model;

public class Pleno implements TipoConvenio{

	private static Pleno instance = null;
	
	private Pleno() {
		
	}
	
	public static Pleno getInstante() {
		if(instance == null) {
			instance = new Pleno();
		}
		return instance;
	}
	
	@Override
	public double getCoparticipacao(Integer procedimento) {
		return 0;
	}

	
}
