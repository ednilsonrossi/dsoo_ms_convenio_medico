package com.ednilsonrossi.msmensalidade.services;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ednilsonrossi.msmensalidade.feignclients.ClienteMSCliente;
import com.ednilsonrossi.msmensalidade.feignclients.IClienteFeignClient;
import com.ednilsonrossi.msmensalidade.model.Cliente;

@Service
public class ClienteService {

	@Autowired
	private IClienteFeignClient feignClient;
	
	public List<Cliente> todosClientes(){
		List<ClienteMSCliente> lista  = feignClient.todosClientes().getBody();
		List<Cliente> clientes  = new ArrayList<>();
		Cliente cliente;	
		
		for(ClienteMSCliente cms : lista) {
			cliente = cms.toCliente();
			clientes.add(cliente);
		}
		
		return clientes;
	}
	
}
