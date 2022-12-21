package Decorator;

public class Prueba {

	public static void main(String[] args) {
		// Decorator
		
		// Si lo implementamos bien podemos generar aplicaciones extendibles
		// de una forma muy sencilla donde a pesar de los cambios en nuestro modelo
		// de negocio este preparado para aceptar esos cambios y adapatarse facilmente
		

		IPizza pizzaPeperoni = new QuesoExtra(new PizzaPeperoni());
		
		System.out.println(pizzaPeperoni.descripcion());
		System.out.println(pizzaPeperoni.precio());
		
		
		IPizza pizzaHawaiana = new QuesoExtra(new OrillaRellena(new PizzaHawaiana()));
		
		System.out.println(pizzaHawaiana.descripcion());
		System.out.println(pizzaHawaiana.precio());
		
		// Queso extra 2 = 10
		// Orilla rellena de queso, 4

	}

}
