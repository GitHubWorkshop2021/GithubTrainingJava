package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceApplication {

	//TODO @marcoscga comentario jodón que ha cambiado en segundo commit
    public static void main(String[] args) {
    	System.out.println("El betis es el mejor");

		System.out.println("soy un tio conflictivo de git");
    	System.out.println("Print de consola");
        SpringApplication.run(RestServiceApplication.class, args);
        int i = 0;
    }

    public void noseusa(int i) {
    	
    }
    
    public static void blabla() {
    	System.out.println("Print de consola");
    }
}
