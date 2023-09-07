package com.example.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azure.security.keyvault.secrets.models.KeyVaultSecret;

@RestController
public class HelloWorldController {
	
	  @Value("${topicEndpoint}") 
	  public String topicEndpoint;
	  
	  @Value("${topicKey}")
	  public String topicKey;
	  @Autowired
	  @Qualifier(value = "KeyVaultAutoconfiguredClient")
	  private  KeyVaultClient keyVaultClient;
	 
    @GetMapping("/hello")
	public String get() {
    	 KeyVaultSecret keyVaultSecret = keyVaultClient.getSecret("DemoSecret");
		return "HelloWorld "+keyVaultSecret;
		
	}
}
