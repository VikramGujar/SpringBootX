<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="register" method="post">
	<table>
	
	<tr>
		<td> Student ID </td>
		<td> <input type="text" name="sid"> </td>
	</tr>
	
	<tr>
		<td> Student Name </td>
		<td> <input type="text" name="sname"> </td>
	</tr>
	
	<tr>
		<td> Student Address </td>
		<td> <input type="text" name="sadd"> </td>
	</tr>
	
	<tr>
		<td> Student Percentage </td>
		<td> <input type="text" name="spercent"> </td>
	</tr>
	
	<tr>
		<td colspan="2"> <input type="submit" value="send"> </td>
	</tr>
		
	</table>
	</form>
</body>
</html>