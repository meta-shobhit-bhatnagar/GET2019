package com.shobhit.q2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinkedListEmployeeTestCase {

	@Before
	public void Initialize(){

	LinkedListEmployee list = new LinkedListEmployee();

	Employee e1 = new Employee(4000, "Shobhit", 21);
	Employee e2 = new Employee(8000.0, "Prerna", 24);
	Employee e3 = new Employee(6000.0, "Himanshu", 28);
	Employee e4 = new Employee(10000.0, "Akhilesh", 34);
	Employee e5 = new Employee(2000.0, "Govinda", 22);

	list.append(e1);
	list.append(e2);
	list.append(e3);
	list.append(e4);
	list.append(e5);

	}	

	@Test
	public void EmployeeLinkedListSortingTest() {
		LinkedListEmployee list2 = new LinkedListEmployee();
	Employee e4 = new Employee(10000.0, "Akhilesh", 34);
	Employee e5 = new Employee(2000.0, "Govinda", 22);
	Employee e1 = new Employee(4000, "Shobhit", 21);
	Employee e2 = new Employee(8000.0, "Prerna", 24);
	Employee e3 = new Employee(6000.0, "Himanshu", 28);
	list2.append(e5);
	list2.append(e1);
	list2.append(e2);
	list2.append(e3);
	list2.append(e4);


	//assertEquals(list2.getHead().data.toString(),list.mergeSort(list.head).data.toString());
	}

}
