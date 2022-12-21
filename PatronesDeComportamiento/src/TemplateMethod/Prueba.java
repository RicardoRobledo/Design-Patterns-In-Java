package TemplateMethod;

public class Prueba {

	public static void main(String[] args) {
		
		// Template method
		
		// Define una estructura algoritmica cuya estructura quedara a cargo de las subclases
		
		// En pocas palabras esto va mas de la mano con clases abstractas
		
		Usuario gerente = new Gerente();
		Usuario administrador = new Administrador();
		
		gerente.autenticacion();
		gerente.formaTrabajar();
		
		administrador.autenticacion();
		administrador.formaTrabajar();

	}

}
