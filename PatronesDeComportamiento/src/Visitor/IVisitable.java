package Visitor;

public interface IVisitable {

	// Este metodo es donde aplicamos el algoritmo dependiendo el visitor que
	// vayamos a implementar o el descuento
	
	float aplicarDescuento(IVisitor visitor);
	
}
