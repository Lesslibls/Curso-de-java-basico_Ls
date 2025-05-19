import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        // Definir saldo inicial
        var saldo = 1000.0;
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar menú
            System.out.println("Bienvenido al cajero automático");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            // Manejar opciones con switch
            switch (opcion) {
                case 1:
                    // Consultar saldo
                    System.out.printf("Su saldo actual es: $%.2f%n", saldo);
                    break;

                case 2:
                    // Depositar dinero
                    System.out.print("Ingrese el monto a depositar: ");
                    double montoDeposito = scanner.nextDouble();
                    if (montoDeposito > 0) {
                        saldo += montoDeposito;
                        System.out.printf("Se han depositado $%.2f. Su nuevo saldo es: $%.2f%n", montoDeposito, saldo);
                    } else {
                        System.out.println("El monto a depositar debe ser mayor que cero.");
                    }
                    break;

                case 3:
                    // Retirar dinero
                    System.out.print("Ingrese el monto a retirar: ");
                    double montoRetiro = scanner.nextDouble();
                    if (montoRetiro > 0) {
                        if (montoRetiro <= saldo) {
                            saldo -= montoRetiro;
                            System.out.printf("Se han retirado $%.2f. Su nuevo saldo es: $%.2f%n", montoRetiro, saldo);
                        } else {
                            System.out.println("No hay suficiente saldo para realizar esta operación.");
                        }
                    } else {
                        System.out.println("El monto a retirar debe ser mayor que cero.");
                    }
                    break;

                case 4:
                    // Salir
                    System.out.println("Gracias por usar el cajero automático. ¡Hasta luego!");
                    break;

                default:
                    // Opción inválida
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    continue; // Volver al inicio del bucle
            }
        } while (opcion != 4); // Repetir hasta que el usuario elija salir

        // Cerrar el scanner
        scanner.close();
    }
}
