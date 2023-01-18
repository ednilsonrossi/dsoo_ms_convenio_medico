package com.ednilsonrossi.mscliente.model;

import java.io.Serializable;
import java.util.Objects;

public class Plano implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long numeroANS;
	private String descricao;
	private Double valorInicial;
	private TipoConvenio tipoConvenio;

	public Plano() {
		super();
	}

	public Plano(Long numeroANS, String descricao, Double valorInicial, TipoConvenio tipoConvenio) {
		super();
		this.numeroANS = numeroANS;
		this.descricao = descricao;
		this.valorInicial = valorInicial;
		this.tipoConvenio = tipoConvenio;
	}

	public Long getNumeroANS() {
		return numeroANS;
	}

	public void setNumeroANS(Long numeroANS) {
		this.numeroANS = numeroANS;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValorInicial() {
		return valorInicial;
	}

	public void setValorInicial(Double valorInicial) {
		this.valorInicial = valorInicial;
	}

	public TipoConvenio getTipoConvenio() {
		return tipoConvenio;
	}

	public void setTipoConvenio(TipoConvenio tipoConvenio) {
		this.tipoConvenio = tipoConvenio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroANS);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plano other = (Plano) obj;
		return Objects.equals(numeroANS, other.numeroANS);
	}
	
	
}
