package com.ednilsonrossi.msprocedimento.model;

public class ProcedimentoNaoAutorizado implements ProcedimentoState {

	private static ProcedimentoNaoAutorizado instance;

	private ProcedimentoNaoAutorizado() {

	}

	public static ProcedimentoNaoAutorizado getInstance() {
		if (instance == null) {
			instance = new ProcedimentoNaoAutorizado();
		}
		return instance;
	}

}
