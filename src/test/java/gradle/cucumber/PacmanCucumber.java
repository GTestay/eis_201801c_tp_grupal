package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Test;
import junit.framework.TestCase;

public class PacmanCucumber {

    private Pacman pacman = new Pacman();
    private Biscuit biscuit = new Biscuit();
    private Fruta fruta = new Fruta();
    private Fantasma fantasma = new Fantasma();
    private Pellet pellet = new Pellet();
    private Juego juego = new Juego();

    @Given("^Pacman come un biscuit$")
    public void pacmanComeUnBiscuit()  {

        pacman.come(biscuit);
    }

    @When("^Se vuelve más gordo$")
    public void seVuelveMásGordo()  {

        pacman.engordar();
    }

    @Then("^Suma puntos (\\d+)$")
    public void sumaPuntos(int puntosEsperados)  {

        TestCase.assertEquals(puntosEsperados, pacman.puntaje());
    }

    @Given("^Pacman come una fruta$")
    public void pacmanComeUnaFruta() throws Throwable {

        pacman.come(fruta);
    }

    @Given("^Pacman avanza$")
    public void pacmanAvanza() {

        pacman.avanza();
    }

    @When("^Choca con un fantasma$")
    public void chocaConUnFantasma() {

        pacman.chocar(this.fantasma);
    }

    @Then("^Su vida es (\\d+)$")
    public void restaVida(int vida)  {

        TestCase.assertEquals(vida, pacman.vida());
    }

    @Given("^Un Pacman")
    public void dadoUnPacman() {
        this.juego.agregarFantasma(this.fantasma);
        this.pacman.definirJuego(this.juego);
    }

    @When("^Pacman come pellet$")
    public void pacmanComeUnPellet() {

        this.pacman.come(this.pellet);
    }

    @Then("^Fantasmas se debilitan$")
    public void fantasmasSeDebilitan() {

        TestCase.assertTrue(this.juego.fantasmas().get(0).estaDebil());
    }

    @When("^Choca con un fantasma debilitado$")
    public void pacmanChocaContraUnFantasmaDebilitado() {
        this.pacman.come(this.pellet);
        this.pacman.chocar(this.juego.fantasmas().get(0));
    }

    @Then("^Sigue con vida y el fantasma pierde su cuerpo$")
    public void pacmanNoMuereYElFantasmaPierdeSuCuerpo() {

        TestCase.assertTrue(this.pacman.estaVivo());
        TestCase.assertFalse(this.juego.fantasmas().get(0).tieneCuerpo());
    }

    @When("^Choca con un fantasma sin cuerpo$")
    public void pacmanChocaContraUnFantasmaSinCuerpo() {
        this.pacman.come(this.pellet);
        this.pacman.chocar(this.juego.fantasmas().get(0));
        this.pacman.chocar(this.juego.fantasmas().get(0));
    }

    @Then("^Sigue con vida$")
    public void pacmanNoMuere() {

        TestCase.assertTrue(this.pacman.estaVivo());
        TestCase.assertFalse(this.juego.fantasmas().get(0).tieneCuerpo());
    }
}
