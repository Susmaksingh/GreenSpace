package com.example.GreenSpace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@PropertySource(value = "file:.env", ignoreResourceNotFound = true)
public class GreenSpaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreenSpaceApplication.class, args);
	}

}
