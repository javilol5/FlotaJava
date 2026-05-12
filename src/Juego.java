import java.util.HashSet;
import java.util.Set;
// Clase principal que controla el juego
public class Juego {

    // Tablero donde están colocados los barcos
    private Tablero tablero;

    // Conjunto que guarda las posiciones ya atacadas
    private Set<String> atacado;

    // Constructor de la clase Juego
    public Juego() {

        // Se crea un nuevo tablero
        tablero = new Tablero();
        // Se inicializa el conjunto de casillas atacadas
        atacado = new HashSet<>();
    }

    // Metodo para lanzar un ataque a una posición concreta
    public void lanzarAtaque(int x, int y) {

        // Muestra por pantalla la posición atacada
        System.out.println("Atacando a " + x + ", " + y);

        // Se crea una clave única para la posición
        String key = x + "," + y;

        // Comprueba si esa posición ya fue atacada
        if (!atacado.contains(key)) {

            // Comprueba el resultado del ataque en el tablero
            int resultado = tablero.comprobarImpacto(x, y);

            // Muestra el resultado del ataque
            mostrarResultado(resultado);

            // Guarda la posición como ya atacada
            atacado.add(key);

        } else {

            // Mensaje si la casilla ya había sido atacada
            System.out.println("[LOG] Ya atacaste esta casilla");
        }
    }

    // Metodo que muestra el resultado del ataque
    public void mostrarResultado(int resultado) {

        // Si el resultado es 0 significa agua
        if (resultado == 0) {

            System.out.println("Awa");

            // Si el resultado es 1 significa tocado
        } else if (resultado == 1) {

            System.out.println("Tocado");

            // Si el resultado es 2 significa hundido
        } else if (resultado == 2) {

            System.out.println("Hundido");
        }
    }

    // Metodo principal del programa
    public static void main(String[] args) {

        // Se crea una nueva partida
        Juego juego = new Juego();

        // Diferentes ataques de prueba
        juego.lanzarAtaque(2, 3);
        System.out.println();

        juego.lanzarAtaque(2, 3);
        System.out.println();

        juego.lanzarAtaque(1, 1);
        System.out.println();

        juego.lanzarAtaque(1, 2);
        System.out.println();

        juego.lanzarAtaque(1, 3);
        System.out.println();

        juego.lanzarAtaque(1, 4);
        System.out.println();

        juego.lanzarAtaque(1, 4);
        System.out.println();

        juego.lanzarAtaque(1, 5);
        System.out.println();

        juego.lanzarAtaque(0, 4);
        System.out.println();

        juego.lanzarAtaque(7, 6);
    }
}