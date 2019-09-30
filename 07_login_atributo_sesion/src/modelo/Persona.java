package modelo;

public class Persona {
	private String usuario;
	private String email;
	private int edad;
	private String preferencia;
	
	public Persona(String usuario, String email, int edad,String preferencia) {
		super();
		this.usuario = usuario;
		this.email = email;
		this.edad = edad;
		this.preferencia = preferencia;
	}
	
	public Persona() {}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPreferencia() {
		return preferencia;
	}

	public void setPreferencia(String preferencia) {
		this.preferencia = preferencia;
	}	
}
