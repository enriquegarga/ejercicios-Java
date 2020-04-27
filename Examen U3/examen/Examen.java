package examen;
public class Examen {
    
    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora("LG", "HG26", 12000, 12.6, 6, true);
        Refrigerador refrigerador = new Refrigerador("Samsung", "2000X", 26000, 80, -2, false);
        Microondas microondas = new Microondas("Daewoo", "SAN23", 4800, 8, true, 200);
        
        lavadora.prender();
        lavadora.lavar();
        lavadora.centrifugar();
        
        refrigerador.prender();
        refrigerador.congelar();
        refrigerador.descomponerse();
        refrigerador.apagar();
        
        microondas.prender();
        microondas.hornear();
        microondas.descongelar();
        microondas.apagar();
    }
}
