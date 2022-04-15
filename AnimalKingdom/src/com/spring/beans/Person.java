package com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	private String name;
	private int age;
	
	@Autowired
	private LandAnimal pet;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LandAnimal getPet() {
		return pet;
	}

	public void setPet(LandAnimal pet) {
		this.pet = pet;
	}
	
	public String getAnimalDetails() {
		return this.pet.getDetails();
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", pet=" + pet + "]";
	}
	
	

}
