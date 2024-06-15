package com.devbrat2k.java.memory.references.escaping;

public class Customer {
	private String name;

	public String getName() {
		return name;
	}

	public Customer(String name) {
		this.name = name;
	}
	
		public String toString() {
		return name;
	}
	
}
