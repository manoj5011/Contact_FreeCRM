package TestRunner;

import org.testng.annotations.DataProvider;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(features ="src/test/resources/Feature",glue={"StepDefinition"})
public class TestNGRunner extends AbstractTestNGCucumberTests{
 
}
