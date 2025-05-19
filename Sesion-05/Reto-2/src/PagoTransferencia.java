import java.util.Random;

public class PagoTransferencia extends MetodoPago implements Autenticable {
    public PagoTransferencia(double monto) {
        super(monto);
    }

    @Override
    public boolean autenticar() {
        // Simula una validación bancaria externa
        Random random = new Random();
        return random.nextBoolean(); // Retorna true o false aleatoriamente
    }

    @Override
    public void procesarPago() {
        System.out.println("🏦 Procesando pago por transferencia de $" + monto);
    }
}
