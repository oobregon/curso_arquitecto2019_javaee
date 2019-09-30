package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Persona;

/**
 * Servlet implementation class Autenticar
 */
@WebServlet("/Autenticar")
public class Autenticar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("user");
		String pwd=request.getParameter("pwd");
		RequestDispatcher rd;
		if(user.equals("admin")&&pwd.equals("admin")) {		
			rd=request.getRequestDispatcher("bienvenida.jsp");
			Persona persona = new Persona();
			persona.setEdad(45);
			persona.setEmail("miemail@gmail.com");
			persona.setUsuario(user);
			request.setAttribute("infoPersona",persona);
		}else {
			rd=request.getRequestDispatcher("error.jsp");
		}
		rd.forward(request, response);		
	}
}
