package com.ednilsonrossi.mscliente.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "tb_cliente")
public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long carteirinha;
	private String nome;
	private Integer anosConvenio;	
	
	/*
	 * Conforme diagrama de classes, a navegabilidade se dá no sentido de Cliente para Plano, assim, o mapenamento 
	 * para o modelo relacional incluí a referência do plano apenas na tabela de clientes, o que justifica o mapeamento
	 * ManyToOne no JPA. 
	 */
	@ManyToOne
	private Plano plano;
	
	
	public Cliente() {
		super();
	}
	
	public Cliente(Long carteirinha, String nome, Integer anosConvenio, Plano plano) {
		super();
		this.carteirinha = carteirinha;
		this.nome = nome;
		this.anosConvenio = anosConvenio;
		this.plano = plano;
	}

	public Long getCarteirinha() {
		return carteirinha;
	}

	public void setCarteirinha(Long carteirinha) {
		this.carteirinha = carteirinha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getAnosConvenio() {
		return anosConvenio;
	}

	public void setAnosConvenio(Integer anosConvenio) {
		this.anosConvenio = anosConvenio;
	}

	public Plano getPlano() {
		return plano;
	}

	public void setPlano(Plano plano) {
		this.plano = plano;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(carteirinha);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(carteirinha, other.carteirinha);
	}

}
