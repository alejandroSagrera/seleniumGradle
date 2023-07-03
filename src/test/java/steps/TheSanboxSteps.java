package steps;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.TestSandBox;

public class TheSanboxSteps {

    TestSandBox sandBox = new TestSandBox();

    @Given("I navigate to the static table")
    public void I_navigate_to_the_static_table() {
        sandBox.navigateToGrid();
    }

    @Then("I can return the value I want")
    public void I_can_return_the_value_I_want() {
        String value = sandBox.getValueFromGrid(3, 2);
        System.out.println(value);
    }

    @Then("I can validate the table is displayed")
    public void I_can_validate_the_table_is_displayed() {
        Assert.assertTrue("No anduvo",sandBox.cellStatus());
    }
 
}
