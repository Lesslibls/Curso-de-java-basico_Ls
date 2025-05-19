public abstract class MetodoPago {
    protected double monto; // Monto del pago

    public MetodoPago(double monto) {
        this.monto = monto;
    }

    // Método abstracto que debe ser implementado por las subclases
    public abstract void procesarPago();

    // Método concreto para mostrar el resumen del pago
    public void mostrarResumen() {
        System.out.println("📄 Tipo: " + this.getClass().getSimpleName() + " - Monto: $" + monto);
    }
}
