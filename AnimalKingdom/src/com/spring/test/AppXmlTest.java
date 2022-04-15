package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Person;

public class AppXmlTest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Person p = (Person) context.getBean("person");
		System.out.println(p.getAnimalDetails());
		System.out.println(p);

	}
}
