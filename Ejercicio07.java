package cuatronumerosfunciones;
import java.util.Scanner;

public class CuatroNumerosFunciones {
    public static Scanner entrada;
    public static int A, B, C, D;
    
    public static void main(String[] args) {
        pedirNumeros();
        imprimir();
    }
    
    public static void pedirNumeros() {
        entrada = new Scanner(System.in);
        
        System.out.println("Ingresa el primer número");
        A = entrada.nextInt();
        
        System.out.println("Ingresa el segundo número");
        B = entrada.nextInt();
        
        System.out.println("Ingresa el tercer número");
        C = entrada.nextInt();
        
        System.out.println("Ingresa el cuarto número");
        D = entrada.nextInt();
    }
    
    public static void imprimir() {
        System.out.println("El mayor es " + mayor(A, B, C, D));
        
        System.out.println("El menor es " + menor(A, B, C, D));
        
        System.out.println("El medio mayor es " + medioMayor(A, B, C, D));
        
        System.out.println("El medio menor es " + medioMenor(A, B, C, D));
    }
    
    public static int mayor(int A, int B, int C, int D) {
        if(A > B && A > C && A > D) {
            return A;
        }
        if(B > A && B > C && B > D) {
            return B;
        }
        if(C > A && C > B && C > D) {
            return C;
        }
        return D;
    }
    
    public static int menor(int A, int B, int C, int D) {
        if(A < B && A < C && A < D) {
            return A;
        }
        if(B < A && B < C && B < D) {
            return B;
        }
        if(C < A && C < B && C < D) {
            return C;
        }
        return D;
    }
    
    public static int medioMayor(int A, int B, int C, int D) {
        // A es el mayor
        if(A == mayor(A, B, C, D)) {
            // B es el menor
            if(B == menor(A, B, C,D)) {
                if(C > D) {
                    return C;
                } else {
                    return D;
                }
            }
            // C es el menor
            if(C == menor(A, B, C,D)) {
                if(B > D) {
                    return B;
                } else {
                    return D;
                }
            }
            // D es el menor
            if(D == menor(A, B, C,D)) {
                if(B > C) {
                    return B;
                } else {
                    return C;
                }
            }
        }
        
        // B es el mayor
        if(B == mayor(A, B, C, D)) {
            // A es el menor
            if(A == menor(A, B, C,D)) {
                if(C > D) {
                    return C;
                } else {
                    return D;
                }
            }
            // C es el menor
            if(C == menor(A, B, C,D)) {
                if(A > D) {
                    return A;
                } else {
                    return D;
                }
            }
            // D es el menor
            if(D == menor(A, B, C,D)) {
                if(A > C) {
                    return B;
                } else {
                    return C;
                }
            }
        }    
        
        // C es el mayor
        if(C == mayor(A, B, C, D)) {
            // A es el menor
            if(A == menor(A, B, C,D)) {
                if(B > D) {
                    return B;
                } else {
                    return D;
                }
            }
            // C es el menor
            if(D == menor(A, B, C,D)) {
                if(A > B) {
                    return A;
                } else {
                    return B;
                }
            }
            // D es el menor
            if(D == menor(A, B, C,D)) {
                if(A > C) {
                    return A;
                } else {
                    return C;
                }
            }
        }
         
        
        // D es el mayor
        if(D == mayor(A, B, C, D)) {
            // A es el menor
            if(A == menor(A, B, C,D)) {
                if(B > C) {
                    return B;
                } else {
                    return C;
                }
            }
            // B es el menor
            if(B == menor(A, B, C,D)) {
                if(A > C) {
                    return A;
                } else {
                    return C;
                }
            }
            // C es el menor
            if(C == menor(A, B, C,D)) {
                if(A > B) {
                    return A;
                } else {
                    return B;
                }
            }
        }
        return A;
    }
    
    public static int medioMenor(int A, int B, int C, int D) {
        // A es el mayor
        if(A == mayor(A, B, C, D)) {
            // B es el menor
            if(B == menor(A, B, C,D)) {
                if(C < D) {
                    return C;
                } else {
                    return D;
                }
            }
            // C es el menor
            if(C == menor(A, B, C,D)) {
                if(B < D) {
                    return B;
                } else {
                    return D;
                }
            }
            // D es el menor
            if(D == menor(A, B, C,D)) {
                if(B < C) {
                    return B;
                } else {
                    return C;
                }
            }
        }
        
        // B es el mayor
        if(B == mayor(A, B, C, D)) {
            // A es el menor
            if(A == menor(A, B, C,D)) {
                if(C < D) {
                    return C;
                } else {
                    return D;
                }
            }
            // C es el menor
            if(C == menor(A, B, C,D)) {
                if(A < D) {
                    return A;
                } else {
                    return D;
                }
            }
            // D es el menor
            if(D == menor(A, B, C,D)) {
                if(A < C) {
                    return B;
                } else {
                    return C;
                }
            }
        }    
        
        // C es el mayor
        if(C == mayor(A, B, C, D)) {
            // A es el menor
            if(A == menor(A, B, C,D)) {
                if(B < D) {
                    return B;
                } else {
                    return D;
                }
            }
            // C es el menor
            if(D == menor(A, B, C,D)) {
                if(A < B) {
                    return A;
                } else {
                    return B;
                }
            }
            // D es el menor
            if(D == menor(A, B, C,D)) {
                if(A < C) {
                    return A;
                } else {
                    return C;
                }
            }
        }
         
        
        // D es el mayor
        if(D == mayor(A, B, C, D)) {
            // A es el menor
            if(A == menor(A, B, C,D)) {
                if(B < C) {
                    return B;
                } else {
                    return C;
                }
            }
            // B es el menor
            if(B == menor(A, B, C,D)) {
                if(A < C) {
                    return A;
                } else {
                    return C;
                }
            }
            // C es el menor
            if(C == menor(A, B, C,D)) {
                if(A < B) {
                    return A;
                } else {
                    return B;
                }
            }
        }
        return A;
    }
}