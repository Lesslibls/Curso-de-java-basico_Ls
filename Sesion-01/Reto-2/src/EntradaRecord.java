// EntradaRecord.java
public record EntradaRecord(String nombreEvento, double precioEntrada) {
    // Método para mostrar la información de la entrada
    public void mostrarInformacion() {
        System.out.println("Evento: " + nombreEvento + " | Precio: $" + precioEntrada);
    }
}
