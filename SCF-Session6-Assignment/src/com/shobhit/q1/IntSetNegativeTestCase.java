package com.shobhit.q1;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * The test case contains all negative test cases
 * @author Shobhit
 *
 */
public class IntSetNegativeTestCase {

	
	@Test
	public void IntSet1 () {
	int [] array1 = {1,2,4,7,10};

	IntSet set1 = new IntSet(array1);

	assertTrue(set1.isMember(8));				//checks whether 8 is a member of the set set1

	}
	
	
	@Test
	public void IntSet2 () {
	int [] array1 = {1,2,4,7,10};
	

	IntSet set1 = new IntSet(array1);

	assertEquals(6,set1.sizeOfSet());			//checks if the size of the set set1 is 5 or not

	}
	
	
	
	@Test
	public void IntSet3 () {
	int [] array1 = {1,2,4,7,10,11};
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
			complement[index] = i+1;						//varying i values for negative test case
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

		int [] array = {1,2,4,7,10,3,5,12,34,45,21};
		assertArrayEquals(array,set1.union(set1, set2));			//checks if union of set1 and set2 equals array[] 
	}
}
