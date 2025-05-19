public class Main {
    public static void main(String[] args) {
        // Crear dos facturas con el mismo folio pero diferentes clientes y totales
        Factura factura1 = new Factura("F001", "Cliente A", 1500.0);
        Factura factura2 = new Factura("F001", "Cliente B", 2000.0);

        // Mostrar ambas facturas usando toString()
        System.out.println(factura1);
        System.out.println(factura2);

        // Comparar si son iguales usando equals()
        if (factura1.equals(factura2)) {
            System.out.println("Las facturas son iguales.");
        } else {
            System.out.println("Las facturas son diferentes.");
        }
    }
}
