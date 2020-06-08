package ordenamiento;
import java.util.Scanner;
public class Ordenamiento {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dimension;
        int[] arreglo;
        
        System.out.print("Ingrese cuántos números desea ordenar: ");
        dimension = entrada.nextInt();
        arreglo = new int[dimension];
        
        for(int i = 0; i < dimension; i++) {
            System.out.print("Ingrese el número de la posición " + (i+1)+ ": ");
            arreglo[i] = entrada.nextInt();
            System.out.println("");
        }
        
        System.out.println("\nEl arreglo sin ordenar es el siguiente:");
        for(int i = 0; i < dimension; i++) {
            System.out.print(arreglo[i]);
        }
        arreglo = ordenar(arreglo);
        
        System.out.println("\nEl arreglo ordenado de mayor a menor es el siguiente:");
        for(int i = dimension - 1; i >= 0; i--) {
            System.out.print(arreglo[i] + " ");
        }
        
    }
    
    public static int[] ordenar(int[] a) {
        int menor; for(int i = 0; i < a.length; i++){ 
            menor = a[0]; if (a[i] < menor){ 
                menor = a[i]; 
            } else{ 
                if (a[i] > menor){ 
                    menor = menor; 
                } 
            } 
        } 
        return a;
    }
    
    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
        return array;
    }
    
}
