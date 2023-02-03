package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"./src/test/java/features"},
		glue = {"stepDefinations"},
		dryRun = false
		)

public class CucumberRunner extends AbstractTestNGCucumberTests {
	}
