package com.example.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	
	  @Value("${DemoSecret}") 
	  public String demosecret;
	 
	  
	  @Value("${topicKey}")
	  public String topicKey;
	 
	  @Value("${demoMgm}") 
	  public String mgmsecret;
	 
    @GetMapping("/hello")
	public String get() {
    	// KeyVaultSecret keyVaultSecret = keyVaultClient.getSecret("DemoSecret");
		return "HelloWorld " +demosecret +mgmsecret;
		
	}
}
