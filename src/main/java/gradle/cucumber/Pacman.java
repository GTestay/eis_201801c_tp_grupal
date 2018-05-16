package gradle.cucumber;

public class Pacman {

    private int puntaje = 0;
    private boolean estaVivo = true;

    public void comer(Biscuit biscuit) {

        biscuit.esComidoPor(this);
    }

    public void comer(Fruta fruta) {

        fruta.esComidoPor(this);
    }

    public void comer(Pellet pellet) {

        pellet.esComidoPor(this);
    }

    public void comer(Fantasma fantasmaDebilitado) {

        fantasmaDebilitado.esComidoPor(this);
    }

    public int puntaje() {
        return puntaje;
    }

    public void engordar(int unPuntaje) { puntaje += unPuntaje; }

    public boolean estaVivo() { return estaVivo; }

    public int vida() { return 0; }

    public void morir() { estaVivo = false; }

    public void chocar(Fantasma fantasma) {

        fantasma.esChocadoPor(this); }
}
