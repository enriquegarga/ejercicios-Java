package examen;

public class Microondas extends AparatoLineaBlanca {
    private int modosDeCalentamiento;
    private boolean tieneDescongelamiento;
    private double radiacion;
    
    
    public Microondas(String marca, String modelo, double precio, int modosDeCalentamiento, boolean tieneDescongelamiento, double radiacion) {
        super(marca, modelo, precio);
        this.modosDeCalentamiento = modosDeCalentamiento;
        this.tieneDescongelamiento = tieneDescongelamiento;
        this.radiacion = radiacion;
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
    
    public int getModosDeCalentamiento() {
        return modosDeCalentamiento;
    }
    
    public void calentar() {
        System.out.println("Calentando");
    }    
    public void descongelar() {
        System.out.println("Descongelando");
    }
    public void hornear() {
        System.out.println("Horneando");
    }
    
    public void setModosDeCalentamiento(int modosDeCalentamiento) {
        this.modosDeCalentamiento = modosDeCalentamiento;
    }

    public boolean isTieneDescongelamiento() {
        return tieneDescongelamiento;
    }

    public void setTieneDescongelamiento(boolean tieneDescongelamiento) {
        this.tieneDescongelamiento = tieneDescongelamiento;
    }

    public double getRadiacion() {
        return radiacion;
    }

    public void setRadiacion(double radiacion) {
        this.radiacion = radiacion;
    }
    
    
}
