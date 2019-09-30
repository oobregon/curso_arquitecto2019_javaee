package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Cierre
 */
@WebServlet("/Cierre")
public class Cierre extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Eliminar una cookie
		Cookie ck = new Cookie("usuario","");
		ck.setMaxAge(0);
		response.addCookie(ck);
		HttpSession sesion = request.getSession();		
		sesion.invalidate();
		request.getRequestDispatcher("formulario.html").forward(request, response);
		
		// Terminar de explicar por qu� usar response.sendRedirect en lugar del dispatcher.forward.
		// �Aporta algo el sendRedirect? el send. S� aporta; lo que hace el sendRedirect es que fuerza a que se cree
		// una nueva petici�n, con lo cual
		// �Cu�l es la relaci�n entre este sendRedirect y la cookie?
		//response.sendRedirect("Inicio");
	}
}
