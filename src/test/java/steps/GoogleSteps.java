package steps;

import io.cucumber.java.en.*;
import pages.GooglePage;

public class GoogleSteps {
    GooglePage google = new GooglePage();

    @Given("^navego a Google")
    public void navegarAGoogle() {
        google.navigateTo();
    }

    @When("^busco algo")
    public void buscoAlgo() {

    }

    @When("hago click en el boton buscar")
    public void hago_click_en_el_boton_buscar() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^obtengo resultado")
    public void obtengoResultado() {

    }
}