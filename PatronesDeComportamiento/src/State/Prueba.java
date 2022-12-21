package State;

public class Prueba {

	public static void main(String[] args) {
		
		// State
		
		// Permite que un objeto modifique su comportamiento cada vez que modifique
		// su estado interno, es decir si un objeto cambia de estado este puede reaccionar
		// de diferente maneras dependiendo del estado en el que se encuentre dando ilusion
		// a que el objeto a cambiado de clase, se usa en maquinas de estado
		
		Auto auto = new Auto();
	    
		auto.apagar();
		auto.encender();
		auto.apagar();
		auto.encender();
		auto.manejar();
		auto.apagar();
		
	    /*
	     * Encendido
	     * En Movimiento
	     * Apagado
	     * */
	}

}
