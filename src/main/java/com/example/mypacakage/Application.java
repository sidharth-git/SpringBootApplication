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
    
    private static final Logger logger = LoggerFactory.getLogger(Application.class);
    
    @RequestMapping(value="/")
    public String index() {
        logger.info("Hello from Spring Boot Logging Application");
        logger.info("This is sample info message");
        logger.debug("Debugging Spring Boot Application");
        logger.warn("This is sample warn message");
        logger.error("This is sample error message");
        return "<h1>Hello world</h1>";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

