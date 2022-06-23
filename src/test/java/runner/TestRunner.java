package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		    features = "./src/test/resources/Features",
		    glue = "stepDef",
		    dryRun = false,
		    tags ="@login",
		    monochrome = true,
		    strict = true,
		    plugin = {"pretty","html:target/site/cucumber-pretty","json:target/cucumber.json"},
		    publish = true
		
		)



public class TestRunner  {
	
	
	
	
	

}
