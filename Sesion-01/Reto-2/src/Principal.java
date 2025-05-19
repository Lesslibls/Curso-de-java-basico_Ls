// Principal.java
public class Principal {
    public static void main(String[] args) {
        // Crear objetos de tipo Entrada
        Entrada entrada1 = new Entrada("Obra de Teatro", 450.0);
        Entrada entrada2 = new Entrada("Concierto de Rock", 750.0);

        // Llamar al método mostrarInformacion() para mostrar los datos en consola
        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

        // Crear objetos de tipo EntradaRecord usando el record
        EntradaRecord entradaRecord1 = new EntradaRecord("Obra de Teatro", 450.0);
        EntradaRecord entradaRecord2 = new EntradaRecord("Concierto de Rock", 750.0);

        // Llamar al método mostrarInformacion() para mostrar los datos en consola
        entradaRecord1.mostrarInformacion();
        entradaRecord2.mostrarInformacion();
    }
}
