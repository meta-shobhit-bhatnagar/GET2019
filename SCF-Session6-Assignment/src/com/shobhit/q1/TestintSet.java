package com.shobhit.q1;

import static org.junit.Assert.*;

import org.junit.Test;
/*
 * This is a test class for verifying whether output and 
 * expected results match or not 
 */
public class TestintSet {
	
	
	@Test
	public void IntSet1 () {
	int [] array1 = {1,2,4,7,10};
	int [] array2 = {1,2,3,4,5,7,10,12,34,45};

	IntSet set1 = new IntSet(array1);
	IntSet set2 = new IntSet(array2);

	int length = 1000-set1.sizeOfSet();
	int [] complement = new int[length];
	int index=0;
	for(int i=1; i<= 1000; i++){
	if(!set1.isMember(i)){
	complement[index] = i;
	index++;
	}	
	}

	/*
	for(int index1 = 0; index1 < complement.length; index1++)
	System.out.println(complement[index1]+"  ");
	*/	

	assertTrue(set1.isMember(7));

	}
	@Test
	public void IntSet2 () {
	int [] array1 = {1,2,4,7,10};
	int [] array2 = {1,2,3,4,5,7,10,12,34,45};

	IntSet set1 = new IntSet(array1);
	IntSet set2 = new IntSet(array2);

	int length = 1000-set1.sizeOfSet();
	int [] complement = new int[length];
	int index=0;
	for(int i=1; i<= 1000; i++){
	if(!set1.isMember(i)){
	complement[index] = i;
	index++;
	}	
	}
	
	assertFalse(set2.isMember(32));

	assertEquals(5,set1.sizeOfSet());
	assertNotEquals(13,set2.sizeOfSet());

	int [] array = {1,2,4,7,10,3,5,12,34,45};
	assertArrayEquals(array,set1.union(set1, set2));
}
	
	@Test
	public void IntSet3 () {
	int [] array1 = {1,2,4,7,10};
	int [] array2 = {1,2,3,4,5,7,10,12,34,45};

	IntSet set1 = new IntSet(array1);
	IntSet set2 = new IntSet(array2);

	int length = 1000-set1.sizeOfSet();
	int [] complement = new int[length];
	int index=0;
	for(int i=1; i<= 1000; i++){
	if(!set1.isMember(i)){
	complement[index] = i;
	index++;
	}	
	}
	assertTrue(set2.isSubset(set1));

	assertArrayEquals(complement,set1.getComplement());

	}
}


