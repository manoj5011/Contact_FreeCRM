package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/Feature/CreateContact.feature",tags="@create1",glue= {"StepDefinition"},plugin= {"pretty","html:JunitReports/htmlreport","json:JunitReports/jsonreport.json","junit:JunitReports/xmlreport.xml"},monochrome=true)
public class JunitRunner {

} 
