package StepDefinition;

import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SecurityContact {
	@Test
	@Given("^added user logs into the page$")
	public void added_user_logs_into_the_page() throws Throwable {

	}
    @Test(priority=1)
	@When("^added user ties to access a private contact$")
	public void added_user_ties_to_access_a_private_contact() throws Throwable {
	
	}
    
	@Test(priority=2)
	@Then("^user should be able to view/access/edit/delete the contact$")
	public void user_should_be_able_to_view_access_edit_delete_the_contact() throws Throwable {
	 
	}
	
	@Test
	@Given("^non added user logs into the page$")
	public void non_added_user_logs_into_the_page() throws Throwable {

	}
	
	@Test(priority=3)
	@When("^non added user ties to access a private contact$")
	public void non_added_user_ties_to_access_a_private_contact() throws Throwable {
	
	}
    
	@Test(priority=4)
	@Then("^user should not be able to view/access/edit/delete the contact$")
	public void user_should_not_be_able_to_view_access_edit_delete_the_contact() throws Throwable {
	   
	}
	
	@Test
	@Given("^user logs into the page$")
	public void user_logs_into_the_page() throws Throwable {

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
