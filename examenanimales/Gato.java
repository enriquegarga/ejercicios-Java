package examenanimales;

public class Gato extends Animal {
    public Gato(int numeroDePatas, int numeroDeDientes, String familia){
        super(numeroDePatas, numeroDeDientes, familia);
    }
    public void hacerRuido() {
        System.out.println("Miau");
    }
    
}
