public class Nave {
    private String nombre;
    private String tipo;
    private int vida;

    public Nave(String nombre, String tipo, int vida) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = vida;
    }

    public int recibirDisparo() {
        vida--;

        if (vida > 0) {
            return 1; // TOCADO
        } else {
            return 2; // HUNDIDO
        }
    }

    @Override
    public String toString() {
        return nombre + " " + tipo + " " + vida;
    }
}