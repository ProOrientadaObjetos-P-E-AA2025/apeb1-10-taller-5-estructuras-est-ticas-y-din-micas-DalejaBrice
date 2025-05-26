import java.util.ArrayList;

public class Problema4_Corrupcion {
    private String nombreCaso;
    private int diaInicio;
    private int mesInicio;
    private int anioInicio;
    private String estado;
    private String detalle;
    private ArrayList<Problema4_Persona> implicados;

    public Problema4_Corrupcion(String nombreCaso, int dia, int mes, int anio, String detalle) {
        this.nombreCaso = nombreCaso;
        this.diaInicio = dia;
        this.mesInicio = mes;
        this.anioInicio = anio;
        this.detalle = detalle;
        this.estado = "Iniciado";
        this.implicados = new ArrayList<>();
    }

    public void agregarPersona(Problema4_Persona persona) {
        implicados.add(persona);
    }

    public void actualizarEstado(int diaActual, int mesActual, int anioActual) {
        int diasInicio = anioInicio * 365 + mesInicio * 30 + diaInicio;
        int diasHoy = anioActual * 365 + mesActual * 30 + diaActual;
        int diferencia = diasHoy - diasInicio;

        if (diferencia > 14) {
            estado = "Urgente";
        } else if (diferencia > 7) {
            estado = "Alerta";
        } else {
            estado = "Iniciado";
        }
    }

    public void mostrarInfo(int diaActual, int mesActual, int anioActual) {
        actualizarEstado(diaActual, mesActual, anioActual);
        System.out.println("=== CASO: " + nombreCaso + " ===");
        System.out.println("Fecha inicio: " + diaInicio + "/" + mesInicio + "/" + anioInicio);
        System.out.println("Estado: " + estado);
        System.out.println("Detalle: " + detalle);
        System.out.println("--- Implicados ---");
        for (Problema4_Persona persona : implicados) {
            System.out.println(persona);
            System.out.println("------------------");
        }
    }
}
