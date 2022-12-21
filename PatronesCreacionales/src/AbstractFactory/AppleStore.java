package AbstractFactory;

public class AppleStore implements IAbstractFactory{

	@Override
	public IComputadora crearComputadora() {
		// TODO Auto-generated method stub
		return new MacbookPro();
	}

	@Override
	public ITablet crearTablet() {
		// TODO Auto-generated method stub
		return new IPad();
	}

}
