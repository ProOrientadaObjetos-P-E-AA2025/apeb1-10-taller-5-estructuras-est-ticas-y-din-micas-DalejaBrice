import java.util.ArrayList;

public class Problema1_CarritoDeCompras {
    private ArrayList<Problema1_Producto> productosCarrito = new ArrayList<>();
    private double totalCompra = 0;
    private double descuento =0;
    
    public boolean agregarProducto(String nombre, int cantidad, ArrayList<Problema1_Producto> inventario) {
        for (Problema1_Producto prod : inventario) {
            if (prod.getNombre().equalsIgnoreCase(nombre)) {
                if (prod.getCantidad() >= cantidad) {
                    Problema1_Producto productoEnCarrito = new Problema1_Producto(prod.getNombre(), prod.getPrecio(), cantidad);
                    productosCarrito.add(productoEnCarrito);
                    System.out.println(cantidad + " unidades de " + nombre + " agregadas al carrito.");
                    return true;
                } else {
                    System.out.println("No hay suficiente cantidad disponible de " + nombre);
                    return false;
                }
            }
        }
        System.out.println("Producto no encontrado en la tienda.");
        return false;
    }
    public double calcularTotal() {
        totalCompra = 0;
        for (Problema1_Producto p : productosCarrito) {
            totalCompra += p.getPrecio() * p.getCantidad();
        }
        return totalCompra;
    }

    public void realizarPago(double montoPagado, ArrayList<Problema1_Producto> inventario, double porcentajeDescuento) {
        double total = calcularTotal();

        if (total > 1000) {
            descuento = total * (porcentajeDescuento / 100);
            total -= descuento;
            System.out.println("Descuento aplicado de $" + descuento);
        }

        if (montoPagado >= total) {
            System.out.println("Pago realizado con éxito. Gracias por su compra.");
            actualizarInventario(inventario);
        } else {
            System.out.println("Fondos insuficientes. Faltan $" + (total - montoPagado));
        }
    }

    private void actualizarInventario(ArrayList<Problema1_Producto> inventario) {
        for (Problema1_Producto pc : productosCarrito) {
            for (Problema1_Producto pi : inventario) {
                if (pc.getNombre().equalsIgnoreCase(pi.getNombre())) {
                    pi.reducirCantidad(pc.getCantidad());
                }
            }
        }
    }

    public void mostrarDetalleCompra() {
        System.out.println("Detalle de la compra:");
        for (Problema1_Producto p : productosCarrito) {
            System.out.println("- " + p.getNombre() + " x" + p.getCantidad() + " = $" + (p.getPrecio() * p.getCantidad()));
        }
    }
}
