package Facade;

public class Prueba {

	public static void main(String args[]) {
		
		// Facade
		
		// Esto nos sirve para hacer un intermediario entre 2 objetos para que sea mas sencilla
		// la implementacion y la interaccion entre ellas
		
		Fachada fachaComputadora = new Fachada();
		
		fachaComputadora.encender();
		
	}
	
}
