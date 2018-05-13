package gradle.cucumber;

public class Pacman {

    private int puntaje;

    public void come(Biscuit biscuit) {

        puntaje += 5;

    }

    public void come(Fruta fruta) {

        puntaje += 10;

    }

    public void engordar() {

    }

    public int puntaje() {

        return puntaje;
    }
}
