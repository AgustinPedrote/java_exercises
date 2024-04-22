package javaDesdeCero;

import java.util.Scanner;

/*
 *  Escribir un programa en Java que detecte el primer carácter repetido de una cadena de caracteres.
 */

public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca la cadena a verificar");
        String str = scanner.nextLine();
        boolean repetido = false;
        char caracterRepetido = ' ';
        int i = 0;

        while (i < str.length() && !repetido) {
            char c = str.charAt(i);
            int j = i + 1;
            while (j < str.length() && !repetido) {
                if (c == str.charAt(j)) {
                    repetido = true;
                    caracterRepetido = c;
                } else {
                    j++;
                }
            }
            i++;
        }

        if (repetido)
            System.out.println("El primer carácter repetido es " + caracterRepetido);
        else
            System.out.println("No hay ningún carácter repetido");

        scanner.close();
    }
}