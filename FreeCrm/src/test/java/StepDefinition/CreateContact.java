package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateContact {

	@Given("^user navigates to the login page$")
	public void user_navigates_to_the_login_page() throws Throwable {

	}

	@When("^user enters username and password in the fields$")
	public void user_enters_username_and_password_in_the_fields() throws Throwable {

	}

	@Then("^user should login and should be on home page$")
	public void user_should_login_and_should_be_on_home_page() throws Throwable {

	}

	@When("^user enters first name, last name and clicks on save$")
	public void user_enters_first_name_last_name_and_clicks_on_save() throws Throwable {

	}

	@Then("^user should see the contact on the dashboard$")
	public void user_should_see_the_contact_on_the_dashboard() throws Throwable {

	}

	@When("^user user enters ([^\\\"]*) and clicks on save$")
	public void user_user_enters_first_name_and_clicks_on_save(String firstname) throws Throwable {

	}

	@Then("^user should see see a error message$")
	public void user_should_see_see_a_error_message() throws Throwable {

	}

	@When("^user enters ([^\\\"]*) and ([^\\\"]*) and ([^\\\"]*) and ([^\\\"]*) and ([^\\\"]*) and ([^\\\"]*) and ([^\\\"]*) and ([^\\\"]*) and ([^\\\"]*) and ([^\\\"]*) and ([^\\\"]*) and ([^\\\"]*) and click on save$")
	public void user_enters_first_name_last_name_email_id_phone_number_address_street_address_city_address_state_address_code_address_country_birthday_day_birthday_month_birthday_year_and_click_on_save(
			String firstName, String lastName, String email, String phoneno, String addressStreet, String addressCity,
			String addressState, String addressCode, String addressCountry, String birthdayDay, String birthdayMonth,
			String birthdayYear) throws Throwable {

	}

	@Then("^user should see the contact on the contacts dashboard when valid data is given$")
	public void user_should_see_the_contact_on_the_contacts_dashboard_when_valid_data_is_given() throws Throwable {

	}

	@Then("^user should not see the contact when invalid data is given$")
	public void user_should_not_see_the_contact_when_invalid_data_is_given() throws Throwable {

	}

	@When("^user gives data ([^\\\"]*),([^\\\"]*),([^\\\"]*),([^\\\"]*),([^\\\"]*),([^\\\"]*) and clicks on cancel$")
	public void user_gives_data_first_name_last_name_email_birthday_day_birthday_month_birthday_year_and_clicks_on_cancel(String firstName,String lastName,String email,String birthdayDay,String birthdayMonth,String birthdayYear) throws Throwable {

	}

	@Then("^user should not see the contacts$")
	public void user_should_not_see_the_contacts() throws Throwable {

	}
}
