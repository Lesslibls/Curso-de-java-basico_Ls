import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class LaboratorioBiotecnologia {
    public static void main(String[] args) {
        // Paso 1: ArrayList para registrar todas las especies en orden
        ArrayList<String> muestras = new ArrayList<>();
        muestras.add("Homo sapiens");
        muestras.add("Mus musculus");
        muestras.add("Arabidopsis thaliana");
        muestras.add("Homo sapiens"); // Muestra repetida

        // Paso 2: HashSet para filtrar especies únicas
        HashSet<String> especiesUnicas = new HashSet<>(muestras);

        // Paso 3: HashMap para asociar ID de muestra con investigador
        HashMap<String, String> idInvestigador = new HashMap<>();
        idInvestigador.put("M-001", "Dra. López");
        idInvestigador.put("M-002", "Dr. Hernández");
        idInvestigador.put("M-003", "Dra. Pérez");

        // Paso 4: Mostrar resultados
        // Mostrar la lista completa y ordenada de muestras
        System.out.println("Lista completa de muestras:");
        for (String muestra : muestras) {
            System.out.println(muestra);
        }

        // Mostrar las especies únicas procesadas
        System.out.println("\nEspecies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println(especie);
        }

        // Mostrar la relación de ID de muestra → investigador
        System.out.println("\nRelación de ID de muestra → investigador:");
        for (String id : idInvestigador.keySet()) {
            System.out.println(id + " → " + idInvestigador.get(id));
        }

        // Búsqueda por ID de muestra
        String idBuscado = "M-002";
        if (idInvestigador.containsKey(idBuscado)) {
            System.out.println("\nInvestigador responsable de " + idBuscado + ": " + idInvestigador.get(idBuscado));
        } else {
            System.out.println("\nID de muestra " + idBuscado + " no encontrado.");
        }
    }
}
