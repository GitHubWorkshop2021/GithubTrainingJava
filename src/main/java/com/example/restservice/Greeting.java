package com.example.restservice;

public class Greeting {

	private final long id;
	private final String content;

	public Greeting(long id, String content) {
		System.out.println("El betis es el mejor");
		this.id = id;
		this.content = content;
	}

	public long getId() {
		System.out.println("soy un tio conflictivo de git");
		return id;
	}

	public String getContent() {
		System.out.println("El betis es el mejor");

		return content;
	}
}
