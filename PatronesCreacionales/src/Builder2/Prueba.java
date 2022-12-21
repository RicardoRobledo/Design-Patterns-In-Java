package Builder2;


public class Prueba {

    public static void main(String[] args) {
		
		// Con Builder nos podemos evitar varios constructores llegado a ser una
		// cantidad grande por la sobrecarga e incluso metodos
		
		Usuario codi = Usuario.Make("Codi", "Facilito")
				              .setMedioContacto(true)
				              .setDireccion("Mexico")
				              .setTelefono("Telefono")
				              .setEmail("Email")
				              .setMetodoPago("Cheque")
				              .setToken("Token")
		                      .Build();
		
		System.out.println(codi);
		
	}

	
}
