package gradle.cucumber;

public class Fantasma {

    private boolean estaDebil = false;
    private boolean tieneCuerpo = true;

    public boolean estaDebil() {
        return this.estaDebil;
    }

    public boolean tieneCuerpo() {
        return this.tieneCuerpo;
    }

    public void debilitarse() {
        this.estaDebil = true;
    }

    public void perderCuerpo() { this.tieneCuerpo = false; }
}
