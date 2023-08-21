<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Customers Details</h1>
<table>
<tr>
<th>FirstName</th>
<th>LastName</th>
<th>Region</th>
<th>Email</th>
<th>DELETE </th>
<th>EDIT</th>
</tr>
 <c:forEach var="tempsalesmans" items="${salesmans}">
<tr>
<td>${tempsalesmans.firstName}</td>
<td>${tempsalesmans.lastName}</td>
<td>${tempsalesmans.region}</td>
<td>${tempsalesmans.email}</td>
<td><form action="delete" method="post">
	<input name="customerId" value="${tempsalesmans.id}" hidden="hidden">
	<button type="submit" class="add-button">Delete</button>
	</form>
</td>
<td><form action="update" method="post">
	<input name="customerId" value="${tempsalesmans.id}" hidden="hidden">
	<button type="submit" class="add-button">EDIT</button>
	</form>
</td>
</tr>

</c:forEach> 
<a href="saveMrForm">ADD SALESMANS</a>
</table>
</body>
</html>