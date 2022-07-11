public class Persona {

    protected String cedula;
    protected String contrasenia;
    protected String nombre;
    protected String apellido;

    public Persona(String cedula, String contrasenia, String nombre, String apellido) {
        this.cedula = cedula;
        this.contrasenia = contrasenia;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String nombresCompletos() {
        return this.nombre + " " + this.apellido;
    }

}
