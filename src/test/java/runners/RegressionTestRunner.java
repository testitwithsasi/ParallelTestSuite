package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/regression",
        glue = {"stepsDefinition"},
        tags = "@regression",
        plugin = {"pretty", "html:target/regression-report.html"}
)
public class RegressionTestRunner extends AbstractTestNGCucumberTests {
}
