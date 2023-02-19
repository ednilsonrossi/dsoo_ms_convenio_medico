package com.ednilsonrossi.msclientemanager.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ednilsonrossi.msclientemanager.model.PlanoSaude;
import com.ednilsonrossi.msclientemanager.repositories.ClienteEntity;
import com.ednilsonrossi.msclientemanager.repositories.IClienteRepository;
import com.ednilsonrossi.msclientemanager.services.PlanoSaudeService;

@RestController
@RequestMapping(value = "/cliente-manager")
public class ClienteManagerResources {

	@Autowired
	private PlanoSaudeService service; 
	
	@Autowired
	private IClienteRepository repository;
	
	@RequestMapping(value = "/", method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<ClienteEntity> create(@RequestBody ClienteEntity cliente) {
		
		PlanoSaude plano = service.getPlano(cliente.getAnsNumber());
		cliente.setCoparticipationValue(plano.getCoparticipationValue());
		
		return ResponseEntity.ok(repository.save(cliente));
	}
}
