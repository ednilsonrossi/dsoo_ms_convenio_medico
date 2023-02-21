package com.ednilsonrossi.msmensalidade.model;

public class Mensalidade {

	private int mesReferencia;
	private int anoReferencia;
	private double valor;
	private IMensalidadeState mensalidadeState;
	
	public Mensalidade() {
	
	}
	
	public Mensalidade(int mesReferencia, int anoReferencia, double valor, IMensalidadeState mensalidadeState) {
		super();
		this.mesReferencia = mesReferencia;
		this.anoReferencia = anoReferencia;
		this.valor = valor;
		this.mensalidadeState = mensalidadeState;
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

	public IMensalidadeState getMensalidadeState() {
		return mensalidadeState;
	}

	public void setMensalidadeState(IMensalidadeState mensalidadeState) {
		this.mensalidadeState = mensalidadeState;
	}
	
	
}
