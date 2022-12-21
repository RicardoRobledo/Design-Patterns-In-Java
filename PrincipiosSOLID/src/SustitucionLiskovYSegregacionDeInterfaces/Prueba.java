package SustitucionLiskovYSegregacionDeInterfaces;

public class Prueba {

	public static void main(String[] args) {
		
		// Lo que hacemos es abstraer mas nuestro pensamiento y metodos para definir que algunos felinos pueden
		// maullar y algunos pueden rugir, pero no todos lo hacen, asi que dividimos los metodos por interfaces
		// para que hereden de Felino su metodo comun que es cazar
		
		Felino yagua= new Jaguar();
		yagua.cazar();

	}

}
