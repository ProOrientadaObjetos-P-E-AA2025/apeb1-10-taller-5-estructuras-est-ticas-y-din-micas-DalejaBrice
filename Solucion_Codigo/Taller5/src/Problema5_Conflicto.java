
public class Problema5_Conflicto {
    private String nombre;
    private String[] paisesInvolucrados;
    private String estado;
    private Problema5_Evento[] eventos;
    private int numEventos;

    // Variables normales de instancia, no static ni final
    private int MAX_EVENTOS = 100;
    private String[] PAISES_PRIMER_MUNDO = {
        "Estados Unidos", "Reino Unido", "Alemania", "Francia", "Japón", "Canadá", "Italia", "Australia"
    };

    public Problema5_Conflicto(String nombre, String[] paisesInvolucrados, String estado) {
        this.nombre = nombre;
        this.paisesInvolucrados = paisesInvolucrados;
        this.estado = estado;
        this.eventos = new Problema5_Evento[MAX_EVENTOS];
        this.numEventos = 0;
    }

    public void agregarEvento(Problema5_Evento evento) {
        if (numEventos < MAX_EVENTOS) {
            eventos[numEventos] = evento;
            numEventos++;
            evaluarConflicto();
        }
    }

    private boolean esPaisDesarrollado(String pais) {
        for (int i = 0; i < PAISES_PRIMER_MUNDO.length; i++) {
            if (PAISES_PRIMER_MUNDO[i].equalsIgnoreCase(pais)) {
                return true;
            }
        }
        return false;
    }

    private void evaluarConflicto() {
        int totalBatallas = 0;
        int batallasEnDesarrolladosConNucleares = 0;
        int paisesConBajas = 0;

        for (int i = 0; i < numEventos; i++) {
            Problema5_Evento e = eventos[i];

            if (e.getTipoEvento().equalsIgnoreCase("batalla")) {
                totalBatallas++;

                if (esPaisDesarrollado(e.getUbicacion()) && e.isUsaArmasNucleares()) {
                    batallasEnDesarrolladosConNucleares++;
                }
            }

            if (e.getBajasPorcentuales() >= 50.0) {
                paisesConBajas++;
            }
        }

        int totalPaises = 195; // Aproximado número total de países en el mundo
        double porcentajeBatallas = ((double) totalBatallas / totalPaises) * 100;

        if (porcentajeBatallas > 50 || batallasEnDesarrolladosConNucleares > 0) {
            estado = "Guerra mundial";
        } else if (porcentajeBatallas >= 30 || paisesConBajas > 0) {
            estado = "Convocar a la ONU con urgencia";
        }
    }

    public void mostrarEventos() {
        System.out.println("\nConflicto: " + nombre);
        System.out.println("Estado actual: " + estado);
        for (int i = 0; i < numEventos; i++) {
            System.out.println(eventos[i]);
        }
    }
}
