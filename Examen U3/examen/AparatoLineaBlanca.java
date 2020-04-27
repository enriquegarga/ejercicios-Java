package examen;

public abstract class AparatoLineaBlanca {
    // Atributos de la clase padre
    private String marca;
    private String modelo;
    private double precio;
    
    public AparatoLineaBlanca(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
            
    // Métodos de la clase padre   
    public abstract void prender();
    public abstract void apagar();
    public abstract void descomponerse();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
