public abstract class UnidadEmergencia {
    protected String nombre; // Nombre de la unidad

    public UnidadEmergencia(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto que debe ser implementado por las subclases
    public abstract void responder();

    // Método concreto para activar la unidad
    public void activarUnidad() {
        System.out.println(nombre + " activada.");
    }
}

