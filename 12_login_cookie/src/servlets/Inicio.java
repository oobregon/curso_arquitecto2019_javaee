package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.Persona;

/**
 * Servlet implementation class Inicio
 */
@WebServlet("/Inicio")
public class Inicio extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("formulario.html");
		Cookie[] cookies = request.getCookies();
		Boolean existe = false;
		Cookie infoUsu = new Cookie("usuario","");
		if (cookies != null) {
			for(Cookie c : cookies) {
				if(c.getName().equals("usuario")) {
					existe = true;
					infoUsu = c;
				}
			}
		}		
		if(existe) {
			rd=request.getRequestDispatcher("preferencias.html");
			HttpSession sesion = request.getSession();
			Persona persona = new Persona();
			persona.setEdad(45);
			persona.setEmail("miemail@gmail.com");
			persona.setUsuario(infoUsu.getValue());			
			sesion.setAttribute("infoPersona",persona);
		}
		rd.forward(request,response);
	}
}