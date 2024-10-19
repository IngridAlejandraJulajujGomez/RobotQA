package practica.models;

public class Client {
    private String nombre;
    private String usuario;
    private String nombreCheck;
    private String apellido;
    private String direccion;
    private String ciudad;
    private String codigopostal;
    private String cantidad;
    private String contrasenia;
    private String imagen;
    private String frase;

    public String getName() {
        return nombre;
    }
    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public String getUser() {
        return usuario;
    }
    public void setUser(String user) {
        this.usuario = user;
    }
//NOMBRE CHECKOUT
    public String getnombreCheck() {
        return nombreCheck;
    }

    public void setnombreCheck(String nombreCheck) {
        this.nombreCheck = nombreCheck;
    }

    public String getapellido() {
        return apellido;
    }

    public void setapellido(String apellido) {
        this.apellido = apellido;
    }

    public String getdireccion() {
        return direccion;
    }

    public void setdireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getciudad() {
        return ciudad;
    }

    public void setciudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getcodigopostal() {
        return codigopostal;
    }

    public void setcodigopostal(String codigopostal) {
        this.codigopostal = codigopostal;
    }

//CANTADIDAD
    public String getcantidad() {
        return cantidad;
    }

    public void setcantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPassword() {
        return contrasenia;
    }
    public void setPassword(String password) {
        this.contrasenia = password;
    }

    public String getImage() {
        return imagen;
    }
    public void setImage(String password) {
        this.imagen = password;
    }

    public String getPhrase() {
        return frase;
    }
    public void setPhrase(String password) {
        this.frase = password;
    }
}
