package com.ednilsonrossi.msmensalidade.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import com.ednilsonrossi.msmensalidade.model.Cliente;


@Component
@FeignClient(name = "ms-cliente", path = "/clientes")
public interface IClienteFeignClient {

	@GetMapping
	public ResponseEntity<List<ClienteMSCliente>> todosClientes();
	
}
