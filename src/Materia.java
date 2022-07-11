public class Materia {

    String nombre;
    float calificacion1;
    float calificacion2;

    public Materia(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCalificacion1() {
        return calificacion1;
    }

    public void setCalificacion1(float calificacion1) {
        this.calificacion1 = calificacion1;
    }

    public float getCalificacion2() {
        return calificacion2;
    }

    public void setCalificacion2(float calificacion2) {
        this.calificacion2 = calificacion2;
    }

    @Override
    public String toString() {
        return "Nombre de la materia: " + nombre +
                "\nCalificacion 1: " + calificacion1 +
                "\nCa;ificacion 2: " + calificacion2 +
                "\nPromedio: " + (calificacion1 + calificacion2) / 2;
    }

}
