package Taller3.Producto.java.as;

public class EjecutarProducto {
    public static void main(String[] args) {
        
        Producto producto1 = new Producto("chocoramo", "ABC123", 3, 999.99);
        Producto producto2 = new Producto("cafe", "XYZ789", 6, 499.99);

        producto1.mostrarInformacion();
        producto2.mostrarInformacion();

        System.out.println("\nAñadiendo stock al producto 1...");
        producto1.anadirStock(10);
        
        System.out.println("\nReduciendo stock del producto 2...");
        producto2.reducirStock(20);

        System.out.println("\nInformación actualizada de los productos:");
        producto1.mostrarInformacion();
        producto2.mostrarInformacion();
    }
}