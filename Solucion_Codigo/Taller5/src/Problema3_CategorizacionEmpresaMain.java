
import java.util.Scanner;

public class Problema3_CategorizacionEmpresaMain {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        System.out.print("Nombre de la empresa: ");
        String nombreE = tcl.nextLine();
        System.out.print("RUC de la empresa: ");
        String ruc= tcl.nextLine();
        System.out.print("Direccion de empresa: ");
        String direccion = tcl.nextLine();
        
        Problema3_Empresa empresa = new Problema3_Empresa(nombreE, ruc, direccion);
        
        System.out.print("Numero de departamentos: ");
        int nD = tcl.nextInt();
        tcl.nextLine();
        for (int i = 0; i < nD; i++) {
            System.out.println("Departamento "+(i+1));
            System.out.print("Nombre del departamento: ");
            String nombreD = tcl.nextLine();
            System.out.print("Numero de empleados: ");
            int numeroEmp = Integer.parseInt(tcl.nextLine());
            System.out.print("Produccion anual: ");
            double produccion = Double.parseDouble(tcl.nextLine());
            Problema3_Departamento depar = new Problema3_Departamento(nombreD,numeroEmp,produccion);
            empresa.AgregarDepar(depar);
        }
        System.out.println("Clasificacion: ");
        empresa.mostrarDepar();
    }
}
