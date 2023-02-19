package com.ednilsonrossi.msclientemanager.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ednilsonrossi.msclientemanager.model.PlanoSaude;

@Component
@FeignClient(name = "ms-plano", path="/planos")
public interface IPlanoFeignClient {

	@GetMapping(value = "/{ans}")
	public ResponseEntity<PlanoSaude> findPlano(@PathVariable Long ans);
	
}
