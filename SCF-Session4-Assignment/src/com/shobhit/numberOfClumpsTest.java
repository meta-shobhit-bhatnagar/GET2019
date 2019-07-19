package com.shobhit;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class numberOfClumpsTest {

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { 
			{ new int [] {1, 2, 2, 3, 4, 4}, 2 }, 
			{ new int [] {1, 1, 2, 1, 1}, 2 }, 
			{ new int [] {1, 1, 1, 1, 1}, 1 },
			{ new int [] {}, 1 }  //Negative test case
		});
	}

	public int[] fInput;
	public int fExpected;


	public numberOfClumpsTest(int input[], int expected) {
		this.fInput = input;
		this.fExpected = expected;
	}

	@Test
	public void test() {
		ArrOperation obj4 = new ArrOperation();
		try{
			assertEquals(fExpected,obj4.numberOfClumps(fInput));
		}
		catch (AssertionError e) {
			System.out.println("Null Array, AssertionError "+ e);
		}	
	}

}
