import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/feautures/bncone.feature", glue="steps")

public class RunTest extends AbstractTestNGCucumberTests {
	
	
}
