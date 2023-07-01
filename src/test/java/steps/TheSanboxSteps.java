package steps;

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

}
