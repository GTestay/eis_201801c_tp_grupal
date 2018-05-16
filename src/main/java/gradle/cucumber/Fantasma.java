package gradle.cucumber;

public class Fantasma {

    private boolean estaDebil = false;
    private boolean tieneCuerpo = true;

    public boolean estaDebil() {
        return estaDebil;
    }

    public boolean tieneCuerpo() {
        return tieneCuerpo;
    }

    public void debilitarse() { estaDebil = true; }

    public void perderCuerpo() { tieneCuerpo = false; }

    public void esComidoPor(Pacman pacman) {

        pacman.engordar(5);
    }

    public void esChocadoPor(Pacman pacman) {

        if (estaDebil) {

            pacman.comer(this);
            this.perderCuerpo();
        }
        else {

            pacman.morir();
        }
    }
}
