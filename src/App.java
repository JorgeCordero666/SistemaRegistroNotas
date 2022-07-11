import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;

        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

        // Estudiantes de 1ro
        Estudiante e1 = new Estudiante("01", "01", "Jose", "Fabara", 1);
        Estudiante e2 = new Estudiante("02", "02", "Pedro", "Martinez", 1);
        Estudiante e3 = new Estudiante("03", "03", "Juan", "Romero", 1);
        estudiantes.add(e1);
        estudiantes.add(e2);
        estudiantes.add(e3);

        // Estudiantes de 2do
        Estudiante e4 = new Estudiante("04", "04", "Carlos", "Zambrano", 2);
        Estudiante e5 = new Estudiante("05", "05", "Maria", "Yanez", 2);
        Estudiante e6 = new Estudiante("06", "06", "Scarlet", "Macias", 2);
        estudiantes.add(e4);
        estudiantes.add(e5);
        estudiantes.add(e6);

        // Estudiantes de 3ro
        Estudiante e7 = new Estudiante("07", "07", "Jorge", "Velez", 3);
        Estudiante e8 = new Estudiante("08", "08", "Nicole", "Veliz", 3);
        Estudiante e9 = new Estudiante("09", "09", "Alejandra", "Perez", 3);
        estudiantes.add(e7);
        estudiantes.add(e8);
        estudiantes.add(e9);

        // Estudiantes de 4to
        Estudiante e10 = new Estudiante("10", "10", "Luis", "Gonzalez", 4);
        Estudiante e11 = new Estudiante("11", "11", "Janeth", "Arteaga", 4);
        Estudiante e12 = new Estudiante("12", "12", "Diana", "Zamora", 4);
        estudiantes.add(e10);
        estudiantes.add(e11);
        estudiantes.add(e12);

        // Estudiantes de 5to
        Estudiante e13 = new Estudiante("13", "13", "Leslye", "Navia", 5);
        Estudiante e14 = new Estudiante("14", "14", "Katherine", "Sanchez", 5);
        Estudiante e15 = new Estudiante("15", "15", "Steven", "Velin", 5);
        estudiantes.add(e13);
        estudiantes.add(e14);
        estudiantes.add(e15);

        // Estudiantes de 6to
        Estudiante e16 = new Estudiante("16", "16", "Hernan", "Avila", 6);
        Estudiante e17 = new Estudiante("17", "17", "Tony", "Lopez", 6);
        Estudiante e18 = new Estudiante("18", "18", "Daniel", "Castro", 6);
        estudiantes.add(e16);
        estudiantes.add(e17);
        estudiantes.add(e18);

        // Estudiantes de 7mo
        Estudiante e19 = new Estudiante("19", "19", "Alisson", "Carreño", 7);
        Estudiante e20 = new Estudiante("20", "20", "Esteban", "Cerezo", 7);
        Estudiante e21 = new Estudiante("21", "21", "Alejandro", "Agila", 7);
        estudiantes.add(e19);
        estudiantes.add(e20);
        estudiantes.add(e21);

        ArrayList<Profesor> profesores = new ArrayList<Profesor>();

        // Profsores para los distinitos cursos
        Profesor p1 = new Profesor("22", "22", "Antony", "Cevallos", 1);
        Profesor p2 = new Profesor("23", "23", "Antonella", "Vargas", 2);
        Profesor p3 = new Profesor("24", "24", "Jimmy", "Zamora", 3);
        Profesor p4 = new Profesor("25", "25", "Kylian", "Mbappe", 4);
        Profesor p5 = new Profesor("26", "26", "Cristiano", "Ronaldo", 5);
        Profesor p6 = new Profesor("27", "27", "Lionel", "Messi", 6);
        Profesor p7 = new Profesor("28", "28", "Karim", "Benzema", 7);
        profesores.add(p1);
        profesores.add(p2);
        profesores.add(p3);
        profesores.add(p4);
        profesores.add(p5);
        profesores.add(p6);
        profesores.add(p7);

        ArrayList<Administrativo> administrativos = new ArrayList<Administrativo>();

        Administrativo a1 = new Administrativo("29", "29", "Robert", "Lewandowski");
        administrativos.add(a1);

        for (Estudiante e : estudiantes) {
            switch (e.getCurso()) {
                case 1:
                    p1.getEstudiantes().add(e);
                    break;
                case 2:
                    p2.getEstudiantes().add(e);
                    break;
                case 3:
                    p3.getEstudiantes().add(e);
                    break;
                case 4:
                    p4.getEstudiantes().add(e);
                    break;
                case 5:
                    p5.getEstudiantes().add(e);
                    break;
                case 6:
                    p6.getEstudiantes().add(e);
                    break;
                case 7:
                    p7.getEstudiantes().add(e);
                    break;
            }
        }

        do {
            System.out.println("-----------------------Menú de Opciones-----------------------");
            System.out.println("Escoja una opcion:\n");
            System.out.println("\t1. Estudiante");
            System.out.println("\t2. Profesor");
            System.out.println("\t3. Administrativo");
            System.out.println("\t4. Salir\n");
            System.out.print("Ingrese una opcion: ");
            opcion = entrada.nextInt();
            System.out.print("\033[H\033[2J");

            switch (opcion) {
                case 1:
                    String cedulaEstudiante;
                    String contraseniaEstudiante;
                    Estudiante estudianteActual = new Estudiante("00", "00", "00", "00", 0);
                    int a = 0;
                    do {
                        System.out.println("------------------------Modo Estudiante------------------------");
                        System.out.print("Ingrese su cedula: ");
                        cedulaEstudiante = entrada.next();
                        System.out.print("Ingrese su contraseña: ");
                        contraseniaEstudiante = entrada.next();

                        for (Estudiante e : estudiantes) {
                            if (cedulaEstudiante.equals(e.getCedula())
                                    && contraseniaEstudiante.equals(e.getContrasenia())) {
                                estudianteActual = e;
                                a += 1;
                                break;
                            }
                        }
                        if (a == 0) {
                            System.out.print("\033[H\033[2J");
                            System.out.println("Credenciales incorrectas");
                        }
                    } while (a == 0);
                    int opcionEstudiante = 0;
                    do {
                        System.out.println("\t1. Ver Calificaciones");
                        System.out.println("\t2. Salir");
                        System.out.print("Ingrese una opcion: ");
                        opcionEstudiante = entrada.nextInt();
                        System.out.print("\033[H\033[2J");
                        switch (opcionEstudiante) {
                            case 1:
                                System.out.println("Escoja la materia:");
                                for (int i = 0; i < estudianteActual.getMaterias().length; i++) {
                                    System.out.println(
                                            "\t" + (i + 1) + " " + estudianteActual.getMaterias()[i].getNombre());
                                }
                                System.out.print("Ingrese una opcion: ");
                                int indiceMateria = entrada.nextInt() - 1;
                                System.out.print("\033[H\033[2J");
                                System.out.println(estudianteActual.getMaterias()[indiceMateria]);
                                break;
                            case 2:
                                System.out.println("Salio del menu de estudiantes.");
                                break;
                            default:
                                System.out.print("\033[H\033[2J"); // Limpiar la consola
                                System.out.println("Numero invalido. Vuelve a intentarlo\n");
                        }
                    } while (opcionEstudiante != 2);

                    break;
                case 2:

                    String cedulaP;
                    String contraseniaP;
                    Profesor profesorActual = new Profesor("00", "00", "00", "00", 0);
                    int aP = 0;
                    do {
                        System.out.println("------------------------Modo Profesor------------------------");
                        System.out.print("Ingrese su cedula: ");
                        cedulaP = entrada.next();
                        System.out.print("Ingrese su contraseña: ");
                        contraseniaP = entrada.next();

                        for (Profesor p : profesores) {
                            if (cedulaP.equals(p.getCedula()) && contraseniaP.equals(p.getContrasenia())) {
                                profesorActual = p;
                                aP += 1;
                                break;
                            }
                        }
                        if (aP == 0) {
                            System.out.print("\033[H\033[2J");
                            System.out.println("Credenciales incorrectas");
                        }
                    } while (aP == 0);

                    // Seleccionando al estudiante para calificar
                    System.out.println("A que estudiante va a calificar: ");
                    for (int i = 0; i < profesorActual.getEstudiantes().size(); i++) {
                        System.out.println(
                                "\t" + (i + 1) + " " + profesorActual.getEstudiantes().get(i).nombresCompletos());
                    }
                    System.out.print("Ingrese un numero: ");
                    int indiceEstudiante = entrada.nextInt() - 1;
                    System.out.print("\033[H\033[2J");

                    for (Materia m : profesorActual.getEstudiantes().get(indiceEstudiante).getMaterias()) {

                        System.out.println("Calificando la materia " + m.getNombre());
                        System.out.print("\tCalificacion 1: ");
                        float c1 = entrada.nextInt();
                        System.out.print("\tCalificacion 2: ");
                        float c2 = entrada.nextInt();
                        profesorActual.calificar(profesorActual.getEstudiantes().get(indiceEstudiante), m.getNombre(),
                                c1, c2);
                    }
                    System.out.print("\033[H\033[2J");
                    break;
                case 3:
                    String cedulaA;
                    String contraseniaA;
                    Administrativo administradorActual = new Administrativo("00", "00", "00", "00");
                    int flagA = 0;

                    do {
                        System.out.println("------------------------Modo Administrativo------------------------");
                        System.out.print("Ingrese su cedula: ");
                        cedulaA = entrada.next();
                        System.out.print("Ingrese su contraseña: ");
                        contraseniaA = entrada.next();

                        for (Administrativo ad : administrativos) {
                            if (cedulaA.equals(ad.getCedula()) && contraseniaA.equals(ad.getContrasenia())) {
                                administradorActual = ad;
                                flagA += 1;
                                break;
                            }
                        }
                        if (flagA == 0) {
                            System.out.print("\033[H\033[2J");
                            System.out.println("Credenciales incorrectas");
                        }
                    } while (flagA == 0);

                    System.out.println("Que accion desea realizar: ");
                    System.out.println("1: Crear Estudiante.");
                    System.out.println("2: Crear Profesor.");
                    System.out.println("3: Crear otro Administrador.");
                    System.out.println("4. Salir");
                    System.out.print("Ingrese una opcion: ");
                    int opcionAdministrativo = entrada.nextInt();
                    System.out.print("\033[H\033[2J");

                    switch (opcionAdministrativo) {
                        case 1:
                            Estudiante estudianteNuevo;
                            System.out.print("Ingrese la cedula del nuevo estudiante: ");
                            String cedulaNuevoEst = entrada.next();
                            System.out.print("Ingrese el nombre del nuevo estudiante: ");
                            String nombreNuevoEst = entrada.next();
                            System.out.print("Ingrese el apellido del nuevo estudiante: ");
                            String apellidoNuevoEst = entrada.next();
                            System.out.print("Ingrese la contraseña del nuevo estudiante: ");
                            String contraseniaNuevoEst = entrada.next();
                            System.out.print("A que curso pertenece el estudiante (numero entero entre 1-7): ");
                            int cursoNuevoEst = entrada.nextInt();
                            estudianteNuevo = new Estudiante(cedulaNuevoEst, contraseniaNuevoEst,
                                    nombreNuevoEst, apellidoNuevoEst, cursoNuevoEst);
                            estudiantes.add(estudianteNuevo);
                            System.out.print("\033[H\033[2J");
                            System.out.println("Se agrego al estudiante correctamente");

                            for (Profesor p : profesores) {
                                if (p.getCurso() == cursoNuevoEst) {
                                    p.getEstudiantes().add(estudianteNuevo);
                                    break;
                                }
                            }
                            break;
                        case 2:
                            System.out.print("Ingrese la cedula del nuevo profesor: ");
                            String cedulaNuevoProf = entrada.next();
                            System.out.print("Ingrese el nombre del nuevo profesor: ");
                            String nombreNuevoProf = entrada.next();
                            System.out.print("Ingrese el apellido del nuevo profesor: ");
                            String apellidoNuevoProf = entrada.next();
                            System.out.print("Ingrese la contraseña del nuevo profesor: ");
                            String contraseniaNuevoProf = entrada.next();
                            System.out.print("A que curso pertenece el profesor (numero entero entre 1-7): ");
                            int cursoNuevoProf = entrada.nextInt();
                            Profesor profesorNuevo = new Profesor(cedulaNuevoProf, contraseniaNuevoProf,
                                    nombreNuevoProf, apellidoNuevoProf, cursoNuevoProf);
                            profesores.add(profesorNuevo);
                            System.out.print("\033[H\033[2J");
                            System.out.println("Se agrego al profesor correctamente");
                            break;
                        case 3:
                            System.out.print("Ingrese la cedula del nuevo administrador: ");
                            String cedulaNuevoAdm = entrada.next();
                            System.out.print("Ingrese el nombre del nuevo administrador: ");
                            String nombreNuevoAdm = entrada.next();
                            System.out.print("Ingrese el apellido del nuevo administrador: ");
                            String apellidoNuevoAdm = entrada.next();
                            System.out.print("Ingrese la contraseña del nuevo administrador: ");
                            String contraseniaNuevoAdm = entrada.next();
                            Administrativo adminNuevo = new Administrativo(cedulaNuevoAdm, contraseniaNuevoAdm,
                                    nombreNuevoAdm, apellidoNuevoAdm);
                            administrativos.add(adminNuevo);
                            break;
                        case 4:
                            System.out.print("\033[H\033[2J");
                            System.out.println("Salio del modo Administrativo");
                            break;
                    }
                    break;
                case 4:
                    System.out.print("\033[H\033[2J");
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.print("\033[H\033[2J"); // Limpiar la consola
                    System.out.println("Numero invalido. Vuelve a intentarlo\n");
            }
        } while (opcion != 4);

    }

}
