package com.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.beans.Animal;
import com.spring.beans.LandAnimal;
import com.spring.beans.Person;
import com.spring.confg.AppConfg;

public class AppTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfg.class);
		Animal a= (Animal) context.getBean("animal");
		System.out.println(a);
		System.out.println(a.getDetails());
		
		Person p = (Person) context.getBean("person");
		System.out.println(p);
		System.out.println(p.getAnimalDetails());
		
		LandAnimal a1= (LandAnimal) context.getBean("typeofAnimal");
		System.out.println(a1);
		System.out.println(a1.getDetails());
	}

}
