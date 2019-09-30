package fabricas;

import daos.DaoContactos;
import daos.DaoContactosImpl;

// Implementa el patr�n factory
public class FactoryDao {
	public static DaoContactos obtenerDaoContactos() {
		return new DaoContactosImpl();
	}
}
