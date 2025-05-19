public class CajaRegistradora {
    public static void main(String[] args) {
        // Crear un arreglo de tipo MetodoPago con instancias mezcladas
        MetodoPago[] metodosPago = new MetodoPago[]{
                new PagoEfectivo(150.0),
                new PagoTarjeta(320.0, 500.0),
                new PagoTransferencia(200.0)
        };

        // Recorrer el arreglo y procesar los pagos
        for (MetodoPago metodo : metodosPago) {
            if (metodo.autenticar()) {
                System.out.println("✅ Autenticación exitosa.");
                metodo.procesarPago();
                metodo.mostrarResumen();
            } else {
                System.out.println("❌ Fallo de autenticación. " + metodo.getClass().getSimpleName() + " no válida.");
            }
            System.out.println(); // Línea en blanco para mejor legibilidad
        }
    }
}
