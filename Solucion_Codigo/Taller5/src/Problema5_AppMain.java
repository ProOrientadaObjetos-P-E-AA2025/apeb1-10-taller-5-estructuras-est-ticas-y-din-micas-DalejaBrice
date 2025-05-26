
public class Problema5_AppMain {
    public static void main(String[] args) {
        String[] paises = {"Estados Unidos", "Rusia", "China", "Francia"};
        Problema5_Conflicto conflicto = new Problema5_Conflicto("Conflicto Global", paises, "Activo");

        Problema5_Evento e1 = new Problema5_Evento("Batalla del Norte", "batalla", 10, 5, 2024, "Estados Unidos", "Batalla con uso nuclear", true, 60);
        Problema5_Evento e2 = new Problema5_Evento("Tratado de Paz", "tratado", 12, 5, 2024, "Francia", "Tratado de cese al fuego", false, 0);

        conflicto.agregarEvento(e1);
        conflicto.agregarEvento(e2);

        conflicto.mostrarEventos();
    }
}
