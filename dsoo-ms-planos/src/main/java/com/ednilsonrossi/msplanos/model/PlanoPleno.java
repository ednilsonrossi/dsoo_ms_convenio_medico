package com.ednilsonrossi.msplanos.model;

public class PlanoPleno extends PlanoSaude {

	
	public PlanoPleno(Long ansNumber, String description) {
		super(ansNumber, description);
	}

	@Override
	public Double getCoparticipationValue() {
		return 0.0;
	}

}
