package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@cucumber.api.junit
@CucumberO(features = "src/feature", glue = "cucumberdemo1", plugin = { "pretty",
		"html:target/cucumber-reports" }, monochrome = true)
public class TestRunner {
}
