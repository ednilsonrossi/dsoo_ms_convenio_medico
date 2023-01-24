package com.ednilsonrossi.msprocedimento.model;

public abstract class Procedimento {

	private ProcedimentoState procedimentoState;
	
	
	public ProcedimentoState getProcedimentoState() {
		return procedimentoState;
	}

	public void setProcedimentoState(ProcedimentoState procedimentoState) {
		this.procedimentoState = procedimentoState;
	}

	public abstract ProcedimentoDTO getProcedimento(Mensalidade mensalidade);
	
	public abstract double getValor();
	
}
