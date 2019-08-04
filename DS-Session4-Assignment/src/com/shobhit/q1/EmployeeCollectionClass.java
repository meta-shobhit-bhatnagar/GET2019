package com.shobhit.q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The class contains functions to add Employee details in the Collection<Employee> and 
 * remove any duplicate entries by id
 * @author Shobhit
 *
 */
public class EmployeeCollectionClass {
	
	List<Employee> empCollectionList= new ArrayList<Employee>();
	Set<Integer> empIdCollection= new HashSet<Integer> ();
	
	public void addEmployee(Employee emp){
		if(empIdCollection.add(emp.id))
			empCollectionList.add(emp);
		else 
			System.out.println("Employee already exists");
	}
	
	/**
	 * sorts employees on the basis of their ID's
	 */
	void employeeSortOnId(){
		Collections.sort(empCollectionList , new sortOnId());
		System.out.println();
		for(Employee Iterator :empCollectionList)
			System.out.println(Iterator.id);
	}
	
	/**
	 * sorts employees on the basis of their names
	 */
	void employeeSortOnName(){
		Collections.sort(empCollectionList,new sortOnName());
		for(Employee Iterator :empCollectionList)
			System.out.println(Iterator.getName());
		
	}
	
	
}
