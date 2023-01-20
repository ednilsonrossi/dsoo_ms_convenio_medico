package com.ednilsonrossi.mscliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ednilsonrossi.mscliente.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
