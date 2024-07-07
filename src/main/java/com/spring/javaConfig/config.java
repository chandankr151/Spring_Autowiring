package com.spring.javaConfig;

import org.springframework.context.annotation.Bean;
///import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class config {

	@Bean
	@Primary
	public Address address() {
		return new Address("Second Bean");
	}

	// @Bean(name = "employee")
	@Bean(name = { "employee" })
	public Emp getEmp() {
		return new Emp(address());
	}
}
