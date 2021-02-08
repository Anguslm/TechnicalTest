package stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import application.FactorFinder;
import org.testng.Assert;

public class FactorFinderSteps {
    private FactorFinder factorFinder;

    private String factorFinderOutput;

    public FactorFinderSteps() {
        factorFinder = new FactorFinder();
    }

    @When("I input the number {int} to the factor finder")
    public void inputToFactorFinder (int numberToFactorise) {
        factorFinderOutput = factorFinder.convert(numberToFactorise);
    }

    @Then("The factor finder returns the string {}")
    public void factorFinderReturnsString (String expectedOutput) {
        Assert.assertEquals(factorFinderOutput, expectedOutput);
    }
}
