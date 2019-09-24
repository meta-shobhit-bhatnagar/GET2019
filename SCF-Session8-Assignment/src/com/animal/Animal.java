package com.animal;

/**
 * The Animal class is the superclass of all the animal subclasses. It stores the basic properties of animal.
 * @author Shobhit Bhatnagar
 * Here multiple properties are present for each animal
 */
public class Animal {

	private final String name;
	private double weight;
	private int age;
	private final String sound;
	private final int numberOfLegs;
	private final AnimalFamily category;
	private final AnimalName animalType;
	
	
	/**
	 * This constructor initializes the animal with all the properties
	 * @param name 
	 * @param weight
	 * @param age
	 * @param sound
	 * @param numberOfLegs
	 * @param category
	 * @param animalType
	 */
	public Animal (String name, double weight, int age, String sound, int numberOfLegs, AnimalFamily category, AnimalName animalType)
	{
		this.name = name;
		this.weight = weight;
		this.age = age;
		this.sound = sound;
		this.numberOfLegs = numberOfLegs;
		this.category = category;
		this.animalType = animalType;
	}

	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getSound() {
		return sound;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public AnimalName getAnimalType() {
		return animalType;
	}

	public AnimalFamily getCategory() {
		return category;
	}
}
