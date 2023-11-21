package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(tags="",features="src/test/resources/Features/Outpatient.feature",glue ="com.stepdefinition",plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},dryRun = true)
public class Runner {
}
