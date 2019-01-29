<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="dateFormat" uri="WEB-INF/tp4.tld"%>
<%@ taglib prefix="up" tagdir="/WEB-INF/tags" %>

<%@ page import = "java.util.Date"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<dateFormat:formatter date="<%= new Date() %>" format="dd-MM-yyyy" couleur="black"/>
		
		<up:uppercase text="Coucou"></up:uppercase>
		<up:uppercase2>
			Je suis le body !
		</up:uppercase2>
	</body>
</html>