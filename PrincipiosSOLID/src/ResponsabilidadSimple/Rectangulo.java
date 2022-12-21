package ResponsabilidadSimple;

import AbiertoCerrado.Figura;

// Esta clase tiene una cohesion alta porque realiza tareas de forma muy puntual y realiza tareas
// consigo misma
public class Rectangulo implements Figura{

	private float base, altura;
	
	public Rectangulo(float base, float altura) {
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

	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + "]";
	}

	@Override
	public float area() {
		return base*altura/2;
	}

}

	
