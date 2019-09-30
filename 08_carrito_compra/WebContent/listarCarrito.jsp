<%@page import="modelo.Pedido"%>
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
	<% 	ArrayList<Pedido> carrito = (ArrayList<Pedido>)session.getAttribute("carrito");
		if(carrito == null) { %>
		<jsp:forward page="nohaycarrito.html"/>	
	<%	}
	%>
	
	<table border=1>
		<tr>
			<td>Productos</td>
			<td>Unidades</td>
			<td>Precio</td>
		</tr>
		<% for(Pedido pedido:carrito) {	%>
		<tr>
			<td><%=pedido.getNomProducto() %></td>
			<td><%=pedido.getUnidades() %></td>
			<td><%=pedido.getPrecio() %></td>
		</tr>	
		<% } %>
	</table>
	<br/><br/>
	<a href="CerrarSesion">Cerrar sesión</a>
	<a href="opciones.html">Volver</a>
</body>
</html>