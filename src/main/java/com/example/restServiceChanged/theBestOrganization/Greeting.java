package com.example.restservice.greeting;

public class GreetingUpdated {

	private final long id;
	private final String content;

	public GreetingUpdated(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
