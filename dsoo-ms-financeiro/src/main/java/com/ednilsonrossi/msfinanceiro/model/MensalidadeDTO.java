package com.ednilsonrossi.msfinanceiro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_mensalidade")
public class MensalidadeDTO {

	public double valor;
	public int parcelaReferencia;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	public long carteirinhaCliente;
	public int mensalidadeEstado;

}
