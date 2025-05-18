public class Paciente {
    //atributos
    private String nombre;
    private int edad;
    private String numeroExpediente;

    //Metodo para mostrar informacion del pasiente
    public void mostrarInformacion(){
        System.out.println("Paciente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Expediente: " + numeroExpediente);
    }

    //Metodo para asignar valores
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) { // Asegúrate de que este método esté presente
        this.edad = edad;
    }
    public void  setNumeroExpediente(String numeroExpediente){
        this.numeroExpediente = numeroExpediente;
    }
}
