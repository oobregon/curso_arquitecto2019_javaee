package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fabricas.FactoryDao;
import modelo.DaoClientes;
import modelo.DaoTemas;
import modelo.DaoTemasImpl;


@WebServlet("/LoginAction")
public class LoginAction extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DaoClientes gestion = FactoryDao.obtenerDaoClientes();
		boolean resultado=false;
		if(gestion.autenticar(request.getParameter("user"),request.getParameter("pwd"))){
			DaoTemas gtemas=new DaoTemasImpl();
			request.setAttribute("temas", gtemas.obtenerTemas());			
            resultado=true;          
		}
		else{
			request.setAttribute("mensaje", "Usuario no registrado");			
		}       
        request.setAttribute("resultado",resultado);
	}	
}
