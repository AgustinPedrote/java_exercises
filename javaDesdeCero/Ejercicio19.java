package javaDesdeCero;

import java.util.Scanner;

/*
 *  Implementa un programa en Java que determine si un número introducido por teclado es primo o no. Recuerda que:
- Un número es primo cuando sus únicos divisores son 1 y él mismo.
- Para un número primo `p`, hay que buscar divisores que sean menores o iguales que `p/2`.
 */

public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número para determinar si es primo: ");
        int numero = scanner.nextInt();

        boolean esPrimo = esPrimo(numero);

        // Mostrar el resultado
        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }

        scanner.close();
    }

    public static boolean esPrimo(int numero) {
        // Si el número es menor o igual a 1, no es primo
        if (numero <= 1) {
            return false;
        }

        // Verificar divisibilidad desde 2 hasta numero/2
        for (int i = 2; i <= numero / 2; i++) {
            // Si el número es divisible por algún número entre 2 y número/2, no es primo
            if (numero % i == 0) {
                return false;
            }
        }

        // Si no se encontraron divisores entre 2 y número/2, el número es primo
        return true;
    }
}