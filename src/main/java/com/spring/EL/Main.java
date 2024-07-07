///https://www.baeldung.com/spring-expression-language

package com.spring.EL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/EL/config.xml");
		Student student1 = context.getBean("student", Student.class);
		System.out.println(student1);
	}
}