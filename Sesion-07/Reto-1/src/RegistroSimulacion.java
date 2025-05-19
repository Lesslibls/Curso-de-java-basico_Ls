import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RegistroSimulacion {
    private static final String NOMBRE_ARCHIVO = "parametros.txt";
    private static final String RUTA_CARPETA = "config/";

    public static void main(String[] args) {
        // Crear el archivo de parámetros
        guardarParametros();

        // Leer y mostrar el contenido del archivo
        leerParametros();
    }

    private static void guardarParametros() {
        // Definir la ruta del archivo
        Path rutaArchivo = Paths.get(RUTA_CARPETA + NOMBRE_ARCHIVO);

        // Crear la carpeta si no existe
        try {
            Files.createDirectories(rutaArchivo.getParent());
        } catch (IOException e) {
            System.err.println("Error al crear la carpeta: " + e.getMessage());
            return;
        }

        // Definir los parámetros
        String contenido = "Tiempo de ciclo: 55.8 segundos\n" +
                "Velocidad de línea: 1.2 m/s\n" +
                "Número de estaciones: 8";

        // Escribir el contenido en el archivo
        try {
            Files.write(rutaArchivo, contenido.getBytes());
            System.out.println("Archivo de parámetros creado: " + rutaArchivo);
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    private static void leerParametros() {
        // Definir la ruta del archivo
        Path rutaArchivo = Paths.get(RUTA_CARPETA + NOMBRE_ARCHIVO);

        // Verificar si el archivo existe
        if (Files.exists(rutaArchivo)) {
            try {
                // Leer el contenido del archivo
                String contenido = Files.readString(rutaArchivo);
                System.out.println("Contenido del archivo de parámetros:");
                System.out.println(contenido);
            } catch (IOException e) {
                System.err.println("Error al leer el archivo: " + e.getMessage());
            }
        } else {
            System.out.println("El archivo de parámetros no existe.");
        }
    }
}
