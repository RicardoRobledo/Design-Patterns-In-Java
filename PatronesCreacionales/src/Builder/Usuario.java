package Builder;

public class Usuario {
	
	private String nombre;
	private String apellido;

	private String email;
	private String telefono;
	private String direccion;
	
	private Usuario(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		
		this.email = "";
		this.telefono = "";
		this.direccion = "";
	}
	
	public static Usuario Make(String nombre, String apellido) {
		return new Usuario(nombre, apellido);
	}

	public Usuario setEmail(String email) {
		this.email = email; // Modificamos el objeto
		return this; // Retornamos el objeto para seguir modificandolo en caso de haber otros metodos
	}

	public Usuario setTelefono(String telefono) {
		this.telefono = telefono;
		return this;
	}

	public Usuario setDireccion(String direccion) {
		this.direccion = direccion;
		return this;
	}
	
	public Usuario Build() {
		return this; // Retornamos el objeto final con todos sus cambios hechos
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono
				+ ", direccion=" + direccion + "]";
	}
	
	/* NO
	 * 
	 * public Usuario(String nombre, String apellido, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = "";
		this.direccion = "";
	}
	
	public Usuario(String nombre, String apellido, String email, String telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
		this.direccion = "";
	}
	
	public Usuario(String nombre, String apellido, String email, String telefono, String direccion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
		this.direccion = direccion;
	}*/

}
