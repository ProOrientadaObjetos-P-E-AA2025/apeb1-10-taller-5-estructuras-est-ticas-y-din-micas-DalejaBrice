
public class Problema3_Departamento {
    private String nombre;
    private int numE;
    private double produccionA;
    private String categoria;

    public Problema3_Departamento(String nombre, int numE, double produccionA) {
        this.nombre = nombre;
        this.numE = numE;
        this.produccionA = produccionA;
        this.categoria = Categoria();
    }

    private String Categoria(){
        if (numE >20 && produccionA > 1000000 ) {
            return "A";
        }else if (numE >=20 && produccionA >=1000000) {
            return "B";
        } else if (numE >= 10 && produccionA >= 50000) {
            return "C";
        } else{
            return "nah";
        }
    }
    public String toString() {
        return "Departamento: " + nombre +
               "\nEmpleados: " + numE +
               "\nProduccion Anual: $" + produccionA +
               "\nCategoría: " + categoria + "\n";
    }
}
