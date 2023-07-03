package steps;

import org.junit.Assert;

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
        google.enterSearchCriteria("Uruguay");
    }

    @When("hago click en el boton buscar")
    public void hago_click_en_el_boton_buscar() {
        google.clickGoogleSearch();
    }

    @Then("^obtengo resultado")
    public void obtengoResultado() {
        Assert.assertEquals("Uruguay", google
                .getElementText("//h2[@class='qrShPb pXs6bb PZPZlf q8U8x aTI8gc']//span[contains(text(),'Uruguay')]"));

    }
}
