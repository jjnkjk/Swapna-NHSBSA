package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
       
		features = "src/test/java/cucumber1/feature",
		glue= "src/test/java/cucumber1/stepDefinitions")
public class TestRunner {
	
	
	

}
