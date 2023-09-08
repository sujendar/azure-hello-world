package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "wallet")
@Configuration
public class Props {
 private String demourl;

public String getDemourl() {
	return demourl;
}

public void setDemourl(String demourl) {
	this.demourl = demourl;
}
 
}
