package examenanimales;

public class Cerdo extends Animal {
    public Cerdo(int numeroDePatas, int numeroDeDientes, String familia){
        super(numeroDePatas, numeroDeDientes, familia);
    }
    public void hacerRuido() {
        System.out.println("Oinc");
    }
    
}
