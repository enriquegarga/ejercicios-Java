package examenanimales;
public class Animal {
    private int numeroDePatas;
    private int numeroDeDientes;
    private String familia;
    
    public Animal(int numeroDePatas, int numeroDeDientes, String familia){
        this.numeroDeDientes = numeroDeDientes;
        this.numeroDePatas = numeroDePatas;
        this.familia = familia;
    }
    
    public void comer() {
        System.out.println("Comiendo");
    }
    
    public void caminar(){
        System.out.println("Caminando");
    }
    
    public void hacerRuido() {
        System.out.println("Haciendo ruido");
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public int getNumeroDeDientes() {
        return numeroDeDientes;
    }

    public void setNumeroDeDientes(int numeroDeDientes) {
        this.numeroDeDientes = numeroDeDientes;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }
    
}
