package com.ednilsonrossi.msmensalidade.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ednilsonrossi.msmensalidade.model.entities.MensalidadeEntity;
import com.ednilsonrossi.msmensalidade.model.entities.MensalidadeId;

@Repository
public interface IMensalidadeRepository extends JpaRepository<MensalidadeEntity, MensalidadeId>{

	
	
}
