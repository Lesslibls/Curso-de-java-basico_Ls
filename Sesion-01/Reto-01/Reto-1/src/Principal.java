import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un objeto de tipo Paciente
        Paciente paciente = new Paciente();

        // Solicitar datos al usuario
        System.out.print("Ingrese el nombre del paciente: ");
        String nombre = scanner.nextLine();
        paciente.setNombre(nombre);

        System.out.print("Ingrese la edad del paciente: ");
        int edad = scanner.nextInt();
        paciente.setEdad(edad);
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Ingrese el número de expediente: ");
        String numeroExpediente = scanner.nextLine();
        paciente.setNumeroExpediente(numeroExpediente);

        // Mostrar la información del paciente
        paciente.mostrarInformacion();

        // Cerrar el scanner
        scanner.close();
    }
}