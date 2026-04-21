public class Casilla {
    public Nave nave;
    private boolean atacada = false;

    public Integer disparar() {
        if (atacada) {
            return null; // ya atacada
        }

        atacada = true;

        if (nave == null) {
            return 0; // AWA
        } else {
            return nave.recibirDisparo();
        }
    }
}