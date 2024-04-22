package javaDesdeCero;

import java.util.Scanner;

/*
 *  Escribir un programa que cuente el número de vocales de una cadena de caracteres.
 */

public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca una cadena de caracteres");
        String str = scanner.nextLine();

        String minusculas = str.toLowerCase();

        int cantidadVocales = 0;

        for (int i = 0; i < minusculas.length(); i++) {
            char c = minusculas.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            cantidadVocales++;
            }
        }

        System.out.println("La cantidad de vocales es: " + cantidadVocales);

        scanner.close();
    }
}