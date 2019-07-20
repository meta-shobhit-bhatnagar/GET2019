package com.shobhit.q2;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class SearchElementTest {
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{ new int[] {1, 3, 5, 7}, 3,  0, 1}, 
			{ new int[] {15 ,20 , 60}, 20, 0, 1 }, 
			{ new int[] {2 ,15 ,30 ,21, 154},154, 0, 3 },//Negative test case
			{ new int[] {0, 0, 1}, 0, 0, 2} //Negative test case
		});
	}
	

	private int [] farr;
	private int fsearchItem;
	private int findex;
	private int fexpected;
	private SearchElement obj1 = new SearchElement();


	public SearchElementTest(int[] arr, int searchitem,int findex, int expected) {
		this.farr = arr;
		this.fsearchItem= searchitem;
		this.findex = findex;
		this.fexpected= expected;
	}

	
	
	@Test
	public void testSearchLinear() {
		assertEquals(fexpected, obj1.linearSearch(farr, fsearchItem, findex));
	}
	
	

}
