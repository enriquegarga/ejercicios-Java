package herencia;

public abstract class Main {
    
    public static void main(String[] args) {
        //Polimorfismo
        /*Estudiante estudiante = new Estudiante();
        estudiante.correr();
        estudiante.brincar();*/
        
        Profesor profesor = new Profesor();
        profesor.brincar();
    }
}
