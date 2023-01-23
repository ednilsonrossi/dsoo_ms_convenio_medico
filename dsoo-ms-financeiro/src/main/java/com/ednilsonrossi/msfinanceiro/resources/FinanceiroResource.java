package com.ednilsonrossi.msfinanceiro.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ednilsonrossi.msfinanceiro.model.Mensalidade;
import com.ednilsonrossi.msfinanceiro.services.FinanceiroService;

@RestController
@RequestMapping(value = "/financeiro")
public class FinanceiroResource {

	@Autowired
	private FinanceiroService service;
	
	@GetMapping(value = "/{carteirinha}")
	public ResponseEntity<Mensalidade> getMensalidade(@PathVariable long carteirinha){
		Mensalidade mensalidade = service.getMensalidade(carteirinha);
		return ResponseEntity.ok(mensalidade);
	}
	
}
