package StepDefinition;

import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FilterContact {
	@Test
	@Given("^user directs to the login page$")
	public void user_directs_to_the_login_page() throws Throwable {

	}
    
	@Test
	@When("^user enters username and password in their respective fields$")
	public void user_enters_username_and_password_in_their_respective_fields() throws Throwable {
	
	}
    
	@Test
	@Then("^user should login and see home page$")
	public void user_should_login_and_see_home_page() throws Throwable {

	}
    
	@Test(priority=1)
	@When("^user filters a contact with valid condition$")
	public void user_filters_a_contact_with_valid_condition() throws Throwable {

	}
    
	@Test(priority=2)
	@Then("^the contacts which satisfy the condition should be displayed$")
	public void the_contacts_which_satisfy_the_condition_should_be_displayed() throws Throwable {
	
	}
    
	@Test(priority=3)
	@When("^user filters a contact with invalid condition$")
	public void user_filters_a_contact_with_invalid_condition() throws Throwable {
	
	}
    
	@Test(priority=4)
	@Then("^no contacts should be displayed$")
	public void no_contacts_should_be_displayed() throws Throwable {

	}
    
	@Test(priority=5)
	@When("^user filters a contact with valid conditions$")
	public void user_filters_a_contact_with_valid_conditions() throws Throwable {
	
	}
    
	@Test(priority=6)
	@Then("^the contacts which satisfy the conditions should be displayed$")
	public void the_contacts_which_satisfy_the_conditions_should_be_displayed() throws Throwable {
	
	}
    
	@Test(priority=7)
	@When("^user filters a contact with invalid conditions$")
	public void user_filters_a_contact_with_invalid_conditions() throws Throwable {
	
	}
    
	@Test(priority=8)
	@Then("^user should not see any contacts$")
	public void user_should_not_see_any_contacts() throws Throwable {
	
	}
    
	@Test(priority=9)
	@When("^user tries to filter contacts with a condition and then clicks on clear filter$")
	public void user_tries_to_filter_contacts_with_a_condition_and_then_clicks_on_clear_filter() throws Throwable {
	
	}
    
	@Test(priority=10)
	@Then("^all the contacts should be displayed$")
	public void all_the_contacts_should_be_displayed() throws Throwable {
	  
	}
    
	@Test(priority=11)
	@When("^user filters contacts with valid condition and then delete it$")
	public void user_filters_contacts_with_valid_condition_and_then_delete_it() throws Throwable {
	  
	}
    
	@Test(priority=12)
	@Then("^contacts should be displayed in the bin$")
	public void contacts_should_be_displayed_in_the_bin() throws Throwable {
	
	}
}
