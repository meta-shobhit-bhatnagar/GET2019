package com.shobhit.q1;

import static org.junit.Assert.*;

import org.junit.Test;
/*
 * This is a test class for verifying whether output and 
 * expected results match or not 
 */
public class IntSetTestCase {
	
	
	@Test
	public void IntSet1 () {
	int [] array1 = {1,2,4,7,10};

	IntSet set1 = new IntSet(array1);

	assertTrue(set1.isMember(7));				//checks whether 7 is a member of the set set1

	}
	
	
	@Test
	public void IntSet2 () {
	int [] array1 = {1,2,4,7,10};
	

	IntSet set1 = new IntSet(array1);

	assertEquals(5,set1.sizeOfSet());			//checks if the size of the set set1 is 5 or not

	}
	
	
	
	@Test
	public void IntSet3 () {
	int [] array1 = {1,2,4,7,10};
	int [] array2 = {1,2,3,4,5,7,10,12,34,45};

	IntSet set1 = new IntSet(array1);
	IntSet set2 = new IntSet(array2);

	
	assertTrue(set2.isSubset(set1));			//checks if set1 is a subset of set2
	}
	
	
	@Test
	public void IntSet4 () {
	int [] array1 = {1,2,4,7,10};
	IntSet set1 = new IntSet(array1);	

	int length = 1000-set1.sizeOfSet();
	int [] complement = new int[length];
	int index=0;
	for(int i=1; i<= 1000; i++){
		if(!set1.isMember(i)){
			complement[index] = i;
			index++;
		}	
	}
	

	assertArrayEquals(complement,set1.getComplement());			//checks if complement is same as expected

	}

	
	
	@Test
	public void IntSet5 () {
		int [] array1 = {1,2,4,7,10};
		int [] array2 = {1,2,3,4,5,7,10,12,34,45};

		IntSet set1 = new IntSet(array1);
		IntSet set2 = new IntSet(array2);

		int [] array = {1,2,4,7,10,3,5,12,34,45};
		assertArrayEquals(array,set1.union(set1, set2));			//checks if union of set1 and set2 equals array[] 
	}
	
}
	
	


