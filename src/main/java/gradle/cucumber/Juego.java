package gradle.cucumber;

import java.util.ArrayList;

public class Juego {

    private ArrayList<Fantasma> fantasmas = new ArrayList<Fantasma>();

    public void agregarFantasma(Fantasma fantasma) {
        this.fantasmas.add(new Fantasma());
    }

    public ArrayList<Fantasma> fantasmas() {
        return this.fantasmas;
    }

    public void pacmanComioPellet() {

        for (Fantasma fantasma : this.fantasmas()) {
            fantasma.debilitarse();
        }
    }
}
