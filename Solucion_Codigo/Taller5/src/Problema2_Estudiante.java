
import java.util.ArrayList;

public class Problema2_Estudiante {

    private String nombre;
    private int edad;
    private ArrayList<Problema2_Materia> materias;

    public Problema2_Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.materias = materias;
    }

    public void AgregarMaterias(Problema2_Materia materia) {
        materias.add(materia);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public ArrayList<Problema2_Materia> getMaterias() {
        return materias;
    }

}
