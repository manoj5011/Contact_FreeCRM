package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/Feature",glue= {"StepDefinition"},plugin= {"pretty","usage","html:Report/htmlreport","json:Report/jsonreport.json","junit:Report/xmlreport.xml"},monochrome=true)
public class JunitRunner {

}
