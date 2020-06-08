package examenanimales;

public class Perro extends Animal {
    public Perro(int numeroDePatas, int numeroDeDientes, String familia){
        super(numeroDePatas, numeroDeDientes, familia);
    }
    public void hacerRuido() {
        System.out.println("Guau");
    }
}
