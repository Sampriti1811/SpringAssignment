package com.spring.beans;

public class Animal {
	private String name;
	private boolean endanger;
	private String breed;
	
	public Animal(String name, boolean endanger,String breed) {
		super();
		this.name = name;
		this.endanger = endanger;
		this.breed=breed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isEndanger() {
		return endanger;
	}
	public void setEndanger(boolean endanger) {
		this.endanger = endanger;
	}
	
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getDetails() {
		return this.getName()+" "+this.getBreed();
	}
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", endanger=" + endanger + "]";
	}
	
	
	
	
}
