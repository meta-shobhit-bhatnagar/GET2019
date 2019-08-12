package com.animal;

/**
 * This class inherits the Zone class and used to add Reptile Zone in the Zoo
 * @author Shobhit Bhatnagar
 */
public class ReptileZone extends Zone{

    /**
     * It initializes the ReptileZone properties into Zoo
     * @param capacity
     * @param hasPark
     * @param hasCanteen
     */
	public ReptileZone(int capacity, boolean hasPark, boolean hasCanteen) {
		
	    super(AnimalFamily.REPTILE, capacity, hasPark, hasCanteen);
	}
}
