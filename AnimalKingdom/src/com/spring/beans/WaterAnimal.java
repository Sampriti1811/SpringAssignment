package com.spring.beans;

public class WaterAnimal extends Animal{
	
	private String type;

	public WaterAnimal(String name, boolean endanger, String breed, String type) {
		super(name, endanger, breed);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getDetails() {
		return this.getName()+" "+this.getBreed();
	}

	@Override
	public String toString() {
		return "WaterAnimal [type=" + type + ", getType()=" + getType() + ", getDetails()=" + getDetails()
				+ ", getName()=" + getName() + ", isEndanger()=" + isEndanger() + ", getBreed()=" + getBreed()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	

}
