package com.ednilsonrossi.msplanos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DsooMsPlanosApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsooMsPlanosApplication.class, args);
	}

}
