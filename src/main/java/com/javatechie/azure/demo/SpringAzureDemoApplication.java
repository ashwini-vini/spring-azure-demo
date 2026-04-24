package com.javatechie.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController

public class SpringAzureDemoApplication {

	@GetMapping("/message")
	public String message(){
		return "Congrats ! Your app deployed successfully in Azure !";

	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemoApplication.class, args);
	}

}
