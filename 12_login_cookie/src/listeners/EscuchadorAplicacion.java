package listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class EscuchadorAplicacion
 *
 */
@WebListener
public class EscuchadorAplicacion implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public EscuchadorAplicacion() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         sce.getServletContext().setAttribute("contador",new Integer(0));
    }
	
}
