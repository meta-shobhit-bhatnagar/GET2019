package com.animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZooTest {

    /**
     * test for adding zones in the zoo
     */
    @Test
    public void addZoneTest() {
        Zoo zoo = new Zoo();
        assertTrue(zoo.addZone(AnimalFamily.MAMMAL, 2, true, true));
        assertTrue(zoo.addZone(AnimalFamily.BIRD, 2, false, true));
        assertTrue(zoo.addZone(AnimalFamily.REPTILE, 2, false, false));
    }
    
    
    
    
    /**
     * test for adding cage in the zoo when compatible zone is present
     */
    @Test
    public void addCageTest1() {
        Zoo zoo = new Zoo();
        zoo.addZone(AnimalFamily.MAMMAL, 2, true, true);
        assertTrue(zoo.addCage(AnimalName.LION, 3));
    }
	
    
    /**
     * test for adding an animal(lion in this case) in the zoo when compatible cage is present
     */
    @Test
    public void addAnimalTest1() {
        Zoo zoo = new Zoo();
        zoo.addZone(AnimalFamily.MAMMAL, 2, true, true);
        zoo.addCage(AnimalName.LION, 3);
        assertTrue(zoo.addAnimal(new Lion(25, 12)));
    }
    
    /**
     * test to remove an animal from the zoo when it is present
     */
    @Test
    public void removeAnimalTest1() {
        Zoo zoo = new Zoo();
        zoo.addZone(AnimalFamily.MAMMAL, 2, true, true);
        zoo.addCage(AnimalName.LION, 3);
        zoo.addAnimal(new Lion(25, 12));
        assertTrue(zoo.removeAnimal(AnimalName.LION));
    }
    
    
    /**
     * test for adding zones in the zoo, when one animalSpecies is passed as null
     */
    @Test
    public void addZoneNegativeTest1() {
        Zoo zoo = new Zoo();
        assertTrue(zoo.addZone(AnimalFamily.MAMMAL, 2, true, true));
        assertTrue(zoo.addZone(AnimalFamily.BIRD, 2, false, true));
        assertTrue(zoo.addZone(AnimalFamily.REPTILE, 2, false, false));
        assertTrue(zoo.addZone(null, 2, false, true));						//Negative Test Case: for checking null 
    }
    
      
    
    /**
     * test for adding cage in the zoo to different zone 
     */
    @Test
    public void addCageNegativeTest2() {
        Zoo zoo = new Zoo();
        zoo.addZone(AnimalFamily.MAMMAL, 2, true, true);
        assertTrue(zoo.addCage(AnimalName.PARROT, 3));							//Negative Test Case: Adding PARROT to MAMMAL Zone
    }
    
    
    /**
     * test for adding cages in the zoo exceeding the capacity of the zone
     */
    @Test
    public void addCageNegativeTest3() {
        Zoo zoo = new Zoo();
        zoo.addZone(AnimalFamily.MAMMAL, 2, true, true);
        zoo.addCage(AnimalName.LION, 3);
        zoo.addCage(AnimalName.LION, 3);
        zoo.addCage(AnimalName.LION, 3);		//Negative Test Case: adding the third cage when capacity of zone is two
    }
    
    
    
    

    /**
     * test for adding an animal(lion in this case) in the zoo when compatible cage is not present
     */
    @Test
    public void addAnimalNegativeTest4() {
        Zoo zoo = new Zoo();
        zoo.addZone(AnimalFamily.MAMMAL, 2, true, true);
        zoo.addCage(AnimalName.ELEPHANT, 3);
        zoo.addAnimal(new Lion(25, 12));				//Negative Test Case: adding Lion to Elephant cage
    }
    
    
    
    /**
     * test for adding animals(elephant in this case) in the zoo exceeding the capacity of the cage
     */
    @Test
    public void addAnimalNegativeTest5() {
        Zoo zoo = new Zoo();
        zoo.addZone(AnimalFamily.MAMMAL, 2, true, true);
        zoo.addCage(AnimalName.ELEPHANT, 3);
        zoo.addAnimal(new Elephant(250, 12));
        zoo.addAnimal(new Elephant(180, 10));
        zoo.addAnimal(new Elephant(25, 2));
        zoo.addAnimal(new Elephant(25, 2)); 				//Negative Test Case: Adding the fourth elephant when capacity of cage is three
    }
    
    
    
    
    
    
    /**
     * test to remove an animal from the zoo when it is not present
     */
    @Test
    public void removeAnimalNegativeTest6() {
        Zoo zoo = new Zoo();
        zoo.addZone(AnimalFamily.MAMMAL, 2, true, true);
        zoo.addCage(AnimalName.LION, 3);
        zoo.addAnimal(new Lion(25, 12));
        zoo.removeAnimal(AnimalName.ELEPHANT);					//Negative Test Case: Removing elephant when it's not present in the cage
    }
    
}
