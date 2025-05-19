// Entrada.java
public class Entrada {
    // Atributos
    private String nombreEvento;
    private double precioEntrada;

    // Constructor
    public Entrada(String nombreEvento, double precioEntrada) {
        this.nombreEvento = nombreEvento;
        this.precioEntrada = precioEntrada;
    }

    // Método para mostrar la información de la entrada
    public void mostrarInformacion() {
        System.out.println("Evento: " + nombreEvento + " | Precio: $" + precioEntrada);
    }



}
