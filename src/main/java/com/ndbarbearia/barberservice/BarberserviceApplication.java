package com.ndbarbearia.barberservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ndbarbearia.barberservice", "com.ndbarbearia.useCases"})
public class BarberserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BarberserviceApplication.class, args);
	}

}
