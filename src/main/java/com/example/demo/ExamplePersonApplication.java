package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ExamplePersonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamplePersonApplication.class, args);
	}
	
	@GetMapping("/test")
	public String test() {
		return "Prueba servicio GET";
	}

}
