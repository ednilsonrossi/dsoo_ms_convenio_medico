package com.ednilsonrossi.msmensalidade.feignclients;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(name = "ms-calcular", path = "/calculate")
public interface ICalculoFeignCliente {

	@GetMapping
	public ResponseEntity<Calculo> calcular();
	
}
