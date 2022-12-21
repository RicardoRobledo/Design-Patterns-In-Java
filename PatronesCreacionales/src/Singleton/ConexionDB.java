package Singleton;

public class ConexionDB {
	
	private static ConexionDB conexion;
	public String host;
	
	private ConexionDB() {}
	
	public static ConexionDB obtenerConexion() {
		
		if(conexion==null) {
			conexion = new ConexionDB();
		}

		return conexion;
		
	}

}
