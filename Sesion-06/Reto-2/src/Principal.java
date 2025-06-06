import java.util.Comparator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class Principal {
    public static void main(String[] args) {
        // Usar CopyOnWriteArrayList para gestionar los temas activos
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();
        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));

        // Mostrar la lista ordenada alfabéticamente (orden natural)
        System.out.println("Temas ordenados alfabéticamente:");
        temas.sort(null); // Ordena usando el método compareTo de Tema
        for (Tema tema : temas) {
            System.out.println(tema);
        }

        // Ordenar por prioridad ascendente (1 → 3) usando Comparator
        System.out.println("\nTemas ordenados por prioridad:");
        temas.sort(Comparator.comparingInt(Tema::getPrioridad));
        for (Tema tema : temas) {
            System.out.println(tema);
        }

        // Usar ConcurrentHashMap como repositorio de recursos
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/medioambiente");

        // Mostrar el repositorio de recursos
        System.out.println("\nRepositorio de recursos:");
        for (String titulo : recursos.keySet()) {
            System.out.println(titulo + " → " + recursos.get(titulo));
        }
    }
}
