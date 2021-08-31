package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceApplication {

	//TODO @marcoscga comentario jodón
    public static void main(String[] args) {
    	System.out.println("Print de consola");
        SpringApplication.run(RestServiceApplication.class, args);
    }
    
    public static void blabla() {
    	System.out.println("Print de consola");
    }
}
