package VirtualProxy;

public class ProxyServicio implements IServicio {

	private IServicio servicio; // Costoso, lo crearemos cuando el usuario lo necesite
	private Usuario usuario;
	
	public ProxyServicio(Usuario usuario) {
		this.usuario=usuario;
	}

	public void leer() {
		this.obtenerServicio().leer();
	}
	
	public void escribir() {
		this.obtenerServicio().escribir();
	}
	
	public void actualizar() {
		this.obtenerServicio().actualizar();
	}
	
	public void eliminar() {
		this.obtenerServicio().eliminar();
	}
	
	private IServicio obtenerServicio() {
		if(this.servicio==null) {
			this.servicio=new Servicio(); // Creamos el objeto por primera y unica vez
		}
		return this.servicio;
	}
}
