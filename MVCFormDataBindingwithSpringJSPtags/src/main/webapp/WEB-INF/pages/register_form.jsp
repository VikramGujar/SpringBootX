<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>


	<frm:form action="register" method="POST" modelAttribute="emp">
	<label>Employee ID </label>
	<frm:input  path="empid" />
	
	<label>Employee Name </label>	
	<frm:input  path="empname" />
	
	<label>Employee Role </label>
	<frm:input  path="emprole" />
	
	<label>Employee Department No </label>
	<frm:input  path="empdepNo" />
	
	<label>Employee Salary </label>
	<frm:input path="empsal" />
	
	<input style="text-align: center; " type="submit" value="send"/>
	</frm:form>
