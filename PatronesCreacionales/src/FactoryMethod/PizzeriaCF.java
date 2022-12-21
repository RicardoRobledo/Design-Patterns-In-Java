package FactoryMethod;

public class PizzeriaCF implements IPizzeria{

	@Override
	public Pizza crearPizza(String tipo) {
		// TODO Auto-generated method stub
		
		if(tipo.equals("Peperoni")) {
			return new Pizza(8, "Peperoni");
		}else if(tipo.equals("Hawaiana")) {
			return new Pizza(8, "Hawaiana");
		}else if(tipo.equals("Peperoni orilla rellena")) {
			return new PizzaOrillaRellena(12, "Peperoni orilla rellena");
		}
		
		return null;
		
	}

}
