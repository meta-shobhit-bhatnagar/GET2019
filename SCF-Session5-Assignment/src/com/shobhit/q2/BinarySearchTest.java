package com.shobhit.q2;

import static org.junit.Assert.*;

import org.junit.Test;


import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BinarySearchTest {
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{ new int[] {1, 3, 5, 7}, 0,  3, 1, 0}, 
			{ new int[] {15 ,20 , 60}, 0, 2, 20, 1}, 
			{ new int[] {2 ,15 ,30 ,21, 154},0, 4, 154, 0},//Negative test case
			{ new int[] {0, 0, 1}, 0, 2, 2, 0} //Negative test case
		});
	}
	

	private int [] farr;
	private int fsearchItem;
	private int fLeftIndex;
	private int fRightIndex;
	private int fexpected;
	private SearchElement obj1 = new SearchElement();


	public BinarySearchTest(int[] farr, int fLeftIndex,
			int fRightIndex, int fsearchItem, int fexpected) {
		super();
		this.farr = farr;
		this.fsearchItem = fsearchItem;
		this.fLeftIndex = fLeftIndex;
		this.fRightIndex = fRightIndex;
		this.fexpected = fexpected;
	}



	@Test
	public void testSearchBinary() {
		assertEquals(fexpected, obj1.binarySearch(farr, fLeftIndex, fRightIndex, fsearchItem ));
	}
	
	

}
