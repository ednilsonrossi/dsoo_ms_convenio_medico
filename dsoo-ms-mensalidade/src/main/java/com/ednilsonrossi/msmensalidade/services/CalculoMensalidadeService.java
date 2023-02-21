package com.ednilsonrossi.msmensalidade.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ednilsonrossi.msmensalidade.feignclients.Calculo;
import com.ednilsonrossi.msmensalidade.feignclients.ICalculoFeignCliente;

@Service
public class CalculoMensalidadeService {

	@Autowired
	private ICalculoFeignCliente feignCliente;
	
	public double getValorMensalidade() {
		Calculo c = feignCliente.calcular().getBody();
		return c.getValor();
	}
	
}
