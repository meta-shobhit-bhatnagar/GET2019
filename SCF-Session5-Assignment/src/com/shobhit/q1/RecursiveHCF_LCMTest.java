package com.shobhit.q1;

import static org.junit.Assert.*;


import org.junit.Test;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class RecursiveHCF_LCMTest {

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{ 1 ,5 ,5 }, 
			{ 15 ,20 , 60 }, 
			{2 ,15 ,30},
			{12 ,16 ,75}, //Negative test case
			{0, 12, 12}, //Negativ test case
			{0, 0, 0} //Negative test case
		});
	}
	
	
	
	
	private int firstNumber;
	private int secondNumber;
	private int fExpected;
	private RecursiveHCF_LCM obj1 = new RecursiveHCF_LCM();


	public RecursiveHCF_LCMTest(int fNumber, int sNumber,int expected) {
		this.firstNumber = fNumber;
		this.secondNumber= sNumber;
		this.fExpected = expected;
	}

	
	
	@Test
	public void testLCM() {
		assertEquals(fExpected, obj1.leastCommonMultiple(firstNumber, secondNumber));
	}
	
	@Test
	public void testHCF() {
		assertEquals(fExpected, obj1.highestCommonFactor(firstNumber, secondNumber));
	}

}
