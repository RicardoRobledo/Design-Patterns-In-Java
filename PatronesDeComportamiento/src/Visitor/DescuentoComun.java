package Visitor;

public class DescuentoComun implements IVisitor {

	// Algoritmos que necesitamos
	// Es responsabilidad de esta clase como se manejaran los descuentos y
	// no de los productos
	
	public float descuento(IFruta fruta) {
		return fruta.getPrecio() * 0.10f;
	}
	
	public float descuento(ILineaBlanca lineaBlanca) {
		return lineaBlanca.getPrecio() * 0.05f;
	}
	
}
