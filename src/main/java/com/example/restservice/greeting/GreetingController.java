package com.example.restservice.greeting;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello Crack, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/game_marcoscga_cambio2")
	public GreetingUpdated greeting(@RequestParam(value = "name", defaultValue = "Marcos") String name) {
		return new GreetingUpdated(counter.incrementAndGet(), String.format(template, name));
	}
}
