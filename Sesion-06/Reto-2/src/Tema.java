public class Tema implements Comparable<Tema> {
    private String titulo;
    private int prioridad;

    public Tema(String titulo, int prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPrioridad() {
        return prioridad;
    }

    @Override
    public int compareTo(Tema otroTema) {
        // Ordenar por título (alfabéticamente)
        return this.titulo.compareTo(otroTema.getTitulo());
    }

    @Override
    public String toString() {
        return "Tema: " + titulo + ", Prioridad: " + prioridad;
    }
}
