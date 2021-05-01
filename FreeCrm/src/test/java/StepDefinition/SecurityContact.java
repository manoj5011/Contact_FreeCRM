package StepDefinition;

import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SecurityContact {
	@Test
	@Given("^user navigate to the login page of freeCRM$")
	public void user_navigate_to_the_login_page_of_freeCRM() throws Throwable {

	}
    
	@Test
	@When("^user enters username and password in respective fields$")
	public void user_enters_username_and_password_in_respective_fields() throws Throwable {

	}
    
	@Test
	@Then("^user should login and view the home page$")
	public void user_should_login_and_view_the_home_page() throws Throwable {
	
	}
    
	@Test(priority=1)
	@When("^added user ties to access a private contact$")
	public void added_user_ties_to_access_a_private_contact() throws Throwable {
	
	}
    
	@Test(priority=2)
	@Then("^user should be able to view/access/edit/delete the contact$")
	public void user_should_be_able_to_view_access_edit_delete_the_contact() throws Throwable {
	 
	}
    
	@Test(priority=3)
	@When("^non added user ties to access a private contact$")
	public void non_added_user_ties_to_access_a_private_contact() throws Throwable {
	
	}
    
	@Test(priority=4)
	@Then("^user should not be able to view/access/edit/delete the contact$")
	public void user_should_not_be_able_to_view_access_edit_delete_the_contact() throws Throwable {
	   
	}
    
	@Test(priority=5)
	@When("^user ties to access a public contact$")
	public void user_ties_to_access_a_public_contact() throws Throwable {
	 
	}
    
	@Test(priority=6)
	@Then("^all user should be able to view/access/edit/delete the contact$")
	public void all_user_should_be_able_to_view_access_edit_delete_the_contact() throws Throwable {
	  
	}

}
