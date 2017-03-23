package com.balaji.ms.registry.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceRegistry {

	public static void main(String[] args) {
		
		System.setProperty("spring.config.name", "service-registry");
		System.out.println("Balaji Penamalli-Created a new Eureka Server.");
		SpringApplication.run(EurekaServiceRegistry.class, args);

	}

}
