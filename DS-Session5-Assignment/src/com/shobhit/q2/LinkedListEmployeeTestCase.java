package com.shobhit.q2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinkedListEmployeeTestCase {

	LinkedListEmployee list = new LinkedListEmployee();
	@Before
	public void Initialize(){

	

	list.append(new Employee(4000, "Shobhit", 21));   
	list.append(new Employee(8000.0, "Prerna", 24));
	list.append(new Employee(6000.0, "Himanshu", 28));
	list.append(new Employee(10000.0, "Akhilesh", 34));
	list.append(new Employee(2000.0, "Govinda", 22));

	}	

	@Test
	public void EmployeeLinkedListSortingTest() {
		LinkedListEmployee list2 = new LinkedListEmployee();
	
	list2.append(new Employee(10000.0, "Akhilesh", 34));
	list2.append(new Employee(4000, "Shobhit", 21));
	list2.append(new Employee(8000.0, "Prerna", 24));
	list2.append(new Employee(6000.0, "Himanshu", 28));
	list2.append(new Employee(10000.0, "Akhilesh", 34));


	assertEquals(list2 , list.mergeSort(list.head));
	}

}
