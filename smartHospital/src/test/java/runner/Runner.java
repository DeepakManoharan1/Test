package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
//import io.cucumber.testng.CucumberOptions;
//import io.cucumber.testng.CucumberOptions;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(tags="@FullBilling",features="src/test/resources/Features/Billing.feature",glue ="com.stepdefinition",plugin= {"json:target/cucumber/cucumber-report.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},dryRun = false)
public class Runner   {
//	@Override
//	extends AbstractTestNGCucumberTests
//	@DataProvider(parallel=true)
//	public Object[][] scenarios(){
//		return super.scenarios();
//	}
}
