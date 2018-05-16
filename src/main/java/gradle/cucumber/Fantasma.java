package gradle.cucumber;

public class Fantasma implements Comestible {

    private boolean estaDebil = false;
    private boolean tieneCuerpo = true;

    public boolean estaDebil() {
        return estaDebil;
    }

    public boolean tieneCuerpo() {
        return tieneCuerpo;
    }

    public void debilitarse() {
        estaDebil = true;
    }

    public void perderCuerpo() {
        tieneCuerpo = false;
    }

    @Override
    public void esComidoPor(Pacman pacman) {

        pacman.engordar(5);
    }

    public void esChocadoPor(Pacman pacman) {

        if (estaDebil) {

            pacman.comer(this);
            this.perderCuerpo();
        } else {

            pacman.morir();
        }
    }
}
