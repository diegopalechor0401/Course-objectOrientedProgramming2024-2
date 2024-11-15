package Taller4;

public class Reserva {
    private String nombreCliente;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private int numeroHabitacion;
    private boolean reservaActiva;

    
    public Reserva() {
    
        this.reservaActiva = false;
    }

    
    public void nuevaReserva(String nombreCliente, LocalDate fechaEntrada, LocalDate fechaSalida, int numeroHabitacion) {
        if (reservaActiva) {
            System.out.println("Ya hay una reserva activa. Por favor, cancele la reserva actual antes de hacer una nueva.");
        } else {
            this.nombreCliente = nombreCliente;
            this.fechaEntrada = fechaEntrada;
            this.fechaSalida = fechaSalida;
            this.numeroHabitacion = numeroHabitacion;
            this.reservaActiva = true;
            System.out.println("Reserva creada con éxito para " + nombreCliente + " en la habitación " + numeroHabitacion + ".");
        }
    }

    public void cancelarReserva() {
        if (reservaActiva) {
            System.out.println("Reserva cancelada para " + nombreCliente + " en la habitación " + numeroHabitacion + ".");
            this.nombreCliente = null;
            this.fechaEntrada = null;
            this.fechaSalida = null;
            this.numeroHabitacion = 0;
            this.reservaActiva = false;
        } else {
            System.out.println("No hay una reserva activa para cancelar.");
        }
    }

    public void consultarReserva() {
        if (reservaActiva) {
            System.out.println("Información de la reserva:");
            System.out.println("Nombre del cliente: " + nombreCliente);
            System.out.println("Fecha de entrada: " + fechaEntrada);
            System.out.println("Fecha de salida: " + fechaSalida);
            System.out.println("Número de habitación: " + numeroHabitacion);
        } else {
            System.out.println("No hay una reserva activa.");
        }
    }
}
