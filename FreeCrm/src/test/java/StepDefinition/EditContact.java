package StepDefinition;

import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditContact {
	@Test
	@Given("^user goes to the login page$")
	public void user_goes_to_the_login_page() throws Throwable {

	}
    
	@Test
	@When("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {

	}
    
	@Test
	@Then("^user should login$")
	public void user_should_login() throws Throwable {

	}
  
	@Test(priority=1)
	@When("^user edits required fields and clicks on save$")
	public void user_edits_required_fields_and_clicks_on_save() throws Throwable {

	}
    
	@Test(priority=2)
	@Then("^user should see an edited contact$")
	public void user_should_see_an_edited_contact() throws Throwable {

	}
    
	@Test(priority=3)
	@When("^user edits non required fields and clicks on save$")
	public void user_edits_non_required_fields_and_clicks_on_save() throws Throwable {

	}
    
	@Test(priority=4)
	@Then("^user should view an edited contact$")
	public void user_should_view_an_edited_contact() throws Throwable {

	}
    
	@Test(priority=5)
	@When("^user does not edit any field and clicks on save$")
	public void user_does_not_edit_any_field_and_clicks_on_save() throws Throwable {
	  
	}
    
	@Test(priority=6)
	@Then("^user should view an non edited contact$")
	public void user_should_view_an_non_edited_contact() throws Throwable {
	
	}
    
	@Test(priority=7)
	@When("^user does not edit any field and clicks on cancel$")
	public void user_does_not_edit_any_field_and_clicks_on_cancel() throws Throwable {
	
	}
    
	@Test(priority=8)
	@Then("^user should see an non edited contact$")
	public void user_should_see_an_non_edited_contact() throws Throwable {

	}

}
