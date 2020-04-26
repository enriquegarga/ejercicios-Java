package herencia;
public class Persona {
    //Comparte
    int edad;
    //Comparte
    String nombre;
    
    String genero;
    
    String direccion;
    
    //Comparte
    float estatura;
    
    //Comparte
    public void correr(){
        System.out.println("Corriendo");
    }
    //Comparte
    public void caminar(){
        System.out.println("Caminando");
    }
    public void brincar(){
        System.out.println("Brincando ");
    }
}
