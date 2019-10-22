package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fabricas.FactoryDao;
import javabeans.Cliente;
import modelo.DaoClientes;
import modelo.DaoClientesImpl;



@WebServlet("/RegistroAction")
public class RegistroAction extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DaoClientes gestion = FactoryDao.obtenerDaoClientes();
                Cliente c=new Cliente(0,request.getParameter("usuario"),
                request.getParameter("password"),
                        request.getParameter("email"),
                        Integer.parseInt(request.getParameter("telefono")));
		gestion.registrar(c);
		
		
	}

}
