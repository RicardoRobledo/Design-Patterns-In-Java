package Memento;

public class Usuario {

	private String nombre;
	private int edad;
	
	public Usuario(String nombre, int edad) {
		this.setNombre(nombre);
		this.setEdad(edad);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	// Memento
	
	// Copia de seguridad
	public Usuario getMemento() {
		return new Usuario(this.getNombre(), this.getEdad());
	}
	
	// Restaurando cambios
	public void restartMemento(Usuario usuario) {
		this.setNombre(usuario.getNombre());
		this.setEdad(usuario.getEdad());
	}
	
}
