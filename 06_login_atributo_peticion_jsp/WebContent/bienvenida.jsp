<%@page import="modelo.Persona"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Persona p = (Persona)request.getAttribute("infoPersona"); %>
	<h1> Bienvenido <%=p.getUsuario() %></h1><br/>
	<h1> Email: <%=p.getEmail() %></h1><br/>
	<h1> Edad: <%=p.getEdad() %></h1><br/>
	<h1>Fin jsp</h1>
	<a href='formulario.html'>volver</a>
</body>
</html>