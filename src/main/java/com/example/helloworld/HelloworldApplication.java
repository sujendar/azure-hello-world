package com.example.helloworld;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.azure.security.keyvault.secrets.SecretClient;

@SpringBootApplication
public class HelloworldApplication {
	


	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

	

}
