package examen;

public class Lavadora extends AparatoLineaBlanca {
    // Atributos de la clase
    private double capacidadLitros;
    private int ciclosLavado;
    private boolean enjuage;
    
    public Lavadora(String marca, String modelo, double precio, double capacidadLitros, int ciclosLavado, boolean enjuage) {
        super(marca, modelo, precio);
        this.capacidadLitros = capacidadLitros;
        this.ciclosLavado = ciclosLavado;
        this.enjuage = enjuage;
    }
    // Métodos de la clase
    @Override
    public void prender() {
        System.out.println("Prendiendo lavadora.");
    }
    @Override
    public void apagar() {
        System.out.println("Apagando lavadora.");
    }
    @Override
    public void descomponerse() {
        System.out.println("La lavadora se descompuso");
    }
    
    public void lavar() {
        System.out.println("Lavando.");
    }
    public void centrifugar() {
        System.out.println("Centrifugando");
    }
    public void enjuagar() {
        System.out.println("Enjuagando.");
    }

    public double getCapacidadLitros() {
        return capacidadLitros;
    }

    public void setCapacidadLitros(double capacidadLitros) {
        this.capacidadLitros = capacidadLitros;
    }

    public int getCiclosLavado() {
        return ciclosLavado;
    }

    public void setCiclosLavado(int ciclosLavado) {
        this.ciclosLavado = ciclosLavado;
    }

    public boolean isEnjuage() {
        return enjuage;
    }

    public void setEnjuage(boolean enjuage) {
        this.enjuage = enjuage;
    }
}
