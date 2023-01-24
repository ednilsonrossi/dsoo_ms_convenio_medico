package com.ednilsonrossi.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DsooMsEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsooMsEurekaServerApplication.class, args);
	}

}
