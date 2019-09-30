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
<% Persona p = (Persona)session.getAttribute("infoPersona"); %>
	<h1> Bienvenido <%=p.getUsuario() %></h1><br/>
	<h1> Email: <%=p.getEmail() %></h1><br/>
	Email(EL): ${sessionScope.infoPersona.email}
	<h1> Edad: <%=p.getEdad() %></h1><br/>
	<h1> Preferencia: <%=p.getPreferencia() %></h1><br/>
	<h1>Fin jsp</h1>
	<br/>
	<br/>
	<h1>El numero de usuarios conectados es <%=application.getAttribute("contador") %></h1>
	<a href='preferencias.html'>volver</a><br/>
	<a href='Cierre'>Eliminar cookie</a>
</body>
</html>