<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/form.css">
<script src="js/studentFormValidation.js"></script>
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<form action="SearchStudent" method="Post">
        <table>
            <tr>
                <td>First Name</td>
                <td>
                        <input type="text" name="firstName" value="" id="fullName" placeholder="Enter First name">
                        <br> <span id="sfname"></span>
                </td>
            </tr>
            <tr>
                <td>
                        <input type="submit" value="Search">
                </td>
                
            </tr>
        </table>
  	  </form>
	</div>
    


</body>
</html>