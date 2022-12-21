package Builder;

public class Prueba {

	public static void main(String[] args) {
		
		// Con Builder nos podemos evitar varios constructores llegado a ser una
		// cantidad grande por la sobrecarga e incluso metodos
		
		Usuario codi = Usuario.Make("Codi", "Facilito")
				              .setEmail("info@codigofacilito.com")
				              .setTelefono("xxx-xx-xx")
				              .setDireccion("Mexico")
		                      .Build();
		
		System.out.println(codi);
		
	}

}
