package StepDefinition;

import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RecoveryContact {
	@Test
	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() throws Throwable {

	}
   
	@Test
	@When("^user enters username and password in login page of freeCRM$")
	public void user_enters_username_and_password_in_login_page_of_freeCRM() throws Throwable {

	}
    
	@Test
	@Then("^user should login and see the home page of freeCRM$")
	public void user_should_login_and_see_the_home_page_of_freeCRM() throws Throwable {

	}
    
	@Test(priority=1)
	@When("^user tries to recover a contact from the bin$")
	public void user_tries_to_recover_a_contact_from_the_bin() throws Throwable {
	  
	}
    
	@Test(priority=2)
	@Then("^contact should be visible on dashboard$")
	public void contact_should_be_visible_on_dashboard() throws Throwable {
	    
	}
    
	@Test(priority=3)
	@When("^user tries to recover multiple contacts from the bin$")
	public void user_tries_to_recover_multiple_contacts_from_the_bin() throws Throwable {
	    
	}
    
	@Test(priority=4)
	@Then("^contacts should be visible on dashboard$")
	public void contacts_should_be_visible_on_dashboard() throws Throwable {
	 
	}

}
