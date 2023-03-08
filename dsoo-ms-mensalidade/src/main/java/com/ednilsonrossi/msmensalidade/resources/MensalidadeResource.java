package com.ednilsonrossi.msmensalidade.resources;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ednilsonrossi.msmensalidade.model.Aberta;
import com.ednilsonrossi.msmensalidade.model.Cliente;
import com.ednilsonrossi.msmensalidade.model.Mensalidade;
import com.ednilsonrossi.msmensalidade.model.entities.MensalidadeEntity;
import com.ednilsonrossi.msmensalidade.model.entities.MensalidadeId;
import com.ednilsonrossi.msmensalidade.repositories.IMensalidadeRepository;
import com.ednilsonrossi.msmensalidade.services.CalculoMensalidadeService;
import com.ednilsonrossi.msmensalidade.services.ClienteService;



@RestController
@RequestMapping(value = "/mensalidade")
public class MensalidadeResource {

	@Autowired
	private CalculoMensalidadeService calculoService;
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private IMensalidadeRepository repository;
	
	private Logger logger;
	
	@GetMapping(value = "/{ano}/month/{mes}")
	public ResponseEntity<List<MensalidadeEntity>> generateMensalidades(@PathVariable int ano, @PathVariable int mes){
	
		logger = LoggerFactory.getLogger(MensalidadeResource.class);
		

		List<MensalidadeEntity> mensalidades = new ArrayList<>();
		List<Cliente> clientes = clienteService.todosClientes();
		Mensalidade mensalidade;
		MensalidadeEntity mensalidadeEntity;
		
		double valor = calculoService.getValorMensalidade();
		
		for(Cliente c : clientes) {
			mensalidade = new Mensalidade(mes, ano, valor, Aberta.getInstance() );
			
			mensalidadeEntity = new MensalidadeEntity(c, mensalidade);
			
			mensalidades.add(mensalidadeEntity);
			
		}
		
		repository.saveAll(mensalidades);
		
		return ResponseEntity.ok(mensalidades);
	}
	
	@GetMapping(value = "/{cliente}/ref/{referencia}")
	public ResponseEntity<MensalidadeEntity> baixarMensalidade(@PathVariable long cliente, @PathVariable long referencia){
		
		MensalidadeEntity mEntity = repository.findById(new MensalidadeId(cliente, referencia)).get();
		mEntity.setEstado(0);
		repository.save(mEntity);
		
		return ResponseEntity.ok(mEntity);
		
	}
	
}
