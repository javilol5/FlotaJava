public class Tablero {

    private int tamano;
    private Casilla[][] casillero;

    public static final int AWA = 0;
    public static final int TOCADO = 1;
    public static final int HUNDIDO = 2;

    public Tablero() {
        this.tamano = 10;
        casillero = new Casilla[tamano][tamano];

        // inicializar casillas
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                casillero[i][j] = new Casilla();
            }
        }

        // crear naves
        Nave por1 = new Nave("Enterprise", "portaaviones", 5);

        Nave fra1 = new Nave("Bismarck", "fragata", 3);
        Nave fra2 = new Nave("Prince of Wales", "fragata", 3);
        Nave fra3 = new Nave("Graf Spee", "fragata", 3);

        Nave sub1 = new Nave("U-47", "submarino", 1);
        Nave sub2 = new Nave("U-96", "submarino", 1);
        Nave sub3 = new Nave("U-505", "submarino", 1);
        Nave sub4 = new Nave("U-534", "submarino", 1);

        // colocar barcos
        casillero[1][1].nave = por1;
        casillero[1][2].nave = por1;
        casillero[1][3].nave = por1;
        casillero[1][4].nave = por1;
        casillero[1][5].nave = por1;

        casillero[3][3].nave = fra1;
        casillero[4][3].nave = fra1;
        casillero[5][3].nave = fra1;

        casillero[7][1].nave = fra2;
        casillero[7][2].nave = fra2;
        casillero[7][3].nave = fra2;

        casillero[9][1].nave = fra3;
        casillero[9][2].nave = fra3;
        casillero[9][3].nave = fra3;

        casillero[4][6].nave = sub1;
        casillero[9][9].nave = sub2;
        casillero[7][6].nave = sub3;
        casillero[9][5].nave = sub4;
    }

    public int comprobarImpacto(int x, int y) {
        System.out.println("[LOG] comprobando impacto (" + x + ", " + y + ")");

        Casilla casilla = casillero[x][y];
        Integer resultado = casilla.disparar();

        if (resultado == null) {
            return AWA; // ya atacada
        }

        return resultado;
    }
}