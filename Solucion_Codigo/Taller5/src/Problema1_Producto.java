
public class Problema1_Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Problema1_Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void reducirCantidad(int cantidadVendida) {
        if (cantidadVendida <= cantidad) {
            this.cantidad -= cantidadVendida;
        }
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
