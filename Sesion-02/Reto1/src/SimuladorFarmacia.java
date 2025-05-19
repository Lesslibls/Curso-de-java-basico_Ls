import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese el nombre del medicamento: ");
        String nombreMedicamento = scanner.nextLine();

        System.out.print("Ingrese el precio unitario: ");
        double precioUnitario = scanner.nextDouble();

        System.out.print("Ingrese la cantidad de piezas: ");
        int cantidadPiezas = scanner.nextInt();

        // Calcular el total sin descuento
        double totalSinDescuento = precioUnitario * cantidadPiezas;

        // Calcular el descuento usando el operador ternario
        double descuento = (totalSinDescuento > 500) ? (totalSinDescuento * 0.15) : 0.0;

        // Calcular el total a pagar
        double totalAPagar = totalSinDescuento - descuento;

        // Usar var para inferir el tipo de dato
        var aplicaDescuento = totalSinDescuento > 500;

        // Mostrar el resumen
        System.out.println("Medicamento: " + nombreMedicamento);
        System.out.println("Cantidad: " + cantidadPiezas);
        System.out.printf("Precio unitario: $%.2f%n", precioUnitario);
        System.out.printf("Total sin descuento: $%.2f%n", totalSinDescuento);
        System.out.println("¿Aplica descuento?: " + aplicaDescuento);
        System.out.printf("Descuento: $%.2f%n", descuento);
        System.out.printf("Total a pagar: $%.2f%n", totalAPagar);

        // Cerrar el scanner
        scanner.close();
    }
}
