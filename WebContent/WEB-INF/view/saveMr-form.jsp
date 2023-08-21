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
<form:form action="saveMr" modelAttribute="salesman" >
Enter First Name:<form:input path="firstName"/>
<br><br>
Enter Last Name:<form:input path="lastName"/>
<br><br>
Enter region:<form:input path="region" />
<br><br>
Enter mail id:<form:input path="email"/>
<br><br>
<input type="submit" value="SUBMIT">
</form:form>  
</body>
</html>