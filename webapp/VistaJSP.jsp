<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!--     crear la directiva para usar las etiquetas jstl -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!-- recorrer el array que le va a llegar a este jsp desde el controlador que le llega enviado desde el forward -->
	<c:forEach var="tempPar" items="${lista_participantes}">

${tempPar}<br>

	</c:forEach>


</body>
</html>