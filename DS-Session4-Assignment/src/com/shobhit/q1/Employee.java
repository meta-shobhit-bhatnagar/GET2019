package com.shobhit.q1;

public class Employee {
	int id;
	String name;
	String address;
	
	/**
	 * constructor method for employee
	 * @param id
	 * @param empName
	 * @param address
	 */
	public Employee(int id, String empName, String address) {
		this.id = id;
		this.name = empName;
		this.address = address;
	}

	public String getName() {
		return name;
	}
	
	
	
}
