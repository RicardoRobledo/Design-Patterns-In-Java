package SustitucionLiskovYSegregacionDeInterfaces;

public class Jaguar implements FelinoSalvaje{

	@Override
	public void cazar() {
		System.out.println("El jaguar caza");
	}

	@Override
	public void rugir() {
		System.out.println("El jaguar ruge");
	}
	
}
