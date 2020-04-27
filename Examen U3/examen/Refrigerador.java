package examen;

public class Refrigerador extends AparatoLineaBlanca {
    // Atributos de la clase
    private double capacidad;
    private double temperaturaMinima;
    private boolean cajonParaVegetales;
    
    public Refrigerador(String marca, String modelo, double precio, double capacidad, double temperaturaMinima, boolean cajonParaVegetales) {
        super(marca, modelo, precio);
        this.capacidad = capacidad;
        this.temperaturaMinima = temperaturaMinima;
        this.cajonParaVegetales = cajonParaVegetales;
    }
    
    // Métodos de la clase
    @Override
    public void prender() {
        System.out.println("Prendiendo refrigerador.");
    }
    @Override
    public void apagar() {
        System.out.println("Apagando refrigerador.");
    }
    @Override
    public void descomponerse() {
        System.out.println("El refigerador se descompuso");
    }
    public void enfriar() {
        System.out.println("Enfriando.");
    }
    public void congelar() {
        System.out.println("Congelar");
    }
    public void servirHielos() {
        System.out.println("Sirviendo hielos");
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(double temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    public boolean isCajonParaVegetales() {
        return cajonParaVegetales;
    }

    public void setCajonParaVegetales(boolean cajonParaVegetales) {
        this.cajonParaVegetales = cajonParaVegetales;
    }
    
    
}
