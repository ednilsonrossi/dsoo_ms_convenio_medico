package com.ednilsonrossi.msplanos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlanoSaudeRepository extends JpaRepository<PlanoSaudeEntity, Long>{
	
}
