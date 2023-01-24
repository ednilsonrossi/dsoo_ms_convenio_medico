package com.ednilsonrossi.msprocedimento.model;

public class Consulta extends Procedimento {

	
	@Override
	public double getValor() {
		return 200.0;
	}

	@Override
	public ProcedimentoDTO getProcedimento(Mensalidade mensalidade) {
		
		String carteirinha = String.valueOf(mensalidade.getCliente().getCarteirinha());
		
		boolean autorizado = false;
		if(mensalidade.getMensalidadeState() instanceof Pago || mensalidade.getMensalidadeState() instanceof NoPrazo) {
			autorizado = true;
			setProcedimentoState(ProcedimentoAutorizado.getInstance());
		}else {
			setProcedimentoState(ProcedimentoNaoAutorizado.getInstance());
		}
		
		double valor = 0.0;
		if(mensalidade.getCliente().getPlano().isCoparticipacao()) {
			valor = getValor();
		}
		
		ProcedimentoDTO dto = new ProcedimentoDTO(carteirinha, autorizado, valor);
		
		return dto;
	}


	
	
	
	
	
}
