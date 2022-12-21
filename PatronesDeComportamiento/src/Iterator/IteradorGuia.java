package Iterator;

public class IteradorGuia implements Iterador {

	private GuiaTelefonica guia;
	private int posicion;
	
	public IteradorGuia(GuiaTelefonica guia) {
		this.guia = guia;
	}
	
	// Con estos metodos no nos importan los metodos sino trabajar con
	// la lista y asi podemos agregar seguridad
	
	public String siguiente() {
		return this.guia.getNumeros().get(this.posicion++);
	}
	
	public boolean contieneSiguiente() {
		return this.posicion<this.guia.getNumeros().size() && this.guia.getNumeros().get(this.posicion)!=null;
	}
	
}
