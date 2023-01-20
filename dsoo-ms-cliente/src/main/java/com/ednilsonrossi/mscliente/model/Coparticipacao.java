package com.ednilsonrossi.mscliente.model;

public class Coparticipacao implements TipoConvenio{

	private static Coparticipacao instance = null;
	
	private Coparticipacao() {
		
	}
	
	public static final Coparticipacao getInstance() {
		if(instance == null) {
			instance = new Coparticipacao();
		}
		return instance;
	}
	
	@Override
	public double getCoparticipacao(Integer procedimento) {
		return 100.0;
	}

	
	
}
