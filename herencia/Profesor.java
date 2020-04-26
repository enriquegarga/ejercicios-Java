package herencia;

public class Profesor extends Persona {
    String asignatura;
    int numeroDeNomina;
    String horario;
    
    public void enseniar() {
        System.out.println("Enseñando");
    }
    
    public void calificar() {
        System.out.println("Calificando");
    }
    
    public void revisar() {
        System.out.println("Revisando");
    }
}
