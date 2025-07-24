package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/smoke",
        glue = {"stepsDefinition"},
        tags = "@smoke",
        plugin = {"pretty", "html:target/smoke-report.html"}
)
public class SmokeTestRunner extends AbstractTestNGCucumberTests {
}
