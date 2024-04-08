package javaDesdeCero;

/*
 * Escribe un programa en Java que calcule cuál es el espacio recorrido por un objeto, 
 * como por ejemplo, una sonda espacial, que se mueve a velocidad constante. 
 * Podemos suponer que el objeto ha recorrido un espacio inicial de 150.000 km y se mueve a una velocidad 17 km por segundo.
 */

public class Ejercicio10 {
        public static void main(String[] args) {
            // Datos proporcionados
            double espacioInicial = 150000; // en kilómetros
            double velocidad = 17; // en kilómetros por segundo
            double tiempo = 60; // en segundos
    
            // Calcular el espacio recorrido
            double espacioRecorrido = espacioInicial + velocidad * tiempo;
    
            // Mostrar el espacio recorrido
            System.out.println("El espacio recorrido por el objeto es de " + espacioRecorrido + " kilómetros.");
        
    }
    
}