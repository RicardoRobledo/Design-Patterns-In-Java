package Prototype;

public class Prueba {

	public static void main(String[] args) {
		
		// Prototype
		
		// Lo usamos cuando necesita recibir un objeto de si mismo o
		// el valor de atributos es bastante costoso obtenerlo
		
		Enemigo enemigoBase = new Enemigo("Imagen.png", 0, 100, 2);

		Enemigo enemigo1 = new Enemigo(enemigoBase);
		Enemigo enemigo2 = new Enemigo(enemigoBase);
		Enemigo enemigo3 = new Enemigo(enemigoBase);
		
		enemigo1.setPosX(100);
		enemigo2.setPosX(150);
		enemigo3.setPosX(200);
		
		
		Enemigo enemigoBase2 = new Enemigo("Imagen.png", 0, 200, 2);
		
		Enemigo enemigo4 = enemigoBase2.clone();
		Enemigo enemigo5 = enemigoBase2.clone();
		Enemigo enemigo6 = enemigoBase2.clone();
		
		enemigo4.setPosX(100);
		enemigo5.setPosX(150);
		enemigo6.setPosX(200);
		
		// Recordemos que con esto podemos generar objetos cantidad n de objetos a partir de
		// un prototypo o objeto base
		
	}

}
