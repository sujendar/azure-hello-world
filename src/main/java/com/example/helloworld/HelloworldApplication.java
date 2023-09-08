package com.example.helloworld;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.security.keyvault.secrets.SecretClient;
import com.azure.security.keyvault.secrets.SecretClientBuilder;

@SpringBootApplication
public class HelloworldApplication {
	


	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}
	@Bean
    public SecretClient createSecretClient() {
        return new SecretClientBuilder()
            .vaultUrl("https://mgm-demo-azure.vault.azure.net/")
            .credential(new DefaultAzureCredentialBuilder().build())
            .buildClient();
	}

}
