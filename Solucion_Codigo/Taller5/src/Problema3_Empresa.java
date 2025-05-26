
import java.util.ArrayList;


public class Problema3_Empresa {
    private String nombre;
    private String ruc;
    private String direccion;
    private ArrayList<Problema3_Departamento> departamento;
    
    public Problema3_Empresa(String nombre, String ruc, String direccion) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.departamento = new ArrayList<>();
    }
    public void AgregarDepar(Problema3_Departamento depar){
        departamento.add(depar);
    }
    public void mostrarDepar(){
        System.out.println("Empresa "+ nombre);
        for (Problema3_Departamento depar : departamento) {
            System.out.println(depar);
        }
    }
}
