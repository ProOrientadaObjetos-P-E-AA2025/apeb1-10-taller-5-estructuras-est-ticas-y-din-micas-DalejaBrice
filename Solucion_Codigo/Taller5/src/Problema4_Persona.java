
public class Problema4_Persona {
    private String nombre;
    private int edad;
    private String ocupacion;
    private String nivelImplicacion;
    private boolean colabora;
    private double sentenciaAnios;
    private double danioEconomico;

    public Problema4_Persona(String nombre, int edad, String ocupacion, String nivelImplicacion,
                   boolean colabora, double sentenciaAnios, double danioEconomico) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.nivelImplicacion = nivelImplicacion;
        this.colabora = colabora;
        this.sentenciaAnios = sentenciaAnios;
        this.danioEconomico = danioEconomico;
    }

    public boolean puedeReducirPena() {
        return nivelImplicacion.equalsIgnoreCase("acusado") && colabora;
    }

    public boolean puedePagarFianza() {
        return nivelImplicacion.equalsIgnoreCase("acusado") && colabora && sentenciaAnios < 1;
    }

    public double calcularFianza() {
        if (puedePagarFianza()) {
            return danioEconomico * 0.5;
        }
        return 0;
    }

    @Override
    public String toString() {
        String info = "Nombre: " + nombre +
                "\nEdad: " + edad +
                "\nOcupación: " + ocupacion +
                "\nNivel de implicación: " + nivelImplicacion +
                "\nSentencia: " + sentenciaAnios + " años";
        if (puedeReducirPena()) {
            info += "\n* Puede acogerse a reducción de pena.";
        }
        if (puedePagarFianza()) {
            info += String.format("\n* Puede pagar fianza: $%.2f", calcularFianza());
        }
        return info;
    }
}
