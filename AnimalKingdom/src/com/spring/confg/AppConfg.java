package com.spring.confg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.beans.Animal;
import com.spring.beans.LandAnimal;
import com.spring.beans.Person;
import com.spring.beans.WaterAnimal;

@Configuration
public class AppConfg {
	@Bean("animal")
	public Animal getAnimal() {
		Animal a=new WaterAnimal("Shark", true, "White", "Water animal");
		return a;
	}
	
	@Bean("person")
	public Person getPerson() {
		Person p=new Person("Sam",21);
		return p;
	}
	
	@Bean("typeofAnimal")
	public LandAnimal getTypeOfAnimal() {
		LandAnimal a=new LandAnimal("Tiger", true, "Bengal", "Carnivore");
		return a;
		
	}

}
