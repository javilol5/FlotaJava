// Clase que representa una nave del juego
public class Nave {

    // Nombre de la nave
    private String nombre;

    // Tipo de nave (portaaviones, fragata, submarino...)
    private String tipo;

    // Vida restante de la nave
    private int vida;

    // Constructor de la clase Nave
    public Nave(String nombre, String tipo, int vida) {

        // Inicializa el nombre de la nave
        this.nombre = nombre;

        // Inicializa el tipo de nave
        this.tipo = tipo;

        // Inicializa la cantidad de vida
        this.vida = vida;
    }

    // Metodo que gestiona un disparo recibido por la nave
    public int recibirDisparo() {

        // Reduce la vida de la nave en 1
        vida--;

        // Si todavía tiene vida, la nave está tocada
        if (vida > 0) {

            return 1; // TOCADO

        } else {

            // Si la vida llega a 0, la nave queda hundida
            return 2; // HUNDIDO
        }
    }

    // Metodo que devuelve la información de la nave en formato texto
    @Override
    public String toString() {

        // Devuelve nombre, tipo y vida actual
        return nombre + " " + tipo + " " + vida;
    }
}