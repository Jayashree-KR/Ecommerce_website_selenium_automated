package runner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
    features = "src/test/java/features", // Path to feature files
    glue = {"steps"}, // Package containing step definitions
    plugin = {"pretty", "html:target/cucumber-html-report"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
