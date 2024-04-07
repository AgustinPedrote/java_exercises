package javaDesdeCero;

import java.util.Scanner;

/*
 * Escribe un programa que determine si un número es par o impar usando el operador ternario.
 */

public class Ejercicio06 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        double numero = sc.nextInt();

        String resultado = (numero % 2 == 0) ? "par" : "impar";

        System.out.println("El número " + numero + " es " + resultado);

        sc.close();
    }
}