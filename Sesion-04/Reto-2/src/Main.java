public class Main {
    public static void main(String[] args) {
        // Crear una declaración de impuestos
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("ABCD123456XYZ", 15000.0);

        // Crear una cuenta fiscal
        CuentaFiscal cuenta = new CuentaFiscal("ABCD123456XYZ", 5000.0);

        // Mostrar la información de ambas
        System.out.println("Declaración de Impuestos:");
        System.out.println(declaracion);
        System.out.println();

        System.out.println("Cuenta Fiscal:");
        System.out.println("RFC: " + cuenta.getRfc());
        System.out.println("Saldo Disponible: $" + cuenta.getSaldoDisponible());
        System.out.println();

        // Validar si el RFC coincide
        boolean rfcValido = cuenta.validarRFC(declaracion);
        if (rfcValido) {
            System.out.println("El RFC coincide.");
        } else {
            System.out.println("El RFC no coincide.");
        }
    }
}
