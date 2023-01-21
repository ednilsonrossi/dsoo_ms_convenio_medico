package com.ednilsonrossi.mscliente.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ednilsonrossi.mscliente.model.Cliente;
import com.ednilsonrossi.mscliente.repositories.ClienteRepository;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

	@Autowired
	private ClienteRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> todosClientes(){
		List<Cliente> lista = repository.findAll();
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping(value = "/{carteirinha}")
	public ResponseEntity<Cliente> buscaCliente(@PathVariable Long carteirinha){
		Cliente c = repository.findById(carteirinha).get();
		return ResponseEntity.ok(c);
	}
	
}
