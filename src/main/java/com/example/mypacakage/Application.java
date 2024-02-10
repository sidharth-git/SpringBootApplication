package com.example.mypacakage;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Application {
	
private static final Logger Logger = LoggerFactory.getLogger(Application.class);
	@RequestMapping(value="/")
	public String index() {
		Logger.info("Hello from Spring Boot Logging Application");
		Logger.info("This is sample info message");
		Logger.debug("Debugging Spring Boot Application");
		Logger.warn("This is sample warn message");
		Logger.error("This is sample error message");
		return"<h1>Hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}