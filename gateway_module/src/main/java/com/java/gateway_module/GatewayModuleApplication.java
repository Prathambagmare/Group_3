package com.java.gateway_module;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
class GatewayModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayModuleApplication.class, args);
	}

}
