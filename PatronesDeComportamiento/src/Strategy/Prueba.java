package Strategy;

public class Prueba {

	public static void main(String[] args) {
		
		// Strategy
		
		// Nos permite encapsular algoritmos en clases, de tal manera que podemos
		// utilizar diferentes algoritmos en tiempo de ejecucion 
		
		// Una forma de verlo es como una caja de LEGO donde cada pieza es un algoritmo
		// y dependiendo de nuestras necesidades en tiempo de ejecucion, nosotros podemos
		// utilizar una pieza u otra o reemplazar la que en un inicio estabamos utilizando

		// Este patron se usara cuando nuestra app tenga muchas variantes en nuestros
		// algoritmos
		
		
		// Generamos una clase por cada algoritmo a implementar
		// Deposito
		// Retiro
		
		Transaccion transaccion1 = new Transaccion( new Deposito() );
		System.out.println(transaccion1.ejecutarTransaccion(100, 20));
		
		Transaccion transaccion2 = new Transaccion( new Retiro() );
		System.out.println(transaccion2.ejecutarTransaccion(100, 20));
		
	}

}
