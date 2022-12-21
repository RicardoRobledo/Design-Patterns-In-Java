package Observer;

public class Prueba {

	public static void main(String[] args) {
		
		// Observer
		
		// Es itul porque nos permite automatizar muchas tareas
		
		// Define una dependencia de 1 a muchos entre los objetos para que cuando un objeto
		// cambie de estado todos sus dependientes sean notificados y actualizados automaticamente
		
		// En pocas palabras podemos notificar a muchos objetos de algun cambio que se ha realizado
		// en algun objeto en particular
		
		Producto aguacate = new Producto(10);
		
		Usuario usuario1 = new Usuario();
		Usuario usuario2 = new Usuario();
		Usuario usuario3 = new Usuario();
		
		aguacate.addObserver(usuario1);
		aguacate.addObserver(usuario2);
		
		aguacate.venta();

		// Otra forma de implementarlo es con una clase intermedia donde el producto notifique
		// a la clase y la clase notifique a los usuarios
		
	}
}
