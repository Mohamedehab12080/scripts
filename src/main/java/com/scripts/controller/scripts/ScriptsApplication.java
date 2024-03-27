package com.scripts.controller.scripts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.scripts")
public class ScriptsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScriptsApplication.class, args);
	}

}
