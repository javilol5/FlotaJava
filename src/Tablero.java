// Clase que representa el tablero del juego
public class Tablero {

    // Tamaño del tablero
    private int tamano;

    // Matriz de casillas que forma el tablero
    private Casilla[][] casillero;

    // Constantes para representar resultados de ataques
    public static final int AWA = 0;
    public static final int TOCADO = 1;
    public static final int HUNDIDO = 2;

    // Constructor del tablero
    public Tablero() {

        // Se define el tamaño del tablero
        this.tamano = 10;

        // Se crea la matriz de casillas
        casillero = new Casilla[tamano][tamano];

        // Inicializar todas las casillas del tablero
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {

                // Cada posición recibe una nueva casilla vacía
                casillero[i][j] = new Casilla();
            }
        }

        // =========================
        // CREACIÓN DE NAVES
        // =========================

        // Portaaviones de tamaño 5
        Nave por1 = new Nave("Enterprise", "portaaviones", 5);

        // Fragatas de tamaño 3
        Nave fra1 = new Nave("Bismarck", "fragata", 3);
        Nave fra2 = new Nave("Prince of Wales", "fragata", 3);
        Nave fra3 = new Nave("Graf Spee", "fragata", 3);

        // Submarinos de tamaño 1
        Nave sub1 = new Nave("U-47", "submarino", 1);
        Nave sub2 = new Nave("U-96", "submarino", 1);
        Nave sub3 = new Nave("U-505", "submarino", 1);
        Nave sub4 = new Nave("U-534", "submarino", 1);

        // =========================
        // COLOCACIÓN DE NAVES
        // =========================

        // Colocación del portaaviones
        casillero[1][1].nave = por1;
        casillero[1][2].nave = por1;
        casillero[1][3].nave = por1;
        casillero[1][4].nave = por1;
        casillero[1][5].nave = por1;

        // Colocación de la primera fragata
        casillero[3][3].nave = fra1;
        casillero[4][3].nave = fra1;
        casillero[5][3].nave = fra1;

        // Colocación de la segunda fragata
        casillero[7][1].nave = fra2;
        casillero[7][2].nave = fra2;
        casillero[7][3].nave = fra2;

        // Colocación de la tercera fragata
        casillero[9][1].nave = fra3;
        casillero[9][2].nave = fra3;
        casillero[9][3].nave = fra3;

        // Colocación de submarinos
        casillero[4][6].nave = sub1;
        casillero[9][9].nave = sub2;
        casillero[7][6].nave = sub3;
        casillero[9][5].nave = sub4;
    }

    // Método que comprueba el impacto de un ataque
    public int comprobarImpacto(int x, int y) {

        // Mensaje de depuración
        System.out.println("[LOG] comprobando impacto (" + x + ", " + y + ")");

        // Obtiene la casilla atacada
        Casilla casilla = casillero[x][y];

        // Realiza el disparo sobre la casilla
        Integer resultado = casilla.disparar();

        // Si el resultado es null significa que ya fue atacada
        if (resultado == null) {

            // Se devuelve AWA por defecto
            return AWA;
        }

        // Devuelve el resultado del disparo
        return resultado;
    }
}