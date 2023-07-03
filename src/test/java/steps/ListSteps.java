package steps;

import pages.ListPage;

import java.util.List;

import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ListSteps {
    ListPage listP = new ListPage();

    @Given("I navigate to the list page")
    public void I_navigate_to_the_list_page() {
        listP.navigateTo();
    }

    @Then("I can find the text in the list")
    public void I_can_find_the_text_in_the_list() throws InterruptedException {
        listP.enterSearchCriteria();
    }

    @When("I search the list")
    public void I_search_the_list() {
        List<String> lista = listP.getAllSearchResults();
        Assert.assertTrue(lista.contains("Mr."));
    }
}
