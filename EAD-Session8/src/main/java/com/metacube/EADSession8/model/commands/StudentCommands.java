package com.metacube.EADSession8.model.commands;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class StudentCommands {
	
	private int id = -1;

	
	@Pattern(regexp="^[a-zA-Z ]{0,15}",message="First name should contain  only")
	@Size(min = 2, max =  15,message = "{fName}")
	private String fName;
	
	@Pattern(regexp="^[a-zA-Z ]{0,15}",message="Last name should contain alphabets only")
	@Size(min=2, max =15, message = "{lName}")
	private String lName;
	
	@Pattern(regexp="^[a-zA-Z ]{0,50}",message="Father name should contain alphabets only")
	@Size(min = 2, max = 50, message = "{blankFatherName}")
	private String fatherName;
	
	@Pattern(regexp="\\S+@\\S+\\.\\S{0,100}",message="Invalid Email")
	@NotBlank(message="{blankEmail}")
	private String email;
	
	
	@NotBlank
	@Pattern(regexp="^[0-9]{0,2}",message="Class should be an Interger with max 2 digit") 
	private String classNo;
	
	@Pattern(regexp="^[0-9]{0,2}",message="Age should be an Interger with max 2 digit")
	@NotBlank
	private String age;
	
	/**
	 * Constructor when no parameter
	 */
	public StudentCommands(){
		//default 
	}
	
	public StudentCommands(int id, String fName, String lName,
			String fatherName, String email, String classNo, String age) {
		
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.fatherName = fatherName;
		this.email = email;
		this.classNo = classNo;
		this.age = age;
	}

	/**
	 * This method used to get id of Student
	 * @return
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * This method used to set id of the student
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * This method used get first name of the student
	 * @return
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * This method used to set first name of the student
	 * @param fName
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}

	/**
	 * This method used to get last name of the student
	 * @return
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * This method used to set last name of the student
	 * @param lName
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}

	/**
	 * This method used to get father name of the student
	 * @return
	 */
	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	/**
	 * This method used to get Email address of the student
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * This method used to get class no of the student
	 * @return
	 */
	public String getClassNo() {
		return classNo;
	}

	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "StudentCommands [fName=" + fName + ", lName=" + lName + ", fatherName=" + fatherName
				+ ", email=" + email + ", classNo=" + classNo + ", age=" + age + "]";
	}
	
	
	
}
