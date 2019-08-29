package com.shobhit.q2;

/**
 * Employee class which contains Constructor and getter methods
 * @author Shobhit
 *
 */
public class Employee {
	double salary;
	String name;
	int age;
	
	/**
	 * constructor method for employee
	 * @param id
	 * @param empName
	 * @param address
	 */
	public Employee(double salary, String empName, int age) {
		this.name = empName;
		this.salary = salary;		
		this.age = age;
	}
	/**
	 * Getter for Employee name
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	public double getSalary(){
		return salary;
	}
	
	/**
	 * Getter for Employee age
	 * @return age of the employee
	 */
	public int getAge(){
		return age;
	}
	
	
	
}
