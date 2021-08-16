package com.team6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class BackendApplication {

	public static void main(String[] args) {
		System.out.println("running");
		SpringApplication.run(BackendApplication.class, args);
	}

}
