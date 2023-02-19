package com.ednilsonrossi.msplanos.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ednilsonrossi.msplanos.model.PlanoSaude;
import com.ednilsonrossi.msplanos.repositories.IPlanoSaudeRepository;
import com.ednilsonrossi.msplanos.repositories.PlanoSaudeEntity;

@RestController
@RequestMapping(value = "/planos")
public class PlanoSaudeResource {

	
	@Autowired
	private IPlanoSaudeRepository repository;
	
	@GetMapping
	public ResponseEntity<List<PlanoSaudeEntity>> findAdd(){
		List<PlanoSaudeEntity> planosEntities = repository.findAll();
		return ResponseEntity.ok(planosEntities);
	}
	
	@GetMapping(value = "/{ans}")
	public ResponseEntity<PlanoSaude> findPlano(@PathVariable Long ans){
		PlanoSaudeEntity entity = repository.findById(ans).get();
		PlanoSaude plano = entity.getPlanoSaude();
		return ResponseEntity.ok(plano);
	}
	
	@PostMapping
	public PlanoSaudeEntity create(@RequestBody PlanoSaudeEntity planoEntity) {
		//System.out.println("entrei");
		return repository.save(planoEntity);
	}
	
}
