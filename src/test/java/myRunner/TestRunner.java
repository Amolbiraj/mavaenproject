package myRunner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".\\features\\opencatrtregistation.feature",
         glue   ="stepdefination",
		monochrome=true,
		dryRun=false,
		tags="@sanity or @regression",
	    plugin={"pretty","html:target\\cucumber-reports\\reports1.html"}
		
		)
		
		
	
	




public class TestRunner {

	

}
