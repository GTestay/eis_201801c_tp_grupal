package gradle.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;

public class PacmanCucumber {

    private Pacman pacman;
    private Juego juego = new Juego();
    private Fantasma ultimoFantasmaChocado;

    @Then("^Fantasmas se debilitan$")
    public void fantasmasSeDebilitan() {

        TestCase.assertTrue(this.juego.fantasmasDebiles());
    }

    @When("^Choca con un fantasma debilitado$")
    public void pacmanChocaContraUnFantasmaDebilitado() {

        Fantasma fantasma = new Fantasma();
        fantasma.debilitarse();

        pacman.chocar(fantasma);
        ultimoFantasmaChocado = fantasma;
    }

    @When("^Choca con un fantasma sin cuerpo$")
    public void pacmanChocaContraUnFantasmaSinCuerpo() {

        Fantasma fantasma = new Fantasma();
        fantasma.perderCuerpo();
        ultimoFantasmaChocado = fantasma;
    }

    @Then("^Sigue con vida$")
    public void pacmanNoMuere() {

        TestCase.assertTrue(pacman.estaVivo());
    }

    @Given("^Pacman$")
    public void pacman(){

        pacman = new Pacman();
    }

    @When("^Come un biscuit$")
    public void comeUnBiscuit() {

        Biscuit biscuit = new Biscuit();
        pacman.comer(biscuit);
    }

    @Then("^Suma puntos (\\d+)$")
    public void sumaPuntos(int puntosEsperados)  {

        TestCase.assertEquals(puntosEsperados, pacman.puntaje());
    }

    @When("^Come una fruta$")
    public void comeUnaFruta() {

        Fruta fruta = new Fruta();
        pacman.comer(fruta);
    }

    @When("^Choca con un fantasma$")
    public void chocaConUnFantasma(){

        Fantasma fantasma = new Fantasma();
        pacman.chocar(fantasma);
    }

    @Then("^Muere$")
    public void muere(){

        TestCase.assertEquals(0, pacman.vida());
    }

    @When("^Come un pellet$")
    public void comeUnPellet() {

        Pellet pellet = new Pellet(this.juego);
        pacman.comer(pellet);
    }

    @Then("^Fantasma pierde su cuerpo$")
    public void fantasmaPierdeSuCuerpo() {

        TestCase.assertFalse(ultimoFantasmaChocado.tieneCuerpo());
    }
}
