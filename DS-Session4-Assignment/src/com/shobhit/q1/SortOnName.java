package com.shobhit.q1;

import java.util.Comparator;
/**
 * Sorts on the basis of Name
 * @author Shobhit
 *
 */
public class SortOnName implements Comparator<Employee>{
	
	public int compare(Employee emp1, Employee emp2){
		return (emp1.getName().compareTo(emp2.getName()));
	}
}
