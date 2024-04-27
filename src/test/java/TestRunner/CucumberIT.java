package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@smoke",features={"src/test/resources/Features"}, glue={"StepDefinitions","Hooks"}, plugin={"pretty","html:target/htmlreport.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class CucumberIT extends AbstractTestNGCucumberTests {
	

}
