package Flyweight;

import java.util.HashMap;

public class Prueba {

	public static void main(String[] args) {
	
		// Flyweight
		
		// Nos permite reutilizar objetos siendo que podemos crear apps con la minima cantidad
		// de recursos necesarios, es decir podemos hacer apps ligeras que no consuman tantos recursos
		
		// -----------
		NubeFactory factory = new NubeFactory();
		
		for(int x=0; x<10; x++) {
			Nube nube = factory.getNube(TipoNube.Chica);
		}
		
        for(int x=0; x<10; x++) {
        	Nube nube = factory.getNube(TipoNube.Mediana);
		}

		for(int x=0; x<10; x++) {
			Nube nube = factory.getNube(TipoNube.Grande);
		}
		
		System.out.println("Cantidad de nubes: "+factory.countNubesMap());
		
	}

}
