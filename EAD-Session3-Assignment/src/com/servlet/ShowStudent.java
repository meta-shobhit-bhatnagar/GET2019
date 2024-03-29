package com.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.database.DataBaseOperation;
import com.database.Student;

/**
 * Servlet implementation class ShowStudent
 */
@WebServlet("/ShowStudent")
public class ShowStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletOutputStream out = response.getOutputStream();
		
		DataBaseOperation db = new DataBaseOperation();
		ArrayList<Student> studentList = db.getStudent();
		
		String upperBody = "<html> <head><title>Add Student</title> <link rel='stylesheet' type='text/css' href='/EAD-Session3/css/studentDisplay.css'>"
				+ "</head> <body> <a href='index.html'>Back to Home</a>";
		String lowerBody = "</body> <html>";
		String content = "<table>"+
							"<th>FirstName</th> <th>LastName</th> <th>FatherName</th> <th>Email</th> <th>Class</th> <th>Age</th>";
		if(studentList != null){
			for(int i=0; i<studentList.size(); i++){
				content = content + "<tr>" +
									"<td>" + studentList.get(i).getFirstName() + "</td>" +
									"<td>" + studentList.get(i).getLastName() + "</td>" +
									"<td>" + studentList.get(i).getFatherName() + "</td>" +
									"<td>" + studentList.get(i).getEmail() + "</td>" +
									"<td>" + studentList.get(i).getClassNo() + "</td>" +
									"<td>" + studentList.get(i).getAge() + "</td>" +
									"<td>" + "<a href=" + request.getContextPath() +
									"/updateStudent.jsp?" +
									"studentEmail=" + studentList.get(i).getEmail() + ">Update</a>" + "</td>";	
				
			}
		}else{
			content = "<h1> Failed Try Again <h1>";
		}		
		out.println(upperBody + lowerBody + content);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
