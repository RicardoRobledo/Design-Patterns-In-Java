package Strategy;


public class Transaccion {

	private IEstrategia estrategia;//algoritmo
	
	public Transaccion(IEstrategia estrategia) {
		this.estrategia = estrategia;
	}
	
	// Los que nos importa es que se ejecute el algoritmo, no cual es
	public float ejecutarTransaccion(float balance, float cantidad) {
		return this.estrategia.realizarOperacion(balance, cantidad);
	}
	
}
