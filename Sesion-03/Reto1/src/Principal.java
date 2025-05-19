public class Principal {
    public static void main(String[] args) {
        // Crear un pasajero y un vuelo
        Pasajero pasajero1 = new Pasajero("Ana Martínez", "A12345678");
        Vuelo vuelo1 = new Vuelo("UX123", "París", "14:30");

        // Reservar el asiento en el vuelo
        if (vuelo1.reservarAsiento(pasajero1)) {
            System.out.println("✅ Reserva realizada con éxito.");
        } else {
            System.out.println("❌ No se pudo realizar la reserva.");
        }

        // Mostrar el itinerario
        System.out.println(vuelo1.obtenerItinerario());

        // Cancelar la reserva
        System.out.println("❌ Cancelando reserva...");
        vuelo1.cancelarReserva();

        // Mostrar nuevamente el itinerario
        System.out.println(vuelo1.obtenerItinerario());

        // Reservar un asiento en el vuelo usando un nombre y pasaporte
        if (vuelo1.reservarAsiento("Mario Gonzalez", "B98765432")) {
            System.out.println("✅ Reserva realizada con éxito.");
        } else {
            System.out.println("❌ No se pudo realizar la reserva.");
        }

        // Mostrar el itinerario final
        System.out.println(vuelo1.obtenerItinerario());
    }
}
