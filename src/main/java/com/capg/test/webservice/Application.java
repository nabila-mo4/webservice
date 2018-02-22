package com.capg.test.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import cucumber.api.java.en.Given;


@SpringBootApplication
public class Application {
	@Given("ton service est démarré")
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
