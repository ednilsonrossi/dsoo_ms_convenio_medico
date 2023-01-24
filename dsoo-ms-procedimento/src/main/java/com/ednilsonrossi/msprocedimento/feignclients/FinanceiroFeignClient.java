package com.ednilsonrossi.msprocedimento.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ednilsonrossi.msprocedimento.model.Mensalidade;

@Component
@FeignClient(name = "ms-financeiro", path = "/financeiro")
public interface FinanceiroFeignClient {

	@GetMapping(value = "/{carteirinha}")
	public ResponseEntity<Mensalidade> getMensalidade(@PathVariable long carteirinha);
	
}
