package com.ednilsonrossi.msfinanceiro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ednilsonrossi.msfinanceiro.feignclients.ClienteFeignClient;
import com.ednilsonrossi.msfinanceiro.model.Cliente;
import com.ednilsonrossi.msfinanceiro.model.Mensalidade;
import com.ednilsonrossi.msfinanceiro.model.MensalidadeDTO;
import com.ednilsonrossi.msfinanceiro.repositories.MensalidadeRepository;

@Service
public class FinanceiroService {

	@Autowired
	private ClienteFeignClient feignClient;
	
	@Autowired
	private MensalidadeRepository repository;
	
	public Mensalidade getMensalidade(long carteirinha) {
		Cliente cliente = feignClient.buscaCliente(carteirinha).getBody();
		MensalidadeDTO dto = repository.findByCarteirinhaCliente(carteirinha);
		Mensalidade mensalidade = new Mensalidade(dto, cliente);
		return mensalidade;
	}
	
}
