package Builder2;

public final class Usuario {

    private String nombre;
    private String apellido;

    private boolean medioContacto;//optional
    private String email;
    private String telefono;
    private String direccion;
    private String metodoPago;
    private String token;

    private Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.medioContacto = false;

        this.email = "";
        this.telefono = "";
        this.direccion = "";
        this.metodoPago = "";
        this.token = "";

        //String metodoPago <- si y solo los tres atributos tienen un valor
        //String token <- cuando se tenga un metodo de pago
    }

    public static Usuario Make(String nombre, String apellido) {

        return new Usuario(nombre, apellido);

    }

    public BuilderUsuario setMedioContacto(Boolean medioContacto) {
        if (!medioContacto) {
            throw new IllegalArgumentException("No es posible asignar un valor media contacto");
        }
        this.medioContacto = medioContacto;
        return new BuilderUsuario(this);
    }

    public Usuario Build() {
        return this;
    }

    public class BuilderUsuario {

        private Usuario usuario;

        public BuilderUsuario(Usuario usuario) {
            this.usuario = usuario;
        }

        public BuilderUsuario setEmail(String email) {
            usuario.email = email;
            return this;
        }

        public BuilderUsuario setTelefono(String telefono) {
            usuario.telefono = telefono;
            return this; 
        }

        public BuilderUsuario setDireccion(String direccion) {
            usuario.direccion = direccion;
            return this;
        }

        public BuilderMetodoPago setMetodoPago(String metodoPago) {
            if (usuario.email.equals("") || usuario.direccion.equals("") || usuario.telefono.equals("")) {
                throw new IllegalArgumentException("Datos Incompletos");
            }
            usuario.metodoPago = metodoPago;
            return new BuilderMetodoPago(usuario);
        }

        public Usuario Build() {
            return usuario;
        }

    }
    
    public static class BuilderToken {
    	
    	private Usuario usuario;

    	public BuilderToken(Usuario usuario) {
            this.usuario = usuario;
        }

        public BuilderToken setToken(String token) {
            if (usuario.metodoPago.equals("")) {
                throw new IllegalArgumentException("No hay metodo de pago");
            }
            usuario.token = token;
            return this;
        }

        public Usuario Build() {
            return usuario;
        }
    	
    }

    public static class BuilderMetodoPago {

        private Usuario usuario;

        public BuilderMetodoPago(Usuario usuario) {
            this.usuario = usuario;
        }

        public BuilderMetodoPago setMetodoPago(String metodoPago) {
            usuario.metodoPago = metodoPago;
            return this;
        }
        
        public BuilderToken setToken(String token) {
            if (usuario.email.equals("") || usuario.direccion.equals("") || usuario.telefono.equals("") || usuario.metodoPago.equals("")) {
                throw new IllegalArgumentException("Datos Incompletos");
            }
            usuario.token=token;
            return new BuilderToken(usuario);
        }

        public Usuario Build() {
            return usuario;
        }

    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono + ", direccion=" + direccion
                + ", Metodo Pago=" + metodoPago + ", token=" + token + '}';
    }

}
