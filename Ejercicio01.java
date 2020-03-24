package fecha;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Fecha {
    static Scanner entrada = new Scanner(System.in);
    static String anio, mes, dia;
    static long anios, meses, dias;
    
    public static void main(String[] args) {
        // Fecha de hoy
        LocalDate fechaActual = LocalDate.now();
        
        // Pedir el año de nacimiento
        System.out.print("Ingresa tu año de nacimiento: ");
        anio = entrada.nextLine();
        
        // Pedir el mes de nacimiento
        System.out.print("Ingresa tu mes de nacimiento: ");
        mes = entrada.nextLine();
        
        // Pedir el día de nacimiento
        System.out.print("Ingresa tu día de nacimiento: ");
        dia = entrada.nextLine();
        
        // Cambiar de cadena a tipo fecha
        LocalDate fechaDeNacimiento = LocalDate.parse(anio + "-" + mes + "-" + dia);
        
        long dias = ChronoUnit.DAYS.between(fechaDeNacimiento, fechaActual);
        
        // Obtenemos el total de años
        anios = dias / 365;
        
        // Le asignamos el residuo
        dias = dias % 365;
        
        // Obtenemos el total de meses
        meses = dias / 30;
         
        // Le asignamos el residuo
        dias = dias % 30;
        
        // Impresión final 
        System.out.println("Tu edad es de " + anios + " años, " + meses + " meses y " + dias + " días");      
    }  
}