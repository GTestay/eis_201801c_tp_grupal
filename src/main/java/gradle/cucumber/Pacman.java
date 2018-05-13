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

    public void avanza() {

    }

    public int vida() {

        return 0;
    }

    public void chocar(Fantasma fantasma) {

    }
}
