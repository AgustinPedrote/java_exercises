package javaDesdeCero;

import java.util.Scanner;

/*
 * Escribe un programa en Java que acepte por teclado un número entero
 *  entre 1 y 10 y muestre su tabla de multiplicar.
 */

public class Ejercicio15 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int num;

        do {
            System.out.print("Introduce un número entre el 1 y el 10: ");
            num = scanner.nextInt();
        } while (num < 1 || num > 10);

        System.out.println("Tabla de multiplicar del " + num + ":");
        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        scanner.close();
    }
}