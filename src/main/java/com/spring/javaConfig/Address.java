package com.spring.javaConfig;

public class Address {

	private String name;

	public Address(String name) {
		super();
		this.name = name;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [name=" + name + "]";
	}

}
