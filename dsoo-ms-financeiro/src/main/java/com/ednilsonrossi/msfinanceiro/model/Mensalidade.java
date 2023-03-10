package com.ednilsonrossi.msfinanceiro.model;

import java.io.Serializable;


public class Mensalidade implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long id;
	private Double valor;
	private Integer parcelaReferencia;
	private MensalidadeState mensalidadeState;
	private Cliente cliente;

	public Mensalidade() {
		super();
	}

	public Mensalidade(Long id, Integer parcelaReferencia, MensalidadeState mensalidadeState, Cliente cliente) {
		super();
		this.id = id;
		this.parcelaReferencia = parcelaReferencia;
		this.mensalidadeState = mensalidadeState;
		this.cliente = cliente;
		setValor();
	}

	public Mensalidade(MensalidadeDTO mensalidadeDB, Cliente cliente) {
		super();
		this.id = mensalidadeDB.id;
		this.parcelaReferencia = mensalidadeDB.parcelaReferencia;
		switch (mensalidadeDB.mensalidadeEstado) {
		case 0:
			setMensalidadeState(Pago.getInstance());
			break;
		case 1:
			setMensalidadeState(NoPrazo.getInstance());
			break;
		case 2:
			setMensalidadeState(Atrasado.getInstance());
			break;
		}
		this.cliente = cliente;
		setValor();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getValor() {
		return valor;
	}

	private void setValor() {
		valor = cliente.getPlano().getValorInicial() + (cliente.getAnosConvenio() * cliente.getPlano().getValorInicial() * 0.01);
	}

	public Integer getParcelaReferencia() {
		return parcelaReferencia;
	}

	public void setParcelaReferencia(Integer parcelaReferencia) {
		this.parcelaReferencia = parcelaReferencia;
	}

	public MensalidadeState getMensalidadeState() {
		return mensalidadeState;
	}

	public void setMensalidadeState(MensalidadeState mensalidadeState) {
		this.mensalidadeState = mensalidadeState;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public MensalidadeDTO getMensalidadeDTO() {
		MensalidadeDTO obj = new MensalidadeDTO();
		obj.carteirinhaCliente = cliente.getCarteirinha();
		obj.id = id;
		obj.parcelaReferencia = parcelaReferencia;
		obj.valor = valor;
		if(mensalidadeState instanceof Pago) {
			obj.mensalidadeEstado = 0;
		}else {
			if(mensalidadeState instanceof NoPrazo) {
				obj.mensalidadeEstado = 1;
			}else {
				if(mensalidadeState instanceof Atrasado) {
					obj.mensalidadeEstado = 2;
				}else {
					obj.mensalidadeEstado = -1;
				}
			}
		}
		return obj;
	}
}
