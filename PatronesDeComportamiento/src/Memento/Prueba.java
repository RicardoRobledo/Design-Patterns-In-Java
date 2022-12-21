package Memento;

public class Prueba {

	public static void main(String[] args) {
		
		// Memento
		
		// Permite exportar y capturar el estado interno de un objeto
		// para que luego se pueda restaurar sin romper la encapsulacion,
		// es decir podemos aplicar el ctrl+z en nuestra aplicacion.
		// Vamos a obtener una copia de seguridad de un objeto y si necesitamos
		// revertir los cambios hechos en ese objeto podemos implementar la copia de seguridad
		// restaurando los cambios, la copia de seguridad puede ser parcial o total,
		// todo depende de nuestras necesidades
		
		Usuario usuario = new Usuario("Codi", 6 );
		
		Usuario memento = usuario.getMemento();//Nuestra copia!
		
		usuario.setNombre("Cambio de nombre");
		usuario.setEdad(20);
		
		System.out.println(usuario.getNombre());
		System.out.println(usuario.getEdad());
		
		usuario.restartMemento(memento);
		
		System.out.println(usuario.getNombre());
		System.out.println(usuario.getEdad());
		
	}

}
