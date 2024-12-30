package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		            features=".//Features/signup.feature",
                    glue = "stepDefinitionFile",
                    dryRun = false,
                    monochrome=true,
                    plugin = {"pretty"})



public class RunTest {

}