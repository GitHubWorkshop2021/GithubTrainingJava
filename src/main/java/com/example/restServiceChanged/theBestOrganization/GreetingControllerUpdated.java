package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
//	System.out.println("soy un tio conflictivo de git");

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

//	System.out.println("El betis es el mejor");

	@GetMapping("/greeting_conflictos")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World mas conflictos") String name) {
		System.out.println("El betis es el mejor");

		System.out.println("soy un tio conflictivo de git");
		return new Greeting(counter.incrementAndGet(), String.format(template, name));

	}
}