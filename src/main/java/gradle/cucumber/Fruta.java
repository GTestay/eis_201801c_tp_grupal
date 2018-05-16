package gradle.cucumber;

public class Fruta implements Comestible {

    @Override
    public void esComidoPor(Pacman pacman) {

        pacman.engordar(10);
    }
}
