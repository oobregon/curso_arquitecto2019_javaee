<%@page import="java.util.List"%>
<%@page import="model.Contacto"%>
<%@page import="daos.DaoContactos"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		DaoContactos dao = new DaoContactos(); 
			List<Contacto> agenda = dao.dameContactos();
			if(agenda.size() == 0) {
	%>
		<jsp:forward page="entrada.html"/>	
	<%	}
	%>
	
	<table border=1>
		<tr>
			<td>Nombre</td>
			<td>Email</td>
			<td>Edad</td>
		</tr>
		<% for(Contacto contacto:agenda) {	%>
		<tr>
			<td><%=contacto.getNombre() %></td>
			<td><%=contacto.getEmail() %></td>
			<td><%=contacto.getEdad() %></td>
		</tr>	
		<% } %>
	</table>
	<br/><br/>	
	<a href="entrada.html">Volver</a>
</body>
</html>