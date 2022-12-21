package Iterator;

public class Prueba {

	public static void main(String[] args) {
		
		// Iterator
		
		// Provee un patron de diseño estandar para acceder secuencialmente a los elementos
		// de una coleccion, aqui debemos de diseñar una interfaz de tal manera en que si un elemento
		// quiere acceder a los elementos de una coleccion tenga que hacerlo a traves de la interfaz, de esta
		// forma no exponemos los atributos y los metodos de la coleccion y asi podremo proteger la
		// coleccion hasta cierto punto
		
		// OJO: Java ya posee una clase Iterator, asi que podemos implementarla sin ningun problema
		// de esta manera tenemos 2 formas de hacerlo y asi ciertos atributos y metodos se encuentran protegidos
		
		GuiaTelefonica guia = new GuiaTelefonica();
		
		guia.add("123");
		guia.add("124");
		guia.add("125");
		guia.add("126");
		guia.add("127");
		guia.add("128");
		
		Iterador iterador = new IteradorGuia(guia);
		
		while(iterador.contieneSiguiente()) {
			System.out.println(iterador.siguiente());
		}
		
	}

}
