package Adapter;

public class Prueba {

	public static void main(String[] args) {
		
		// Adapter
		
		// Convierte una clase o interfaz en otra que el cliente espera donde 2 que no pueden
		// tabajar en conjunto lo logren sin tener que realizar cambios
		
		IConexionSQL conexion = new AdaptadorDB(new ConexionMongoDB());
		
		conexion.conexion();
		
		String resultado = conexion.runQuery();
		System.out.println(resultado);

	}

}
