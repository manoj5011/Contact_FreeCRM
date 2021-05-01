package StepDefinition;

import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeleteContact {
	@Test
	@Given("^user goes to the login page of freeCRM$")
	public void user_goes_to_the_login_page_of_freeCRM() throws Throwable {

	}
    
	@Test
	@When("^user enters username and password in the login page$")
	public void user_enters_username_and_password_in_the_login_page() throws Throwable {

	}
    
	@Test
	@Then("^user should login and see logout option$")
	public void user_should_login_and_see_logout_option() throws Throwable {

	}
    
	@Test(priority=1)
	@When("^user deletes a particular contact$")
	public void user_deletes_a_particular_contact() throws Throwable {

	}
    
	@Test(priority=2)
	@Then("^contact should move to the bin$")
	public void contact_should_move_to_the_bin() throws Throwable {

	}
    
	@Test(priority=3)
	@When("^user selects multiple contacts and clicks on delete$")
	public void user_selects_multiple_contacts_and_clicks_on_delete() throws Throwable {

	}
    
	@Test(priority=4)
	@Then("^contacts should move to the bin$")
	public void contacts_should_move_to_the_bin() throws Throwable {

	}

	@Test(priority=5)
	@When("^user selects to delete a contact and then click on cancel$")
	public void user_selects_to_delete_a_contact_and_then_click_on_cancel() throws Throwable {

	}

	@Test(priority=6)
	@Then("^contact should not move to the bin$")
	public void contact_should_not_move_to_the_bin() throws Throwable {

	}

	@Test(priority=7)
	@When("^user selects multiple contacts to delete and then click on cancel$")
	public void user_selects_multiple_contacts_to_delete_and_then_click_on_cancel() throws Throwable {

	}

	@Test(priority=8)
	@Then("^contacts should not move to the bin$")
	public void contacts_should_not_move_to_the_bin() throws Throwable {

	}

}
