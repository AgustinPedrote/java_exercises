package javaDesdeCero;

import java.util.Scanner;

/*
 * Escribe un programa en Java que muestre la nota literal de un estudiante en función
 *  de su nota numérica usando `switch` como expresión, no como sentencia.
 */

public class Ejercicio14 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Introduce la nota númerica del estudiante: ");
        int nota = scanner.nextInt();

        String nota2 = "";

        nota2 = switch (nota) {
            case 1 -> "Suspenso";
            case 2 -> "Suspenso";
            case 3 -> "Suspenso";
            case 4 -> "Suspenso";
            case 5 -> "Suficiente";
            case 6 -> "Bien";
            case 7 -> "Notable";
            case 8 -> "Notable alto";
            case 9 -> "Sobresaliente";
            case 10 -> "Matricula de honor";
            default -> "Error: El número introducido no es válido";
        };

        System.out.println("La nota literal del estudiante es: " + nota2);
        scanner.close();
    }
}