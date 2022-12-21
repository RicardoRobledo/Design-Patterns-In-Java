package ChainofResponsability;

public class Prueba {

	public static void main(String[] args) {
		
		// Chain of responsability
		
		// Nos permite establecer una cadena de objetos receptores a traves de los cuales
		// se pasa una peticion formulada por un objeto emisor, es decir un objeto nos va a mandar
		// una peticion y el otro objeto debe de ser capaz de responder a dicha peticion, por ejemplo
		// un cliente manda una peticion al objeto numero 1 y si no es capaz de responder de forma correcta
		// entonces delegara esa tarea al objeto numero 2 y este intentara contestar de forma correcta a la peticion
		// y si tampoco puede delegara su tarea al objeto 3
		
		Transaccion transaccion = new Transaccion(100, 200, TipoTransaccion.Reembolso);
		
		IManejadorTransacciones deposito = new Deposito();
		IManejadorTransacciones retiro = new Retiro();
		IManejadorTransacciones reembolso = new Reembolso();
		
		deposito.setNextManejador(retiro);
		retiro.setNextManejador(reembolso);
		
		deposito.ejecutarTransaccion(transaccion);
		
		// Seria mejor si implementamos el patron Virtual Proxy para que se cree si es necesario porque pueden haber muchos objetos
		// de este modo seria mejor crearlos cuando los necesitemos
		
	}

}
