package gradle.cucumber;

public class Pacman {

    private int puntaje = 0;
    private boolean estaVivo = true;

    public void comer(Comestible unComestible) {
        unComestible.esComidoPor(this);
    }

    public int puntaje() {
        return puntaje;
    }

    public void engordar(int unPuntaje) {
        puntaje += unPuntaje;
    }

    public boolean estaVivo() {
        return estaVivo;
    }

    public int vida() {
        return 0;
    }

    public void morir() {
        estaVivo = false;
    }

    public void chocar(Fantasma fantasma) {

        fantasma.esChocadoPor(this);
    }
}
