package com.shobhit.q1;

import static org.junit.Assert.*;

import java.util.ArrayList;
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
		eObject.addEmployee(new Employee(10,"Ramesh","Shashtri Colony, Hyderabad"));
		 
		List<Employee> expectedResult= new ArrayList<Employee>();
		expectedResult.add(new Employee(3,"Rajesh","Plot-21, C.P Colony, Ghaziabad"));
		expectedResult.add(new Employee(10,"Ramesh","Shashtri Colony, Hyderabad"));
		expectedResult.add(new Employee(13,"Twinkle","Gandhi Marg, Jaipur"));
		
		eObject.employeeSortOnId();
		
		for (int i = 0; i < expectedResult.size(); i++) {
			assertEquals(expectedResult.get(i).getId(), eObject
					.empCollectionList.get(i).getId());
		}
	}
	
	@Test
	public void testEmployeeAlreadyExists(){
		EmployeeCollectionClass eObject = new EmployeeCollectionClass();
		eObject.addEmployee(new Employee(13,"Twinkle","Gandhi Marg, Jaipur"));
		eObject.addEmployee(new Employee(3,"Rajesh","Plot-21, C.P Colony, Ghaziabad"));
		eObject.addEmployee(new Employee(10,"Ramesh","Shashtri Colony, Hyderabad"));
		eObject.addEmployee(new Employee(13,"Twinkle","Gandhi Marg, Jaipur"));
		
		List<Employee> expectedResult= new ArrayList<Employee>();
		expectedResult.add(new Employee(3,"Rajesh","Plot-21, C.P Colony, Ghaziabad"));
		expectedResult.add(new Employee(10,"Ramesh","Shashtri Colony, Hyderabad"));
		expectedResult.add(new Employee(13,"Twinkle","Gandhi Marg, Jaipur"));
		
eObject.employeeSortOnId();
		
		for (int i = 0; i < expectedResult.size(); i++) {
			assertEquals(expectedResult.get(i).getId(), eObject
					.empCollectionList.get(i).getId());
		}
	}
}