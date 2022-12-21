package Adapter;

public class ConexionMySQL implements IConexionSQL{

	public void conexion() {
		System.out.println("Conexion con MySQL");
	}

	public String runQuery() {
		return "Consulta MYSQL";
	}
	
}
