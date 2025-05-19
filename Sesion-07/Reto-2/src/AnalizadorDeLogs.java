import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AnalizadorDeLogs {
    private static final String NOMBRE_ARCHIVO_LOG = "errores.log";
    private static final String NOMBRE_ARCHIVO_REGISTRO = "registro_fallos.txt";

    public static void main(String[] args) {
        int totalLineas = 0;
        int cantidadErrores = 0;
        int cantidadAdvertencias = 0;

        // Definir la ruta del archivo de logs
        Path rutaLog = Paths.get(NOMBRE_ARCHIVO_LOG);

        // Usar try-with-resources para abrir el archivo errores.log
        try {
            // Verificar si el archivo existe, si no, crearlo
            if (!Files.exists(rutaLog)) {
                Files.createFile(rutaLog);
                System.out.println("El archivo " + NOMBRE_ARCHIVO_LOG + " ha sido creado.");
            }

            // Leer el archivo
            try (BufferedReader br = new BufferedReader(new FileReader(rutaLog.toFile()))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    totalLineas++;
                    if (linea.contains("ERROR")) {
                        cantidadErrores++;
                    }
                    if (linea.contains("WARNING")) {
                        cantidadAdvertencias++;
                    }
                }
            }
        } catch (IOException e) {
            // Capturar excepciones y guardar el mensaje de error en registro_fallos.txt
            guardarErrorRegistro(e.getMessage());
            System.out.println("Se produjo un error al leer el archivo: " + e.getMessage());
            return; // Salir del programa si hay un error
        }

        // Calcular porcentajes
        double porcentajeErrores = (totalLineas > 0) ? (cantidadErrores * 100.0 / totalLineas) : 0;
        double porcentajeAdvertencias = (totalLineas > 0) ? (cantidadAdvertencias * 100.0 / totalLineas) : 0;

        // Imprimir resumen
        System.out.println("Resumen del análisis:");
        System.out.println("Total de líneas leídas: " + totalLineas);
        System.out.println("Cantidad de errores: " + cantidadErrores);
        System.out.println("Cantidad de advertencias: " + cantidadAdvertencias);
        System.out.printf("Porcentaje de líneas con errores: %.2f%%\n", porcentajeErrores);
        System.out.printf("Porcentaje de líneas con advertencias: %.2f%%\n", porcentajeAdvertencias);
    }

    private static void guardarErrorRegistro(String mensajeError) {
        // Guardar el mensaje de error en registro_fallos.txt
        Path rutaRegistro = Paths.get(NOMBRE_ARCHIVO_REGISTRO);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaRegistro.toFile(), true))) {
            bw.write(mensajeError);
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Error al guardar el registro de fallos: " + e.getMessage());
        }
    }
}
