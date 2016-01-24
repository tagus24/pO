package com.professionals.web.springboot.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class ConfigurationInitializer {
	
	  @RequestMapping("/")
	    String home() {
	        return "Hello World!";
	    }

	    public static void main(String[] args) throws Exception {
	        SpringApplication.run(ConfigurationInitializer.class, args);
	    }

}
