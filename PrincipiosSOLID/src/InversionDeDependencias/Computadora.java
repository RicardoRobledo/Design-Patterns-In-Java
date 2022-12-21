package InversionDeDependencias;

public class Computadora {

	// De esta forma podemos recibir cualquier tipo de Mouse
	private ITeclado teclado;
	private IMouse mouse;
	
	public Computadora(ITeclado teclado, IMouse mouse) {
		this.teclado=teclado;
		this.mouse=mouse;
	}

	public void encender() {
		teclado.conectar();
		mouse.conectar();
	}

}
