package com.ednilsonrossi.msfinanceiro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ednilsonrossi.msfinanceiro.model.MensalidadeDTO;

public interface MensalidadeRepository extends JpaRepository<MensalidadeDTO, Long>{

	MensalidadeDTO findByCarteirinhaCliente(Long carteirinha);
	
}
