package orientadoObjetos.juego;

import java.util.Arrays;

/*
Para implementar un juego, necesitamos una clase Personaje, que tendrá los siguientes atributos: nombre, puntos de vida (un entero entre 0 y 100), 
puntos conseguidos (un valor entero mayor que 0) y una mochila, que será un array de String con los nombres de algunos elementos que se puede encontrar por el juego (pociones, herramientas, ...). 
Este array puede tener, como mucho, 10 elementos. Para manejar el array, también sería bueno tener una variable entera que nos indicara el número de pociones o herramientas que tenemos dentro del array.
Implementa un constructor sin argumentos, y otro que reciba como argumento el nombre. Ten en cuenta que cuando se instancia un Personaje siempre tendrá 100 puntos de vida disponibles, así como 0 puntos conseguidos.

Incluye los métodos equals, hashCode y toString. También los métodos getters, setters, salvo para los atributos de la mochila y su número de elementos, que solamente tendrán método getter.

Añade además los siguientes métodos:

Uno que sirva para agregar una poción o herramienta al array. Si el array está completo, simplemente no la añadirá, pero mostrará un mensaje por consola, del tipo: 
"YA NO PUEDES CONSEGUIR MÁS ELEMENTOS PUES TU MOCHILA ESTÁ COMPLETA". Si todo va bien, devolverá el número de elementos que hay en la mochila.
Otro método, que se llamará recibirGolpe que recibe un valor entero como argumento, con el número de puntos de vida que se deben restar al personaje. 
Debe devolver el número de puntos de vida que restan al personaje. Ten en cuenta que el valor resultante nunca debe ser menor que 0.
Otro que sirva para buscar en el array la poción de tipo "BOTIQUIN" y usarla, y así incrementar en 10 unidades los puntos de vida. 
Ten en cuenta que los puntos de vida no pueden superar nunca el número 100. Debe devolver el número de puntos de vida resultante. Si no tiene ninguna poción de tipo "BOTIQUIN", debe mostrar un mensaje como este por consola: "LO SIENTO, PERO NO TIENES NINGUNA POCIÓN DE BOTIQUÍN".
 */

public class Personaje {

    private String nombre;
    private int puntosVida;
    private long puntos;
    private String[] mochila;
    private int elementosEnMochila;

    public Personaje() {
        this.puntos = 0;
        this.puntosVida = 100;
        this.mochila = new String[10];
        this.elementosEnMochila = 0;
    }

    public Personaje(String nombre) {
        this();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public long getPuntos() {
        return puntos;
    }

    public void setPuntos(long puntos) {
        this.puntos = puntos;
    }

    public String[] getMochila() {
        return mochila;
    }

    public int getElementosEnMochila() {
        return elementosEnMochila;
    }

    public int addElementoToMochila(String elemento) {
        if (elementosEnMochila == 10) {
            System.out.println("YA NO PUEDES CONSEGUIR MAS ELEMENTOS PUES TU MOCHILA ESCA COMPLETA");
        } else {
            mochila[elementosEnMochila] = elemento;
        }

        return ++elementosEnMochila;
    }

    public int recibirGolpe(int puntosGolpe) {
        this.puntosVida -= puntosGolpe;
        if (this.puntosVida < 0) {
            this.puntosVida = 0;
        }

        return this.puntosVida;
    }

    public int usarBotiquin() {
        boolean tieneBotiquin = false;
        if (elementosEnMochila > 0) {
            for(int i = 0; i < elementosEnMochila && !tieneBotiquin; i++) {
                if (mochila[i] == "BOTIQUIN") {
                    tieneBotiquin = true;
                    this.puntosVida += 10;
                    if (this.puntosVida > 100){
                        this.puntosVida = 100;
                    }

                mochila[i] = null;
                for(int x = i+1; x < elementosEnMochila; x++) {
                    mochila[x-1] = mochila[x];
                }
                elementosEnMochila--;
                mochila[elementosEnMochila] = null;
                }
            }
        }
        return this.puntosVida;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + puntosVida;
        result = prime * result + (int) (puntos ^ (puntos >>> 32));
        result = prime * result + Arrays.hashCode(mochila);
        result = prime * result + elementosEnMochila;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Personaje other = (Personaje) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (puntosVida != other.puntosVida)
            return false;
        if (puntos != other.puntos)
            return false;
        if (!Arrays.equals(mochila, other.mochila))
            return false;
        if (elementosEnMochila != other.elementosEnMochila)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Personaje [nombre=" + nombre + ", puntosVida=" + puntosVida + ", puntos=" + puntos + ", mochila="
                + Arrays.toString(mochila) + ", elementosEnMochila=" + elementosEnMochila + "]";
    }

}
