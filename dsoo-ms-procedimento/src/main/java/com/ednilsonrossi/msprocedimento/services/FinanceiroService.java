package com.ednilsonrossi.msprocedimento.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ednilsonrossi.msprocedimento.feignclients.FinanceiroFeignClient;
import com.ednilsonrossi.msprocedimento.model.Mensalidade;

@Service
public class FinanceiroService {

	@Autowired
	private FinanceiroFeignClient feignClient;
	
	public Mensalidade getMensalidade(long carteirinha) {
		Mensalidade mensalidade = feignClient.getMensalidade(carteirinha).getBody();
		return mensalidade;
	}
}
