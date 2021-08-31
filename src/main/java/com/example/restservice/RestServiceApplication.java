package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceApplication {

    public static void main(String[] args) {
    	System.out.println("El betis es el mejor");

		System.out.println("soy un tio conflictivo de git");
        SpringApplication.run(RestServiceApplication.class, args);
    }

}
