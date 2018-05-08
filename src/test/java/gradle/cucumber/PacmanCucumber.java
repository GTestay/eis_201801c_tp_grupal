package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;


public class PacmanCucumber {


    private Pacman pacman = new Pacman();
    private Biscuit biscuit = new Biscuit();

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
}
