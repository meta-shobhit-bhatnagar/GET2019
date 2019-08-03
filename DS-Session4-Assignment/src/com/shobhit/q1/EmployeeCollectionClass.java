package com.shobhit.q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * The class contains functions to add Employee details in the Collection<Employee> and 
 * remove any duplicate entries by id
 * @author Shobhit
 *
 */
public class EmployeeCollectionClass {
	
	List<Employee> empCollection= new ArrayList<Employee>();
	HashSet<Integer> empIdCollection= new HashSet<Integer> ();
	
	public void addEmployee(Employee emp){
		if(empIdCollection.add(emp.id))
			empCollection.add(emp);
		else 
			System.out.println("Employee already exists");
	}
	
	/**
	 * sorts employees on the basis of their ID's
	 */
	void employeeSortOnId(){
		Collections.sort(empCollection , new sortOnId());
		System.out.println();
		for(Employee Iterator :empCollection)
			System.out.println(Iterator.id);
	}
	
	/**
	 * sorts employees on the basis of their names
	 */
	void employeeSortOnName(){
		Collections.sort(empCollection,new sortOnName());
		for(Employee Iterator :empCollection)
			System.out.println(Iterator.getName());
		
	}
	
	
}
