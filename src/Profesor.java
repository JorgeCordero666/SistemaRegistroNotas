import java.util.ArrayList;

public class Profesor extends Persona {

    private ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
    int curso;

    public Profesor(String cedula, String contrasenia, String nombre, String apellido, int curso) {
        super(cedula, contrasenia, nombre, apellido);
        this.curso = curso;
    }

    public void calificar(Estudiante e, String nombreMateria, float calificacion1, float calificacion2) {
        int indice = -1;
        for (int i = 0; i < e.getMaterias().length; i++) {
            if (e.getMaterias()[i].getNombre().equals(nombreMateria)) {
                indice = i;
                break;
            }
        }
        e.getMaterias()[indice].setCalificacion1(calificacion1);
        e.getMaterias()[indice].setCalificacion2(calificacion2);
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

}
