package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/mukulsharma/IdeaProjects/Amazon/src/test/java/AmazonFeatures/Login.feature",
        glue = {"/Users/mukulsharma/IdeaProjects/Amazon/src/test/java/Steps/LoginSteps.java"},
        dryRun = false,
        strict = true

        )

public class TestRunner {


}
