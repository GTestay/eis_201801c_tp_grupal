package gradle.cucumber;

public class Fantasma {

    private boolean estaDebil = false;

    public boolean estaDebil() {
        return this.estaDebil;
    }

    public void debilitarse() {
        this.estaDebil = true;
    }
}
