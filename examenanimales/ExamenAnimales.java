package examenanimales;

public class ExamenAnimales {
    public static void main(String[] args) {
        Perro perro = new Perro(4, 42, "Cánidos");
        Gato gato = new Gato(4, 30, "Felidae");
        Cerdo cerdo = new Cerdo(4, 44, "Suidae");
        Tiburon tiburon = new Tiburon(0, 3000, "Esfírnidos");
        Jirafa jirafa = new Jirafa(4, 32, "Giraffidae");
        Animal ciempies = new Ciempies(30, 0, "Artrópodos");
        
        perro.comer();
        perro.hacerRuido();
        perro.caminar();
        System.out.println(perro.getNumeroDeDientes());
        System.out.println(perro.getNumeroDePatas());
        System.out.println(perro.getFamilia());
        System.out.println("--------------------------");
        
        gato.comer();
        gato.hacerRuido();
        gato.caminar();
        System.out.println(gato.getNumeroDeDientes());
        System.out.println(gato.getNumeroDePatas());
        System.out.println(gato.getFamilia());
        System.out.println("--------------------------");
        
        
        cerdo.comer();
        cerdo.hacerRuido();
        cerdo.caminar();
        System.out.println(cerdo.getNumeroDeDientes());
        System.out.println(cerdo.getNumeroDePatas());
        System.out.println(cerdo.getFamilia());
        System.out.println("--------------------------");
        
        
        tiburon.comer();
        tiburon.hacerRuido();
        tiburon.caminar();
        System.out.println(tiburon.getNumeroDeDientes());
        System.out.println(tiburon.getNumeroDePatas());
        System.out.println(tiburon.getFamilia());
        System.out.println("--------------------------");
        
        
        jirafa.comer();
        jirafa.hacerRuido();
        jirafa.caminar();
        System.out.println(jirafa.getNumeroDeDientes());
        System.out.println(jirafa.getNumeroDePatas());
        System.out.println(jirafa.getFamilia());
        System.out.println("--------------------------");
        
        
        ciempies.comer();
        ciempies.hacerRuido();
        ciempies.caminar();
        System.out.println(ciempies.getNumeroDeDientes());
        System.out.println(ciempies.getNumeroDePatas());
        System.out.println(ciempies.getFamilia());
        System.out.println("--------------------------");
    }
}