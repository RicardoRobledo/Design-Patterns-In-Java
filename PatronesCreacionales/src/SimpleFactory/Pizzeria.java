package SimpleFactory;

public class Pizzeria {

	// Aqui usamos SimpleFactory para crear nuestros objetos y tener un control de ellos
	// indicando que solo haremos 3 tipos de pizzas, normalmente se usa para crear objetos
	// complejos o tener un control de ellos
	
	public Pizza crearPizzaChica(){
		// DB, FILE, API
		return new Pizza(6);
	}
	
	public Pizza crearPizzaMediana(){
		return new Pizza(8);
	}
	
	public Pizza crearPizzaGrande(){
		return new Pizza(12);
	}
	
}
