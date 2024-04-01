package javaDesdeCero;

import java.util.Scanner;

/*
 * Escribir un programa que calcule el perímetro y el área de un círculo y la muestre por consola. 
 * El `radio` del mismo lo puedes proporcionar como un valor inicial de la variable correspondiente.
 */

public class Ejercicio04 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Introduce el radio del círculo: ");
        double radio = sc.nextDouble();

        double area = Math.PI * (radio * radio);
        double perimetro = 2 * Math.PI * radio;

        System.out.println("El área del círculo es: " + area);
        System.out.println("El perímetro del círculo es: " + perimetro);

        sc.close();
    }
}
