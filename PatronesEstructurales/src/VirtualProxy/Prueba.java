package VirtualProxy;

public class Prueba {

	public static void main(String[] args) {
		
		// Virtual proxy es una variante del Proxy
		
		// No restringe el acceso al objeto real sino que intenta retrasar 
		// su creacion donde nos sirve al crear objetos de alto costo
		// computacional, por ejemplo un objeto al crearse a partir de una
		// consulta a una base de datos, a partir de una consulta de un API
		// la lectura de un archivo, etc
		
		Usuario usuario = new Usuario(4);
		IServicio servicio = new ProxyServicio(usuario);
		
		servicio.escribir();
		servicio.leer(); // <---
		servicio.actualizar();
		servicio.eliminar();
		
		// Admin

	}

}
