<%@ page import="java.util.Date" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
	<head>
	  	<link rel="stylesheet" href="styles.css" type="text/css">
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<p style='background-color: black; color: lightgreen; padding: 100px 70px 100px;'>Today is: <%=new Date() %></p>
		
		<c:forEach var="item" items="${param}" >
            <c:out value="${item.key}" /> : <c:out value="${item.value}" /><br/>
        </c:forEach>
        
	</body>
</html>


