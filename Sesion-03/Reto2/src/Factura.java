import java.util.Optional;

public class Factura {
    private double monto; // Monto total de la factura
    private String descripcion; // Descripción de la factura
    private Optional<String> rfc; // RFC del cliente, puede ser nulo

    // Constructor
    public Factura(double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc); // Almacena el RFC usando Optional
    }

    // Método para obtener un resumen de la factura
    public String getResumen() {
        String rfcResumen = rfc.isPresent() ? rfc.get() : "[No proporcionado]";
        return "📄 Factura generada:\n" +
                "Descripción: " + descripcion + "\n" +
                "Monto: $" + monto + "\n" +
                "RFC: " + rfcResumen;
    }
}
