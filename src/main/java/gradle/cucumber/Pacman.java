package gradle.cucumber;

public class Pacman {

    private int puntaje;
    private boolean estaVivo;

    private Juego juego;

    public void come(Biscuit biscuit) {
        puntaje += 5;
    }

    public void come(Fruta fruta) {
        puntaje += 10;
    }

    public void come(Pellet pellet) {
        this.juego.pacmanComioPellet();
    }

    public void come(Fantasma fantasmaDebilitado) {
        puntaje += 5;
    }

    public void engordar() {

    }

    public int puntaje() {
        return puntaje;
    }

    public void avanza() {

    }

    public boolean estaVivo() {
        return this.estaVivo;
    }

    public int vida() {
        return 0;
    }

    public void morir() {
        this.estaVivo = false;
    }

    public void chocar(Fantasma fantasma) {
        if (!fantasma.estaDebil()){
            this.morir();
        } else {
            this.come(fantasma);
            fantasma.perderCuerpo();
        }
    }

    public void definirJuego(Juego juego) {
        this.juego = juego;
        this.estaVivo = true;
    }
}
