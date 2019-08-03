package com.shobhit.q1;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.shobhit.q3.MolecularWeight;

public class EmployeeTestCase {

	@Test
	public void testSortById()
	{

		EmployeeCollectionClass eObject = new EmployeeCollectionClass();
		eObject.addEmployee(new Employee(13,"Twinkle","Gandhi Marg, Jaipur"));
		eObject.addEmployee(new Employee(3,"Rajesh","Plot-21, C.P Colony, Ghaziabad"));
		eObject.addEmployee(new Employee(10,"Ramesh","Shashtri Colony, Golkonda"));
		 
		eObject.employeeSortOnId();
		Employee Iterator= eObject Iterator();
		assertEquals("Rajesh", eObject.Iterator().next.getName());
		assertEquals("Ramesh", employeeList.get(1).getName());
	}
}