package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(features ="src/test/resources/Feature/DeleteContact.feature",glue={"StepDefinition"})
public class TestNGRunner extends AbstractTestNGCucumberTests{

}
