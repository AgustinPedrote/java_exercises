package javaDesdeCero;

/*
 * Escribe un programa en Java que intercambie el valor de dos variables.
 */

public class Ejercicio09 {
    public static void main(String[] args) {
        int variable1 = 5;
        int variable2 = 10;

        System.out.println("Antes del intercambio:");
        System.out.println("La variable 1 es " + variable1);
        System.out.println("La variable 2 es " + variable2);

        int intercambio = variable1;
        variable1 = variable2;
        variable2 = intercambio;

        System.out.println("Después del intercambio:");
        System.out.println("La variable 1 es " + variable1);
        System.out.println("La variable 2 es " + variable2);
    }
}