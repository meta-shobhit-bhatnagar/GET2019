package com.shobhit.q3;

import static org.junit.Assert.*;

import org.junit.Test;

public class MolecularWeightTestCase {

	/**
	 * Test case for simple molecular compound
	 */
	@Test
	public void Test1() {
		MolecularWeight obj1 =new MolecularWeight();
		assertEquals(16, obj1.calculateCompoundMass("CH4"));
	}
	
	/**
	 * Test case for complex molecular compound
	 */
	@Test
	public void Test2() {
		MolecularWeight obj1 =new MolecularWeight();
		assertEquals(180, obj1.calculateCompoundMass("C6H12O6"));
	}
	
	/**
	 * Test case for complex molecular compound nesting brackets
	 */
	@Test
	public void Test3() {
		MolecularWeight obj1 =new MolecularWeight();
		assertEquals(791, obj1.calculateCompoundMass("C2H3(C12(OH)13)2(OH)2"));
	}
	
	/**
	 * Test case for invalid molecular compound
	 */
	@Test(expected = AssertionError.class)
	public void InvalidCompoundTestCase(){
		MolecularWeight obj =new MolecularWeight();
		obj.calculateCompoundMass("C2H3regdgr(C12(OH)13)2(OH)2");
	}
}
