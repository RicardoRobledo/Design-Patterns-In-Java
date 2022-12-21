package AbstractFactory;

public class Prueba {

	public static void main(String[] args) {
		
		SamsungStore ss = new SamsungStore();
		AppleStore as = new AppleStore();
		
		System.out.println("Mac: "+ss.crearComputadora());
		System.out.println("IPad: "+ss.crearTablet());
		
		System.out.println("QX: "+as.crearComputadora());
		System.out.println("S3: "+as.crearTablet());

	}

}
 