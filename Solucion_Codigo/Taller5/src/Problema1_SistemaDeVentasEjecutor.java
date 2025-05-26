
import java.util.ArrayList;
import java.util.Scanner;

public class Problema1_SistemaDeVentasEjecutor {

    public static void main(String[] args) {
        ArrayList<Problema1_Producto> inventario = new ArrayList<>();
        inventario.add(new Problema1_Producto("Laptop", 1200, 10));
        inventario.add(new Problema1_Producto("Mouse", 20, 50));
        inventario.add(new Problema1_Producto("Teclado", 35, 30));
        inventario.add(new Problema1_Producto("Monitor", 250, 15));

        Scanner tcl = new Scanner(System.in);
        Problema1_CarritoDeCompras carrito = new Problema1_CarritoDeCompras();

        System.out.println("Bienvenido a la Tienda");
        String opcion;

        do {
            System.out.println("\nOpciones:");
            System.out.println("1. Agregar producto al carrito");
            System.out.println("2. Mostrar detalle de compra");
            System.out.println("3. Realizar pago");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = tcl.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Ingrese nombre del producto: ");
                    String nombre = tcl.nextLine();
                    System.out.print("Ingrese cantidad: ");
                    int cantidad = Integer.parseInt(tcl.nextLine());
                    carrito.agregarProducto(nombre, cantidad, inventario);
                    break;

                case "2":
                    carrito.mostrarDetalleCompra();
                    System.out.println("Total actual: $" + carrito.calcularTotal());
                    break;

                case "3":
                    System.out.print("Ingrese monto a pagar: ");
                    double monto = Double.parseDouble(tcl.nextLine());
                    System.out.print("Ingrese porcentaje de descuento (si aplica): ");
                    double descuento = Double.parseDouble(tcl.nextLine());
                    carrito.realizarPago(monto, inventario, descuento);
                    break;

                case "4":
                    System.out.println("Gracias por visitar la tienda.");
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (!opcion.equals("4"));

    }
}
