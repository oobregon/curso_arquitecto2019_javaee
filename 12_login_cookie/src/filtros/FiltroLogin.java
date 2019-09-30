package filtros;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class FiltroLogin
 */
@WebFilter("/*")
public class FiltroLogin implements Filter {

    /**
     * Default constructor. 
     */
    public FiltroLogin() {
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String venimosDe = ((HttpServletRequest)request).getServletPath();
		
		// para las dos siguientes direcciones este filtro no hace ninguna comprobación/validación y directamente dice que 
		// se ejecute el siguiente filtro
		if (venimosDe.equals("/") || venimosDe.equals("/Autenticar")) {
			chain.doFilter(request, response);
		}
		HttpSession sesion=((HttpServletRequest)request).getSession();
		if(sesion.getAttribute("infoPersona") != null) {
			chain.doFilter(request, response);
		}else {
			request.getRequestDispatcher("Inicio").forward(request, response);
		}		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {	
	}

}
