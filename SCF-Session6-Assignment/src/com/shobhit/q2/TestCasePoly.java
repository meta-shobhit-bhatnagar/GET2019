package com.shobhit.q2;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * contains test cases for different polynomial operations
 * @author Shobhit
 *
 */
public class TestCasePoly {
	
	/**
	 * It evaluates the polynomial expression when x is supplied with numeric value, if the expression produces 
	 * expected result then it's true
	 * This test case supplies 2d array as parameter to object call. array[0] represents powers of x and 
	 * array[1] contains its coefficients
	 */
	@Test
	public void Poly() {
	int [][] array = {{0,1,2,3},{1,2,3,4}}; 

	Poly p1 = new Poly(array);

	double ans = p1.evaluate(2);

	assertEquals(49.0,ans,0.00);			//evaluates if value of polynomial is equal to expected value
	}

	
	/**
	 * It adds two polynomials by supplying objects of polynomial type
	 * This test case supplies 2d array as parameter to object call. array[0] represents powers of x and 
	 * array[1] contains its coefficients
	 */
	@Test
	public void Poly2() {
	int [][] array = {{0,1,2,3},{1,2,3,4}};
	int [][] array2 = {{1,2},{7,6}};

	Poly p1 = new Poly(array);
	Poly p2 = new Poly(array2);

	int[][] addArray = p1.addPoly(p1, p2);
	int[][] expectedArr= {{0,1,2,3},{1, 9, 9, 4}};
	assertArrayEquals(expectedArr, addArray);


	
	}
	
	
	/**
	 * It multiplies two polynomials, where p1 and p2 are objects of polynomial type supplied as parameter
	 * This test case supplies 2d array as parameter to object call. array[0] represents powers of x and 
	 * array[1] contains its coefficients
	 */
	@Test
	public void Poly3() {
	int [][] array = {{0,1,2,3},{1,2,3,4}};
	int [][] array2 = {{0,1,2},{0,7,6}};

	Poly p1 = new Poly(array);
	Poly p2 = new Poly(array2);
//	p1.multiplyPoly(p1, p2);

	int[][] expectedArr= {{1,2,3,4,5},{7,20,33,46,24}};

	int [][] multiplyPoly = p1.multiplyPoly(p1, p2);
	
	assertArrayEquals(expectedArr,  multiplyPoly);
	}
	
	

}