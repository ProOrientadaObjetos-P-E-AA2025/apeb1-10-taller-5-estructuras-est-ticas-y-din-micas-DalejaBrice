
import java.util.Scanner;

public class Problema2_CalificacionesMain {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = tcl.nextLine();
        System.out.print("Ingrese la edad del estudiante: ");
        int edadEstudiante = tcl.nextInt();
        tcl.nextLine();
        Problema2_Estudiante estudiante = new Problema2_Estudiante(nombreEstudiante, edadEstudiante);

        System.out.print("Nombre de la materia: ");
        String nombreMateria = tcl.nextLine();
        System.out.print("Ingrese la calificación ACD (sobre 3.5): ");
        double acd = tcl.nextDouble();
        System.out.print("Ingrese la calificación APE (sobre 3.5): ");
        double ape = tcl.nextDouble();
        System.out.print("Ingrese la calificación AA (sobre 3.0): ");
        double aa = tcl.nextDouble();
        Problema2_Materia materia = new Problema2_Materia(nombreMateria, acd, ape, aa);
        estudiante.AgregarMaterias(materia);
        if (materia.Aprobado()) {
            System.out.println("El estudiante ha aprobado la materia " + materia.getNombre() + ".");
        } else {
            System.out.println("El estudiante no ha aprobado la materia " + materia.getNombre() + ".");
            System.out.println("Debe rendir un examen de recuperación.");
        }
    }

}
