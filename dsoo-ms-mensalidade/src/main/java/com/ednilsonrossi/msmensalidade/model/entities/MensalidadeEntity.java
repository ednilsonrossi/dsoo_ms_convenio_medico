package com.ednilsonrossi.msmensalidade.model.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ednilsonrossi.msmensalidade.model.Aberta;
import com.ednilsonrossi.msmensalidade.model.Atrasada;
import com.ednilsonrossi.msmensalidade.model.Cliente;
import com.ednilsonrossi.msmensalidade.model.IMensalidadeState;
import com.ednilsonrossi.msmensalidade.model.Mensalidade;
import com.ednilsonrossi.msmensalidade.model.Paga;
import com.ednilsonrossi.msmensalidade.repositories.MensalidadeId;

@Entity
@Table(name = "tb_mensalidade")
public class MensalidadeEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private MensalidadeId mensalidadeId;
	private int mesReferencia;
	private int anoReferencia;
	private double valor;
	private int estado;
	
	public MensalidadeEntity() {
		
	}
	

	public MensalidadeEntity(Cliente cliente, Mensalidade mensalidade) {
		this.mesReferencia = mensalidade.getMesReferencia();
		this.anoReferencia = mensalidade.getAnoReferencia();
		this.mensalidadeId = new MensalidadeId(cliente.getCarteirinha(), (this.mesReferencia * 10000 + this.anoReferencia) );
		this.valor = mensalidade.getValor();
		defineEstado(mensalidade.getMensalidadeState());
	}
		
	
	private void defineEstado(IMensalidadeState state) {
		if(state instanceof Paga) {
			this.estado = 0;
		}else {
			if(state instanceof Aberta) {
				this.estado = 1;
			}else {
				if(state instanceof Atrasada) {
					this.estado = 2;
				}
			}
		}
	}

	public MensalidadeId getMensalidadeId() {
		return mensalidadeId;
	}

	public void setMensalidadeId(MensalidadeId mensalidadeId) {
		this.mensalidadeId = mensalidadeId;
	}

	public int getMesReferencia() {
		return mesReferencia;
	}

	public void setMesReferencia(int mesReferencia) {
		this.mesReferencia = mesReferencia;
	}

	public int getAnoReferencia() {
		return anoReferencia;
	}

	public void setAnoReferencia(int anoReferencia) {
		this.anoReferencia = anoReferencia;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
	
}
