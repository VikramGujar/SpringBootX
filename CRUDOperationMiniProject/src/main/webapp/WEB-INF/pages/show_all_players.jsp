<%@ page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="tg"%>

<tg:choose> 

	<tg:when test="${!empty players }">
	
	<table border="1" style="padding: 10px; text-align: center;">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>Country</th>
			<th>IPL-TEAM</th>
		</tr>
		
		<tg:forEach var="player" items="${players}">
		<tr>
			<td>${player.id }</td>
			<td>${player.name }</td>
			<td>${player.contry }</td>
			<td>${player.iplTeam }</td>
		
		</tr>
		</tg:forEach>
	</table>
	</tg:when>
	<tg:otherwise>
	<h1 style="color: red;"> No record Fount</h1>
	</tg:otherwise>

</tg:choose>

	
<tg:choose>
	<tg:when test="${!empty addResult}">
	<h3 style="color: green;">${addResult}</h3>
	</tg:when>
	<tg:otherwise>
	<br>
	</tg:otherwise>
</tg:choose>


<a href="register">Add Player</a><br>
<a href="./">Home</a>




