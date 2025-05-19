import java.util.Objects;

public class Factura {
    private String folio;    // Folio de la factura
    private String cliente;  // Nombre del cliente
    private double total;    // Total de la factura

    // Constructor
    public Factura(String folio, String cliente, double total) {
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    // Método toString
    @Override
    public String toString() {
        return "🧾 Factura [folio=" + folio + ", cliente=" + cliente + ", total=$" + total + "]";
    }

    // Método equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Comparar referencias
        if (obj == null || getClass() != obj.getClass()) return false; // Verificar tipo
        Factura factura = (Factura) obj; // Convertir a Factura
        return folio.equals(factura.folio); // Comparar folios
    }

    // Método hashCode
    @Override
    public int hashCode() {
        return Objects.hash(folio); // Generar hash basado en el folio
    }
}
