package gradle.cucumber;

import java.util.ArrayList;

public class Juego {

    private ArrayList<Fantasma> fantasmas = new ArrayList<>();

    public ArrayList<Fantasma> fantasmas() { return fantasmas; }

    public void pacmanComioPellet() {

        for (Fantasma fantasma : this.fantasmas()) {
            fantasma.debilitarse();
        }
    }

    public boolean fantasmasDebiles() {

        return fantasmas().stream().allMatch(fantasma -> fantasma.estaDebil());
    }
}
