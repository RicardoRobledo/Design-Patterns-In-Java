package Proxy;

public class Prueba {

	public static void main(String[] args) {
		
		// Proxy
		
		// Limita funcionalidades de nuestro sistema como limitar areas de acceso
		
		Usuario usuario = new Usuario(4);
		IServicio servicio = new ProxyServicio(new Servicio(), usuario);
		
		servicio.escribir();
		servicio.leer(); // <---
		servicio.actualizar();
		servicio.eliminar();
		
		// Admin

	}

}
