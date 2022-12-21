package principal;

import ResponsabilidadSimple.Presentacion;
import AbiertoCerrado.Presentacion2;
import AbiertoCerrado.Triangulo;
import ResponsabilidadSimple.Rectangulo;

public class Prueba {

	public static void main(String[] args) {
		
		// Responsabilidad simple
		
		// Ponemos 2 clases porque el Rectangulo se encarga de que datos debe
		// de mostrar y no de como mostrarlos, de eso se encarga la clase presentacion
		// porque podemos hacer de diferentes, ¿Que tal si mañana queremos mostrarlos en
		// un txt?, ¿En una pagina de internet?, ¿En otro sitio?, tendriamos que modificar la
		// clase rectangulo siempre y eso no es bueno, por ello usamos la clase Presentacion
		// para que se encargue se ello
		
		Rectangulo rectangulo= new Rectangulo(10, 20);
		Presentacion pres = new Presentacion();
		
		pres.imprimir(rectangulo);
		
		// -------------------------------------------------------------
		
		// Open/Closed
		
		// Notamos que siempre que vamos a generar una nueva figura debemos de irnos a agregar un
		// nuevo metodo de nuestra clase Presentacion2 y en ese caso rompemos el principio Open/Closed.
		// Para arreglar esto creamos una nueva interface
		
		Triangulo triangulo= new Triangulo(10, 5);
		Presentacion2 pres2 = new Presentacion2();
		
		pres2.area(rectangulo);
		pres2.area(triangulo);
		
	}

}
