package Decorator;

public class QuesoExtra implements IPizza {

	// Envolvemos al objeto y le damos mas funcionalidad
	
	private IPizza pizza;
	
	public QuesoExtra(IPizza pizza) {
		this.pizza = pizza;
	}
	
	public String descripcion() {
		return this.pizza.descripcion() + " queso extra";
	}
	
	public float precio() {
		return this.pizza.precio() + 2;
	}
	
}