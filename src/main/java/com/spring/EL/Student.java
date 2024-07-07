package com.spring.EL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {

	@Value("#{2+3}")
	public int sum;
	@Value("#{6-3}")
	public int sub;
	@Value("#{2*3}")
	public int mul;
	@Value("#{9/2}")
	public int div;

	@Value("#{1==1}")
	public boolean equalvalid;

	public static void call() {
		System.out.println("Method called");
	}

	@Value("#{2>2}")
	public boolean greaterValue;

	@Value("#{1 lt 2}")
	public boolean lessThan;

	@Value("#{2 ^ 9}") // 512
	private double powerOf;

	@Value("#{(2 + 2) * 2 + 9}") // 17
	private double brackets;

	@Value("#{2 > 1 ? 'a' : 'b'}") // "a"
	private String ternary;

	@Value("#{T(java.lang.Math).PI}")
	public int num;

	@Value("#{T(com.spring.EL.Student).call()}")
	public String result;

	@Override
	public String toString() {
		return "Student [sum=" + sum + ", sub=" + sub + ", mul=" + mul + ", div=" + div + ", equalvalid=" + equalvalid
				+ ", greaterValue=" + greaterValue + ", lessThan=" + lessThan + ", powerOf=" + powerOf + ", brackets="
				+ brackets + ", ternary=" + ternary + ", num=" + num + ", result=" + result + "]";
	}

	
}
