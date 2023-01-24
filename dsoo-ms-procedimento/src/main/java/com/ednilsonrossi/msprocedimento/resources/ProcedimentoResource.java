package com.ednilsonrossi.msprocedimento.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ednilsonrossi.msprocedimento.model.Consulta;
import com.ednilsonrossi.msprocedimento.model.Mensalidade;
import com.ednilsonrossi.msprocedimento.model.ProcedimentoDTO;
import com.ednilsonrossi.msprocedimento.services.FinanceiroService;

@RestController
@RequestMapping(value = "/procedimentos")
public class ProcedimentoResource {

	@Autowired
	private FinanceiroService service;
	
	@GetMapping(value = "/{carteirinha}")
	public ResponseEntity<ProcedimentoDTO> getAutorizacaoProcedimento(@PathVariable long carteirinha){
		Mensalidade mensalidade = service.getMensalidade(carteirinha);
		Consulta consulta = new Consulta();
		ProcedimentoDTO dto = consulta.getProcedimento(mensalidade);
		return ResponseEntity.ok(dto);
	}
	
}
