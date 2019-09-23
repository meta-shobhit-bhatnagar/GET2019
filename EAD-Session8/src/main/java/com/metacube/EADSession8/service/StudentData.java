package com.metacube.EADSession8.service;

import java.util.ArrayList;
import java.util.List;

import com.metacube.EADSession8.model.commands.StudentCommands;

public class StudentData {
	
	
	List<StudentCommands> studentList = new ArrayList<StudentCommands>();
	/**
	 * This method used to get all students
	 * @return list of StudentCommands 
	 */
	public List<StudentCommands> getAllStudent(StudentCommands student, int size){
		if(student!=null) {
			studentList.add(student);
		}else if(size ==0 ){
			StudentCommands s1 = new StudentCommands(24,"Vatsal","Sharma","Kailash Chand Sharma","vatsal.sharma1@metacube.com","12","16");
			studentList.add(s1);
			StudentCommands s2 = new StudentCommands(25, "Shobhit","Bhatnagar","Vinod kumar","shobhit.bhatnagar@metacube.com","11","16");
			studentList.add(s2);
			StudentCommands s3 = new StudentCommands(26, "Yash","sharma","Shobhit Sharma","yash.sharma@metacube.com","12","17");
			studentList.add(s3);
		}
		return studentList;
	}
	
}
