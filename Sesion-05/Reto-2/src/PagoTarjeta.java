public class PagoTarjeta extends MetodoPago implements Autenticable {
    private double saldoDisponible; // Saldo disponible en la tarjeta

    public PagoTarjeta(double monto, double saldoDisponible) {
        super(monto);
        this.saldoDisponible = saldoDisponible;
    }

    @Override
    public boolean autenticar() {
        // Valida si hay fondos suficientes
        return saldoDisponible >= monto;
    }

    @Override
    public void procesarPago() {
        System.out.println("💳 Procesando pago con tarjeta por $" + monto);
    }
}
