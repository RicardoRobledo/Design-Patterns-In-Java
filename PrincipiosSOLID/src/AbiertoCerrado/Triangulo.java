package AbiertoCerrado;

public class Triangulo implements Figura{

    private float base, altura;
	
	public Triangulo(float base, float altura) {
		this.setBase(base);
		this.setAltura(base);
	}
	
	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float area() {
		return base*altura/2;
	}
	
}
