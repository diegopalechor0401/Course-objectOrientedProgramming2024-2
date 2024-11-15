package Taller3;

public class Producto {
    private String nombre;
    private String codigo;
    private int cantidadStock;
    private double precio;

    public Producto(String nombre, String codigo, int cantidadStock, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidadStock = cantidadStock;
        this.precio = precio;
    }

    public void anadirStock(int cantidad) {
        if (cantidad > 0) {
            cantidadStock += cantidad;
            System.out.println("Se han añadido " + cantidad + " unidades del producto '" + nombre + "'.");
        } else {
            System.out.println("La cantidad a añadir debe ser positiva.");
        }
    }

    public void reducirStock(int cantidad) {
        if (cantidad > 0) {
            if (cantidadStock >= cantidad) {
                cantidadStock -= cantidad;
                System.out.println("Se han reducido " + cantidad + " unidades del producto '" + nombre + "'.");
            } else {
                System.out.println("No hay suficiente stock para reducir " + cantidad + " unidades del producto '" + nombre + "'.");
            }
        } else {
            System.out.println("La cantidad a reducir debe ser positiva.");
        }
    }

    public double calcularValorInventario() {
        return cantidadStock * precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public double getPrecio() {
        return precio;
    }

    
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Cantidad en Stock: " + cantidadStock);
        System.out.println("Precio: $" + precio);
        System.out.println("Valor Total en Inventario: $" + calcularValorInventario());
    }
}