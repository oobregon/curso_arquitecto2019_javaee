package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Factura
 */
@WebServlet("/factura")
public class Factura extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomProducto = request.getParameter("producto");
		String numUnidades = request.getParameter("unidades");
		String precio = request.getParameter("precio");
		String iva = request.getParameter("iva");
		response.setContentType("text/html");
		PrintWriter salida = response.getWriter();
		salida.println("<html><body><center>");
		salida.println("<br/>");
		salida.println("Has comprado:" + nomProducto);
		salida.println("<br/>");
		salida.println("Numero de unidades:" + numUnidades);
		salida.println("<br/>");
		salida.println("Precio:" + precio);
		salida.println("<br/>");
		salida.println("Iva:" + iva);
		salida.println("<br/>");
		salida.println("Total:" + iva);
		salida.println("</center></body></html>");
		salida.close();	
	}

}
