// Interfaz para la transición de historia
interface TransicionHistoria {
    void transitar(String escenaActual, String nuevaEscena);
}

// Interfaz para el gestor de diálogos
interface GestorDialogo {
    void mostrarDialogo(String dialogo);
}

// Interfaz para la lógica de decisiones
interface LogicaDecision {
    String tomarDecision(String opcion1, String opcion2);
}

// Implementación de la transición de historia
class TransicionSimple implements TransicionHistoria {
    @Override
    public void transitar(String escenaActual, String nuevaEscena) {
        System.out.println("Transicionando de " + escenaActual + " a " + nuevaEscena + "...");
    }
}

// Implementación del gestor de diálogos
class DialogoTexto implements GestorDialogo {
    @Override
    public void mostrarDialogo(String dialogo) {
        System.out.println("Diálogo: " + dialogo);
    }
}

// Implementación de la lógica de decisiones
class DecisionBinaria implements LogicaDecision {
    @Override
    public String tomarDecision(String opcion1, String opcion2) {
        // Simulamos una decisión aleatoria
        return Math.random() < 0.5 ? opcion1 : opcion2;
    }
}

// Clase principal que simula el flujo de una escena narrativa
public class MainNarrativa {
    private final TransicionHistoria transicionHistoria;
    private final GestorDialogo gestorDialogo;
    private final LogicaDecision logicaDecision;

    public MainNarrativa(TransicionHistoria transicionHistoria, GestorDialogo gestorDialogo, LogicaDecision logicaDecision) {
        this.transicionHistoria = transicionHistoria;
        this.gestorDialogo = gestorDialogo;
        this.logicaDecision = logicaDecision;
    }

    public void iniciarEscena() {
        String escenaActual = "Inicio";
        String nuevaEscena = "Desarrollo";

        // Mostrar diálogo inicial
        gestorDialogo.mostrarDialogo("¡Bienvenido al juego!");

        // Tomar una decisión
        String decision = logicaDecision.tomarDecision("Explorar el bosque", "Entrar en la cueva");
        gestorDialogo.mostrarDialogo("Decisión tomada: " + decision);

        // Transitar a la nueva escena
        transicionHistoria.transitar(escenaActual, nuevaEscena);
    }

    public static void main(String[] args) {
        // Inyección de dependencias
        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();

        MainNarrativa narrativa = new MainNarrativa(transicion, dialogo, decision);
        narrativa.iniciarEscena();
    }
}
