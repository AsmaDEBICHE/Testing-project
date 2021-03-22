package stepsAndRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,

		features = "src/test/resources", plugin = { "pretty", "html:target/test-report", "json:target/test-report.json",
				"json:target/cucumber-report.json", "junit:target/test-report.xml" })

public class Runner {

}
