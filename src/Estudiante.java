public class Estudiante extends Persona {

    Materia materia1 = new Materia("Sociales");
    Materia materia2 = new Materia("Matematicas");
    Materia materia3 = new Materia("Lenguaje");
    Materia materia4 = new Materia("Ingles");
    Materia materia5 = new Materia("Ciencias Naturales");
    Materia materias[] = { materia1, materia2, materia3, materia4, materia5 };

    int curso;

    public Estudiante(String cedula, String contrasenia, String nombre, String apellido, int curso) {
        super(cedula, contrasenia, nombre, apellido);
        this.curso = curso;
    }

    public Materia[] getMaterias() {
        return materias;
    }

    public void setMaterias(Materia[] materias) {
        this.materias = materias;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

}
