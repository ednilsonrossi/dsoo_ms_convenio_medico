package com.ednilsonrossi.msprocedimento.model;

public class ProcedimentoAutorizado implements ProcedimentoState{

	private static ProcedimentoAutorizado instance;
	
	private ProcedimentoAutorizado() {
		
	}
	
	public static ProcedimentoAutorizado getInstance() {
		if(instance == null) {
			instance = new ProcedimentoAutorizado();
		}
		return instance;
	}
	
}
