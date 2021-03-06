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
		String pref = request.getParameter("pref");
		RequestDispatcher rd;
		if(user.equals("admin")&&pwd.equals("admin")) {	
			
			rd=request.getRequestDispatcher("preferencias.html");
			HttpSession sesion = request.getSession();
			Persona persona = new Persona();
			persona.setEdad(45);
			persona.setEmail("miemail@gmail.com");
			persona.setUsuario(user);
			persona.setPreferencia(pref);
			sesion.setAttribute("infoPersona",persona);			
			generarCookie(response,user);			
		}else {
			rd=request.getRequestDispatcher("error.jsp");
		}
		rd.forward(request, response);		
	}
	
	private void generarCookie(HttpServletResponse response,String user) {
		Cookie ck = new Cookie("usuario",user);
		ck.setMaxAge(10000);
		
		//A�adimos la cookie a la cabecera de la respuesta
		response.addCookie(ck);
	}
}
