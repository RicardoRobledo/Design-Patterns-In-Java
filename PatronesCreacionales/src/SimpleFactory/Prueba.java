package SimpleFactory;

public class Prueba {

	public static void main(String[] args) {
		
		// La idea es poder crear objetos complejos de una forma bastante sencilla y controlada
		
		// Pizza pizzaPeperoni = new Pizza(8);    NO
		Pizzeria pizzeriaCF = new Pizzeria();
		Pizza pizza =  pizzeriaCF.crearPizzaChica();
		
		System.out.println(pizza);
		
	}

}
