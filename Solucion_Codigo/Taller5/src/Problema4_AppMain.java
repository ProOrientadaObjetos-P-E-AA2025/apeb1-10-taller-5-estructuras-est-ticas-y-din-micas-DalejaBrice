
public class Problema4_AppMain {
    public static void main(String[] args) {

        int diaHoy = 25;
        int mesHoy = 5;
        int anioHoy = 2025;

        Problema4_Corrupcion caso = new Problema4_Corrupcion(
                "Hospital Seguro",
                5, 5, 2025, // Fecha de inicio del caso
                "Compra fraudulenta de insumos médicos"
        );

        Problema4_Persona persona1 = new Problema4_Persona("Ana Torres", 45, "Directora", "acusado", true, 0.5, 80000);
        Problema4_Persona persona2 = new Problema4_Persona("Luis Pérez", 39, "Asesor Legal", "testigo", false, 0, 0);
        Problema4_Persona persona3 = new Problema4_Persona("Laura Quispe", 50, "Jefa de Finanzas", "acusado", false, 2.0, 120000);

        caso.agregarPersona(persona1);
        caso.agregarPersona(persona2);
        caso.agregarPersona(persona3);

        caso.mostrarInfo(diaHoy, mesHoy, anioHoy);
    }
}
