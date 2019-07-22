package com.shobhit.q2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPoly {
	
	@Test
	public void Poly() {
	int [][] array = {{0,1,2,3},{1,2,3,4}};

	Poly p1 = new Poly(array);

	double ans = p1.evaluate(2);
	System.out.println(ans);

	assertEquals(49.0,ans,0.00);
	}

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
	
	@Test
	public void Poly3() {
	int [][] array = {{0,1,2,3},{1,2,3,4}};
	int [][] array2 = {{1,2},{7,6}};

	Poly p1 = new Poly(array);
	Poly p2 = new Poly(array2);


	int[][] expectedArr= {{0,1,2,3,4,5},{0,7,15,33,46,24}};

	int [][] multiplyPoly = p1.multiplyPoly(p1, p2);
	assertArrayEquals(expectedArr,  multiplyPoly);
	}
	
	

}