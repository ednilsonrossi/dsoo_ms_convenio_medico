package com.ednilsonrossi.mscliente.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "tb_plano")
public class Plano implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numeroANS;
	
	private String descricao;
	private Double valorInicial;
	
	@Transient
	private TipoConvenio tipoConvenio;

	private boolean coparticipacao;
	
	public Plano() {
		super();
	}

	public Plano(Long numeroANS, String descricao, Double valorInicial, TipoConvenio tipoConvenio) {
		super();
		this.numeroANS = numeroANS;
		this.descricao = descricao;
		this.valorInicial = valorInicial;
		setTipoConvenio(tipoConvenio);
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
		this.coparticipacao = false;
		if(tipoConvenio.getClass().getSimpleName() == Coparticipacao.class.getSimpleName()) {
			this.coparticipacao = true;
		}
	}

	public boolean isCoparticipacao() {
		return coparticipacao;
	}

	public void setCoparticipacao(boolean coparticipacao) {
		this.coparticipacao = coparticipacao;
		if(this.coparticipacao) {
			this.tipoConvenio = Coparticipacao.getInstance();
		}else {
			this.tipoConvenio = Pleno.getInstante();
		}
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
