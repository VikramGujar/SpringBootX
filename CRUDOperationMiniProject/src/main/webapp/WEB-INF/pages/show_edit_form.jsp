<%@ page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>

<f:form action="edit" method="post" modelAttribute="plyr">
	<table>
  <tr>
    <td>Id</td>
    <td><f:input path="id"/> </td>
  </tr>
  <tr> 
  <tr>
    <td>Name</td>
    <td><f:input path="name"/> </td>
  </tr>
  <tr>
    <td>Country</td>
    <td><f:input path="contry"/></td>
  </tr>
  
   <tr>
    <td>IPL Team</td>
    <td><f:input path="iplTeam"/></td>
  </tr>
  <tr>
  	<td colspan="2">
  		<input style="text-align: center; " type="submit" value="Edit"/>
  	</td>
  </tr>
</table>
</f:form>