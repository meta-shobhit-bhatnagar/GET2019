package com.shobhit.q1;

import java.util.Comparator;

public class sortOnId implements Comparator<Employee> {
	
	public int compare(Employee emp1, Employee emp2){
		return (emp1.id > emp2.id ? 1 : -1);		
	}
}
