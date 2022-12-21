package Command;

public class Prueba {

	public static void main(String[] args) {
		
		// Command

		// Encapsula un mensaje como un objeto, especifica una forma simple de separar la
		// ejecucion de un comando del entorno que genero dicho comando, es decir que si queremos
		// ejecutar un metodo A entonces debemos utilizar el objeto B para ejecutar dicho metodo
		
		// Command nos sirve para hacer tests y ver de forma puntual donde surgen los errores, de esta
		// forma podemos revertir los cambios por el metodo en concreto
		
		IDevise tv = new TV();
		
		ICommand on = new OnDevise(tv);
		ICommand off = new OffDivise(tv);
		
		on.operacion();
		off.operacion();
		
	}

}
