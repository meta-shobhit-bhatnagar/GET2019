package com.animal;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents cages in the Zoo
 * @author Shobhit Bhatnagar
 */
public class Cage {

	private AnimalName animalName; //specifies the type of animal cage can hold, ex: lion, parrot etc
	private int capacity;
	List<Animal> listOfAnimals = new ArrayList<>();
			
	public Cage(AnimalName animalName, int capacity) {
		this.animalName = animalName;
		this.capacity = capacity;
	}
	
	public AnimalName getAnimalType() {
		return animalName;
	}

	public void setAnimalType(AnimalName animalName) {
		this.animalName = animalName;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public List<Animal> getListOfAnimals() {
		return listOfAnimals;
	}
	
	public void addAnimal(Animal animal) {
			listOfAnimals.add(animal);
	}
	
	
	/**
	 * this method is used to remove an animal from the cage
	 * @return true if animal is removed, false otherwise
	 */
	public boolean removeAnimal() {
		
		boolean removed = false;
		
		if(listOfAnimals.size() > 0)
		{
			listOfAnimals.remove(listOfAnimals.size()-1);
			removed = true;
		}
		
		return removed;
	}
	
	
	/**
	 * this methods calculates the available capacity of the cage
	 * @return the spare capacity
	 */
	public int spareCapacity() {
		return capacity - listOfAnimals.size();
	}
}
