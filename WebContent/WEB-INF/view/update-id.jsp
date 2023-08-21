<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="updatesave" modelAttribute="customer" >
Enter First Name:<form:input path="cfName"  />
<br><br>
Enter Last Name:<form:input path="clName"/>
<br><br>
Enter mail id:<form:input path="cgmail" />
<br>
<input type="submit" value="SUBMIT">
</form:form>  
</body>
</html>