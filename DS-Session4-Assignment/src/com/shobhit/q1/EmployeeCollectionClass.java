package com.shobhit.q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class EmployeeCollectionClass {
	
	List<Employee> empCollection= new ArrayList<Employee>();
	HashSet<Integer> empIdCollection= new HashSet<Integer> ();
	
	public void addEmployee(Employee emp){
		if(empIdCollection.add(emp.id))
			empCollection.add(emp);
		else 
			System.out.println("Employee already exists");
	}
	
	void employeeSortedOrder(){
		Collections.sort(empCollection , new sortOnId());
		System.out.println();
		for(Employee Iterator :empCollection)
			System.out.println(Iterator.id);
		
		System.out.println();
		
		Collections.sort(empCollection,new sortOnName());
		for(Employee Iterator :empCollection)
			System.out.println(Iterator.getName());
	}
	
	
	
	
}
