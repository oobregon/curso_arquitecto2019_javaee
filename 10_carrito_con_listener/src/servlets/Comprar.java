package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.Pedido;
/**
 * Servlet implementation class Comprar
 */
@WebServlet("/Comprar")
public class Comprar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession();
		String producto = request.getParameter("producto");
		String unidades = request.getParameter("unidades");
		String precio = request.getParameter("precio");
		Pedido ped = new Pedido();		
		ped.setNomProducto(producto);		
		ped.setPrecio(Float.parseFloat(precio));
		ped.setUnidades(Integer.parseInt(unidades));
		
		@SuppressWarnings("unchecked")
		List<Pedido> listaCompra = (ArrayList<Pedido>)sesion.getAttribute("carrito");
		// La comprobación de si existe el atributo de sesion ya no lo hago porque un listener de sesion ya le habrá creado
		listaCompra.add(ped);		
		RequestDispatcher rd = request.getRequestDispatcher("productos.html");
		rd.forward(request,response);
	}
}
