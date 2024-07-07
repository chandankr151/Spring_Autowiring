package com.spring.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/stereotype/config.xml");
		Emp emp1 = context.getBean("employee",Emp.class);
		System.out.println(emp1);
	}
}
