package javaDesdeCero;

import java.util.Scanner;

/*
 * Escribir un programa que, dada una cantidad de euros, nos indique cuál es su valor en dólares americanos. 
 * Además de la variable para la cantidad de euros, se debe declarar otra para el cambio 
 * (el valor de un dólar en euros) y para el resultado final. Muestra el resultado por consola..
 */

public class Ejercicio05 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Introduce la cantidad de euros: ");
        double euro = sc.nextDouble();

        System.out.print("Introduce el valor de un dólar en euros: ");
        double euroDolar = sc.nextDouble();

        double dolar = euro / euroDolar;

        System.out.println(euro + " euros son " + dolar + " dólares.");
        
        sc.close();
    }
}
