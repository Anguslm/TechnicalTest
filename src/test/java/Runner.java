import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/featureFiles",
        glue = "classpath:stepdefs",
        tags = "@FactorFinder"
)

public class Runner extends AbstractTestNGCucumberTests {
}
