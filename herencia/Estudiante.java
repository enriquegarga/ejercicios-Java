package herencia;

public class Estudiante extends Persona {
    String carrera;
    
    int semestre, numeroDeControl;
    
    public void programar(){
        System.out.println("Programando");
    }
       
    public void estudiar() {
        System.out.println("Estudiando");
    }
    
    @Override
    public void correr(){
        System.out.println("El estudiante está corriendo ");
    }
    public void brincar(){
        System.out.println("El estudiante está brincando ");
    }
}