package InversionDeDependencias;

public class Prueba {
	
	public static void main(String[] args) {
		
		Teclado teclado = new Teclado();
		Mouse mouse = new Mouse();
		
		Computadora compu = new Computadora(teclado, mouse);
		compu.encender();

	}

}
