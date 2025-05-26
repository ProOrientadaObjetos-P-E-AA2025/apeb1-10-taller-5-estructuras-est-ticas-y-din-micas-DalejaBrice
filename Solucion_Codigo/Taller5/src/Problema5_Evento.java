
public class Problema5_Evento {
    private String nombre;
    private String tipoEvento; // batalla, tratado, etc.
    private int dia, mes, anio;
    private String ubicacion;
    private String descripcion;
    private boolean usaArmasNucleares;
    private double bajasPorcentuales;

    public Problema5_Evento(String nombre, String tipoEvento, int dia, int mes, int anio, String ubicacion, String descripcion, boolean usaArmasNucleares, double bajasPorcentuales) {
        this.nombre = nombre;
        this.tipoEvento = tipoEvento;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
        this.usaArmasNucleares = usaArmasNucleares;
        this.bajasPorcentuales = bajasPorcentuales;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public boolean isUsaArmasNucleares() {
        return usaArmasNucleares;
    }

    public double getBajasPorcentuales() {
        return bajasPorcentuales;
    }

    public String toString() {
        String nucleares;
        if (usaArmasNucleares) {
            nucleares = "Sí";
        } else {
            nucleares = "No";
        }

        return "Evento: " + nombre + " | Tipo: " + tipoEvento + " | Ubicación: " + ubicacion +
               "\nFecha: " + dia + "/" + mes + "/" + anio +
               "\nDescripción: " + descripcion +
               "\nUsa armas nucleares: " + nucleares +
               "\nBajas: " + bajasPorcentuales + "%\n";
    }
}
