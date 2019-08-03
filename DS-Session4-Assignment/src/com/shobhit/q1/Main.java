package com.shobhit.q1;

public class Main {

	public static void main(String[] args) {
		
		EmployeeCollectionClass e=new EmployeeCollectionClass();
	
		e.addEmployee(new Employee(3,"Rajesh","Plot-21, C.P Colony, Ghaziabad"));
		e.addEmployee(new Employee(13,"Twinkle","Gandhi Marg, Jaipur"));
		e.addEmployee(new Employee(10,"Ramesh","Shashtri Colony, Golkonda"));
		e.addEmployee(new Employee(1,"Vijay","Morar, Gwalior"));
		e.addEmployee(new Employee(5,"Rajneesh","L.A, California"));

		e.employeeSortedOrder();
	}

}