package gradle.cucumber;

public class Pellet implements Comestible {

    private Juego juego;

    public Pellet(Juego juegoEnCurso) {
        juego = juegoEnCurso;
    }

    @Override
    public void esComidoPor(Pacman pacman) {
        juego.pacmanComioPellet();
    }
}
