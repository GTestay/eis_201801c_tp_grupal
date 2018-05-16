package gradle.cucumber;

public class Biscuit implements Comestible {

    public void esComidoPor(Pacman pacman) {

        pacman.engordar(5);
    }
}
