package Visitor;

public interface IVisitor {

	//float visit();    por convneion se les suelle llamar visit a los metodos
	
	//casoso en los que habran variaciones en los algoritmos
	
	float descuento(IFruta fruta);//descuento
	
	float descuento(ILineaBlanca lineaBlanca);
	
}
