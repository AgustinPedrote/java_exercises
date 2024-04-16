package javaDesdeCero;

import java.util.Scanner;

/*
 *  Escribe un programa en Java que permita calcular el n-ésimo término de la sucesión de Fibonacci. En dicha sucesión se da que:
- f(0) = 0;
- f(1) = 1;
- f(n) = f(n-1) + f(n-2), con n>=2.
 */

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de n para calcular el término de Fibonacci: ");
        int n = scanner.nextInt();

        int resultado = Fibonacci(n);
        System.out.println("El término " + n + " de la sucesión de Fibonacci es: " + resultado);

        scanner.close();
    }

    // Método para calcular el término n de la sucesión de Fibonacci
    public static int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
        
    }
}