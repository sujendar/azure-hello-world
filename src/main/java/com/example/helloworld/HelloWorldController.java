package com.example.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class HelloWorldController {
	/*
	 * private final Logger logger =
	 * LoggerFactory.getLogger((HelloWorldController.class));
	 * 
	 * @Value("${DemoSecret}") public String demosecret;
	 * 
	 * 
	 * @Value("${topicKey}") public String topicKey;
	 * 
	 * @Value("${Demourl}") private String demourl;
	 * 
	 * 
	 * private final SecretClient secretClient;
	 * 
	 * public HelloWorldController(SecretClient secretClient) { this.secretClient =
	 * secretClient; }
	 * 
	 * 
	 * @GetMapping("/hello") public String get() { // KeyVaultSecret keyVaultSecret
	 * = keyVaultClient.getSecret("DemoSecret"); logger.info("its in method");
	 * String Demourl=null;
	 * 
	 * try { Demourl=secretClient.getSecret("Demourl").getValue(); }catch (Exception
	 * e) { logger.info("its in exception",e);
	 * System.out.println("exception in catch block"+e); }
	 * 
	 * return "HelloWorld " +demosecret +Demourl;
	 * 
	 * }
	 */
}
