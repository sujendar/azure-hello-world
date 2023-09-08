package com.example.helloworld;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.azure.security.keyvault.secrets.SecretClient;

@SpringBootApplication
public class HelloworldApplication implements CommandLineRunner{
	
	 private  final SecretClient secretClient;

	    public HelloworldApplication(SecretClient secretClient) {
	        this.secretClient = secretClient;
	    }

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		  System.out.println("h2url: " + secretClient.getSecret("Demourl").getValue());
		
	}

}
