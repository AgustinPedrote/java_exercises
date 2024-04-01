package javaDesdeCero;

import java.util.Scanner;

/*
 * Escribir un programa que calcule el área y el perímetro de un rectángulo y la muestre por consola. 
 * La `altura` y la `anchura` del mismo la puedes proporcionar como valores iniciales 
 * de las variables correspondientes.
 */

public class Ejercicio03 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Introduce la altura del rectángulo: ");
        double altura = sc.nextDouble();

        System.out.print("Introduce la anchura del rectángulo: ");
        double anchura = sc.nextDouble();

        double area = altura * anchura;
        double perimetro = 2 * (altura + anchura);

        System.out.println("El área del rectángulo es: " + area);
        System.out.println("El perímetro del rectángulo es: " + perimetro);

        sc.close();
    }
}
