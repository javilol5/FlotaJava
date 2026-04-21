import java.util.HashSet;
import java.util.Set;

public class Juego {

    private Tablero tablero;
    private Set<String> atacado;

    public Juego() {
        tablero = new Tablero();
        atacado = new HashSet<>();
    }

    public void lanzarAtaque(int x, int y) {
        System.out.println("Atacando a " + x + ", " + y);

        String key = x + "," + y;

        if (!atacado.contains(key)) {
            int resultado = tablero.comprobarImpacto(x, y);
            mostrarResultado(resultado);
            atacado.add(key);
        } else {
            System.out.println("[LOG] Ya atacaste esta casilla");
        }
    }

    public void mostrarResultado(int resultado) {
        if (resultado == 0) {
            System.out.println("Awa");
        } else if (resultado == 1) {
            System.out.println("Tocado");
        } else if (resultado == 2) {
            System.out.println("Hundido");
        }
    }

    public static void main(String[] args) {
        Juego juego = new Juego();

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