package Prototype;

public class Enemigo {

	private String imagen;
	private int posX;
	private int posY;
	private int cantidadVida;
	
	public Enemigo(String imagen, int posX, int posY, int cantidadVida) {
		this.imagen = imagen;
		this.posX = posX;
		this.posY = posY;
		this.cantidadVida = cantidadVida;
	}
	
	// Prototype forma 1
	
	public Enemigo(Enemigo enemigo) {
		this.imagen = enemigo.getImagen();
		this.posX = enemigo.getPosX();
		this.posY = enemigo.getPosY();
		this.cantidadVida = enemigo.getCantidadVida();
	}
	
	// Prototype forma 2 con metodos de instancia
	
	public Enemigo clone() {
		//return new Enemigo(this);   forma 1 con metodos de instancia
		return new Enemigo(this.imagen, this.posX, this.posY, this.cantidadVida);   //forma 2 con metodos de instancia
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getCantidadVida() {
		return cantidadVida;
	}

	public void setCantidadVida(int cantidadVida) {
		this.cantidadVida = cantidadVida;
	}
	
	@Override
	public String toString() {
		return "Enemigo [imagen=" + imagen + ", posX=" + posX + ", posY=" + posY + ", cantidadVida=" + cantidadVida
				+ "]";
	}
	
}
