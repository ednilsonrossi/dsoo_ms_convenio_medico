package com.ednilsonrossi.msclientemanager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ednilsonrossi.msclientemanager.feignclients.IPlanoFeignClient;
import com.ednilsonrossi.msclientemanager.model.PlanoSaude;

@Service
public class PlanoSaudeService {

	@Autowired
	private IPlanoFeignClient feignClient;
	
	public PlanoSaude getPlano(long ans) {
		PlanoSaude plano = feignClient.findPlano(ans).getBody();
		return plano;
	}
	
}
