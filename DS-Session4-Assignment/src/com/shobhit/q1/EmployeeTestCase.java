package com.shobhit.q1;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTestCase {

	public class EmployeeCollectionTest {

	    EmployeeCollectionClass employeeCollection;
	    
	    @Before
	    public void init() {
	    	EmployeeCollectionClass e=new EmployeeCollectionClass();
	    	
			e.addEmployee(new Employee(3,"Rajesh","Plot-21, C.P Colony, Ghaziabad"));
			e.addEmployee(new Employee(13,"Twinkle","Gandhi Marg, Jaipur"));
			e.addEmployee(new Employee(10,"Ramesh","Shashtri Colony, Golkonda"));
			e.addEmployee(new Employee(1,"Vijay","Morar, Gwalior"));
			e.addEmployee(new Employee(5,"Rajneesh","L.A, California"));
	    }
	    
	     @Test
	    public void test_addEmployee_WhenAddedWithUniqueID_ReturnTrue() {
	        assertEquals(true, employeeCollection.addEmployee(new Employee(20, "Ayushi", "40/447 Pratapnagar")));
	    }
	     
	    @Test(expected = AssertionError.class)
	    public void test_addEmployee_WhenAddedWithDuplicateID_ThrowAssertionError() {
	        assertEquals("Duplicate employee should not be added!!", employeeCollection.addEmployee(new Employee(18, "Rajesh", "34/488 Pratapnagar")));
	    }
	    
	     @Test
	    public void test_checkNaturalOrderSorting_When_CheckByNameOrID_Return_NameOrID() {
	        employeeCollection.sortNaturalOrder();

	        assertEquals(10,employeeCollection.getEmployeeList().get(0).getId());
	        assertEquals("Ania",employeeCollection.getEmployeeList().get(0).getName());

	        assertEquals(12,employeeCollection.getEmployeeList().get(1).getId());
	        assertEquals("Sam",employeeCollection.getEmployeeList().get(1).getName());
	        
	        assertEquals(18,employeeCollection.getEmployeeList().get(2).getId());
	        assertEquals("Ayushi",employeeCollection.getEmployeeList().get(2).getName());

	        assertEquals(23,employeeCollection.getEmployeeList().get(3).getId());
	        assertEquals("Kim",employeeCollection.getEmployeeList().get(3).getName());

	        assertEquals(28,employeeCollection.getEmployeeList().get(4).getId());
	        assertEquals("John",employeeCollection.getEmployeeList().get(4).getName());
	    }
	    
	     @Test
	    public void test_checkSortingByName_When_CheckByNameOrID_Return_NameOrID() {
	        employeeCollection.sortByName();      

	        assertEquals(10,employeeCollection.getEmployeeList().get(0).getId());
	        assertEquals("Ania",employeeCollection.getEmployeeList().get(0).getName());

	        assertEquals(18,employeeCollection.getEmployeeList().get(1).getId());
	        assertEquals("Ayushi",employeeCollection.getEmployeeList().get(1).getName());
	        
	        assertEquals(28,employeeCollection.getEmployeeList().get(2).getId());
	        assertEquals("John",employeeCollection.getEmployeeList().get(2).getName());

	        assertEquals(23,employeeCollection.getEmployeeList().get(3).getId());
	        assertEquals("Kim",employeeCollection.getEmployeeList().get(3).getName());

	        assertEquals(12,employeeCollection.getEmployeeList().get(4).getId());
	        assertEquals("Sam",employeeCollection.getEmployeeList().get(4).getName());
	    }  
	}