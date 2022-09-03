package com.uce.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.uce.edu.demo.service.IPersonaService;

@SpringBootApplication
public class ProyectoUnidad4WcApplication implements CommandLineRunner{
	
	@Autowired
	private IPersonaService ipersonaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoUnidad4WcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
