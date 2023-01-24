package com.ednilsonrossi.msprocedimento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DsooMsProcedimentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsooMsProcedimentoApplication.class, args);
	}

}
