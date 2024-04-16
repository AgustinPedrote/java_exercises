package javaDesdeCero;

import java.util.Scanner;

/*
 * Escribe un programa en Java que pinte una pirámide con asteriscos. 
 * El número de pisos debe introducido a través del teclado.
 */

public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de pisos para la pirámide: ");
        int numPisos = scanner.nextInt();

        for (int i = 1; i <= numPisos; i++) {
            // Espacios en blanco
            for (int j = 1; j <= numPisos - i; j++) {
                System.out.print(" ");
            }

            // Asteriscos
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Nueva línea despues de cada fila
            System.out.println();
        }

        scanner.close();
    }

}