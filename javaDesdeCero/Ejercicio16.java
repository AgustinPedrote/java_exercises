package javaDesdeCero;

import java.util.Scanner;

/*
 * Escribe un programa que acepte por teclado una cadena y muestre la cadena inversa.
 */

public class Ejercicio16 {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Introduce una cadena: ");
        String cadena = sc.nextLine();

        String cadenaInvertitda = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertitda += cadena.charAt(i);
        }

        System.out.println("Cadena invertida: " + cadenaInvertitda);

        sc.close();
    }

}