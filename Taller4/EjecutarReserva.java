package Taller4;

import java.time.LocalDate;

public class EjecutarReserva {
    public static void main(String[] args) {
       
        ReservaHotel reserva1 = new ReservaHotel();
        ReservaHotel reserva2 = new ReservaHotel();

        
        reserva1.nuevaReserva("Juan Pérez", LocalDate.of(2024, 10, 15), LocalDate.of(2024, 10, 20), 101);


        reserva1.consultarReserva();


        reserva2.nuevaReserva("Goku Gómez", LocalDate.of(2024, 11, 5), LocalDate.of(2024, 11, 10), 202);


        reserva1.cancelarReserva();

        
        reserva1.nuevaReserva("Vegeta López", LocalDate.of(2024, 12, 1), LocalDate.of(2024, 12, 5), 303);

        
        reserva1.consultarReserva();

        reserva2.consultarReserva();
    }
}
}
