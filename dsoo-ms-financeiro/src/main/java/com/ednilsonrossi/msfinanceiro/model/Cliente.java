package com.ednilsonrossi.msfinanceiro.model;

import java.io.Serializable;
import java.util.Objects;


public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long carteirinha;
	private String nome;
	private Integer anosConvenio;
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
		if ((obj == null) || (getClass() != obj.getClass()))
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(carteirinha, other.carteirinha);
	}

}
