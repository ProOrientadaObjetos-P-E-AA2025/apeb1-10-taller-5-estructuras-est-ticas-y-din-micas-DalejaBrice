
public class Problema2_Materia {

    private String nombre;
    private double acd;
    private double ape;
    private double aa;

    public Problema2_Materia(String nombre, double acd, double ape, double aa) {
        this.nombre = nombre;
        this.acd = acd;
        this.ape = ape;
        this.aa = aa;
    }

    public boolean Aprobado() {
        double total = acd + ape + aa;
        if (total >= 7) {
            return true;
        } else {
            System.out.println("Debe rendir examen de recuperacion");
            double ac = (ape + aa + acd) * 0.6;
            double recu = 3.5;
            return (ac + recu) >= 7;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public double getAcd() {
        return acd;
    }

    public double getApe() {
        return ape;
    }

    public double getAa() {
        return aa;
    }

}
