<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="dateFormat" uri="WEB-INF/tp4.tld"%>
<%@ page import = "java.util.Date"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<dateFormat:formatter date="<%= new Date() %>" format="dd-MM-yyyy" couleur="black"/>
	</body>
</html>