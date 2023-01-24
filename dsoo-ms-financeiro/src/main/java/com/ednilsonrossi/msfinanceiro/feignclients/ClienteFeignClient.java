package com.ednilsonrossi.msfinanceiro.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ednilsonrossi.msfinanceiro.model.Cliente;

@Component
@FeignClient(name = "ms-cliente", path = "/clientes")
public interface ClienteFeignClient {

	@GetMapping(value = "/{carteirinha}")
	public ResponseEntity<Cliente> buscaCliente(@PathVariable Long carteirinha);
	
}
