package com.shobhit.q3;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Test case for NQueen problem 
 * @author Shobhit
 *
 */
@RunWith(Parameterized.class)
public class NQueenTest {
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{  1, true}, 
			{  2, false }, 
			{  3, true },//Negative test case
			{  4, false} //Negative test case
		});
	}
	
	private int fsize;
	private boolean fexpected;
	private NQueenProblem obj= new NQueenProblem();
	

	public NQueenTest(int fsize, boolean fexpected) {
		super();
		this.fsize = fsize;
		this.fexpected = fexpected;
	}



	@Test
	public void NQueenTest() {
		assertEquals(fexpected, obj.solveNQueenOneSolution(fsize));
	}

}
