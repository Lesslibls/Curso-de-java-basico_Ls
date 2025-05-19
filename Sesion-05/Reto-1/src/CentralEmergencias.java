public class CentralEmergencias {
    public static void main(String[] args) {
        // Crear instancias de cada tipo de unidad
        Ambulancia ambulancia = new Ambulancia("Ambulancia 1", "Juan Pérez");
        Patrulla patrulla = new Patrulla("Patrulla 2", "María López");
        UnidadBomberos unidadBomberos = new UnidadBomberos("Bomberos 3", "Carlos García");

        // Llamar al método iniciarOperacion() en cada unidad
        ambulancia.iniciarOperacion();
        System.out.println();
        patrulla.iniciarOperacion();
        System.out.println();
        unidadBomberos.iniciarOperacion();
    }
}
