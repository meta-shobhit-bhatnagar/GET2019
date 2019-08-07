package com.shobhit.q1;

import java.util.Comparator;
/**
 * Sorts on the basis of IDs'
 * @author Shobhit
 *
 */
public class SortOnId implements Comparator<Employee> {
	
	public int compare(Employee emp1, Employee emp2){
		return (emp1.id > emp2.id ? 1 : -1);		
	}
}
