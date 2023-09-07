package com.example.helloworld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	  @Value("${topicEndpoint}") 
	  public String topicEndpoint;
	  
	  @Value("${topicKey}")
	  public String topicKey;
	 
    @GetMapping("/hello")
	public String get() {
		return "HelloWorld "+topicEndpoint;
		
	}
}
