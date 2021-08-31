package com.example.restservice.greeting;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello Marcos, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/game_marcoscga")
	public GreetingUpdated greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new GreetingUpdated(counter.incrementAndGet(), String.format(template, name));
	}
}
