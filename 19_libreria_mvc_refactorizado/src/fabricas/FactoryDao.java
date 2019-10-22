package fabricas;

import modelo.DaoClientes;
import modelo.DaoClientesImpl;
import modelo.DaoLibros;
import modelo.DaoLibrosImpl;
import modelo.DaoTemas;
import modelo.DaoTemasImpl;

// Implementa el patrón factory
public class FactoryDao {
	public static DaoClientes obtenerDaoClientes() {
		return new DaoClientesImpl();
	}
	
	public static DaoLibros obtenerDaoLibros() {
		return new DaoLibrosImpl();
	}
	
	public static DaoTemas obtenerDaoTemas() {
		return new DaoTemasImpl();
	}	
}
