package javaDesdeCero;

import java.util.Scanner;

/*
 * Escribe un programa en Java que calcule la media de 3 números que se hayan leído desde el teclado y la muestre por consola.
 */

public class Ejercicio08 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = sc.nextInt();

        System.out.print("Ingrese el tercer número: ");
        double numero3 = sc.nextInt();

        double resultado = (numero1 + numero2 + numero3) / 3;

        System.out.println("La media de los tres números es: " + resultado);

        sc.close();
    }
}
