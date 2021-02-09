package stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import application.FactorFinder;
import org.testng.Assert;

public class FactorFinderSteps {
    private FactorFinder factorFinder;

    //Stores the out put of the factor finder from the when step, so it can be accessed and checked by the then step
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
        System.out.println("Expected [" + expectedOutput + "] and found [" + factorFinderOutput + "]");
        Assert.assertEquals(factorFinderOutput, expectedOutput);
    }
}
