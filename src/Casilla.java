// Clase que representa una casilla del tablero
public class Casilla {

    // Referencia a la nave colocada en esta casilla
    // Si es null significa que no hay nave
    public Nave nave;

    // Indica si la casilla ya fue atacada
    private boolean atacada = false;

    // Metodo que gestiona un disparo sobre la casilla
    public Integer disparar() {

        // Comprueba si la casilla ya había sido atacada
        if (atacada) {

            // Devuelve null para indicar que ya fue atacada
            return null;
        }

        // Marca la casilla como atacada
        atacada = true;

        // Si no hay nave en la casilla
        if (nave == null) {

            // Devuelve 0 indicando awa
            return 0;

        } else {

            // Si hay una nave, se le aplica el disparo
            // y se devuelve el resultado
            return nave.recibirDisparo();
        }
    }
}