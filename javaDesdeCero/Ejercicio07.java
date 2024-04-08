package javaDesdeCero;

import java.util.Scanner;

/*
 * Escribe un programa que lea dos números enteros por teclado, 
 * y realice las operaciones básicas de una calculadora con ellos: 
 * suma, resta, multiplicación, división y resto. Debe mostrar todos los resultados por consola.
 */

 public class Ejercicio07 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int numero1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int numero2 = sc.nextInt();

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;
        int resto = numero1 % numero2;

        System.out.println("La suma es " + suma);
        System.out.println("La resta es " + resta);
        System.out.println("La multiplicacion es " + multiplicacion);
        System.out.println("La division es " + division);
        System.out.println("La resto es " + resto);

        sc.close();
    }
}