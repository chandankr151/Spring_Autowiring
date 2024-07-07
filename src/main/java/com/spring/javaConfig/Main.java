package com.spring.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);

		Emp emp = context.getBean("employee", Emp.class);
		System.out.println(emp);
	}
}