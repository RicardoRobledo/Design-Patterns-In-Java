package FactoryMethod;

public class Prueba {

	public static void main(String[] args) {
		
		// Factory method
		
		// Define una interfaz para crear objetos
		
		PizzeriaCF cf = new PizzeriaCF();
		Pizza peperoni = cf.crearPizza("Peperoni");
		Pizza hawaiana = cf.crearPizza("Hawaiana");
		Pizza orillaRellena = cf.crearPizza("Peperoni orilla rellena");
		
		System.out.println(peperoni);
		System.out.println(hawaiana);
		System.out.println(orillaRellena);
		
	}
	
}
