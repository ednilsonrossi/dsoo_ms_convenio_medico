package com.ednilsonrossi.msplanos.model;

public class PlanoCoparticipacao extends PlanoSaude {

	public PlanoCoparticipacao(Long ansNumber, String description) {
		super(ansNumber, description);
	}

	@Override
	public Double getCoparticipationValue() {
		return 200.0;
	}

}
