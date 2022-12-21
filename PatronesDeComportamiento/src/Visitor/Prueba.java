package Visitor;

public class Prueba {
	
	public static void main(String[] args) {

		// Visitor
		
		// Permite definir una nueva operacion sin cambiar las clases de los elementos
		// que lo operan, es decir que pretende separar un algoritmo de la estructura de un objeto
		
		// Esta frase nos ayudara mucho: Si un objeto es el responsable de mantener cierto tipo de
		// informacion entonces es logico asignarle tambien la responsabilidad de realizar todas las operaciones
		// necesarias sobre esa informacion
		
		//Fruta 10% de descuento
		//LíneBlanca 5% de descuento
		
		Manzana manzana = new Manzana();
		Lavadora lavadora = new Lavadora();
		
		IVisitor descuento = new DescuentoComun();
		
		System.out.println(manzana.aplicarDescuento(descuento));
		System.out.println(lavadora.aplicarDescuento(descuento));
		
		// Nota: Strategy, Template method y Visitor son los patrones de diseño
		// mas importantes
		
	}
}
