package AbstractFactory;

public class SamsungStore implements IAbstractFactory{

	@Override
	public IComputadora crearComputadora() {
		// TODO Auto-generated method stub
		return new QX410();
	}

	@Override
	public ITablet crearTablet() {
		// TODO Auto-generated method stub
		return new TabS3();
	}

}
