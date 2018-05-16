package gradle.cucumber;

public class Pellet {

    private Juego juego;

    public Pellet(Juego juegoEnCurso){ juego = juegoEnCurso; }

    public void esComidoPor(Pacman pacman) { juego.pacmanComioPellet(); }
}
