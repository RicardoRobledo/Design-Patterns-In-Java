package Mediator;

public class Prueba {

	public static void main(String[] args) {
		
		// Mediator
		
		// Este patron define un objeto que encapsula como los objetos van a interactuar entre si.
		// Vamos a usar este patron siempre y cuando queramos comunicar diferentes objetos sin importar
		// si son de la misma clase o de clases diferentes entre ellos
		
		// Para mediator no existen reglas a seguir de tal forma que nos debemos de regir en base a nuestro
		// conocimiento para que logremos comunicar diferentes objetos
		
		Usuario eduardo = new Usuario("Eduardo");
		Usuario codi = new Usuario("Codi");
		
		SalaChat sala = new SalaChat();
 
		sala.addPaticipante(eduardo);
		sala.addPaticipante(codi);
		
		sala.enviarMensaje(eduardo, codi, "Hola desde el curso de patrones de diseño!");
		
	}

}
