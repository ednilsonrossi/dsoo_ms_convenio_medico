package com.ednilsonrossi.msmensalidade.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ednilsonrossi.msmensalidade.model.entities.MensalidadeEntity;

@Repository
public interface IMensalidadeRepository extends JpaRepository<MensalidadeEntity, Long>{

}
