package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;

public class PacmanCucumber {

    private Pacman pacman = new Pacman();
    private Biscuit biscuit = new Biscuit();
    private Fruta fruta = new Fruta();
    private Fantasma fantasma = new Fantasma();

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
    public void restaVida(int vidaEsperada)  {

        TestCase.assertEquals(vidaEsperada, pacman.vida());
    }
}
