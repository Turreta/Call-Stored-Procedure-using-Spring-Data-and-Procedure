package com.turreta.springboot.springdata.sp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ComTurretaSpringbootSpringdataSpApplication {

	public static void main(String[] args) {
		ApplicationContext c = SpringApplication.run(ComTurretaSpringbootSpringdataSpApplication.class, args);

		PersonRepository repo = c.getBean(PersonRepository.class);
		repo.addPerson("KL");
		repo.addPerson("SG");
	}
}
