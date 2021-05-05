package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM.ContactModulePOM;
import POM.LoginPagePOM;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FilterContact {
	WebDriver driver;
	String contact1, contact2, contact3, deleteContact;

	/**
	 * @throws Throwable
	 * To set the chrome driver and to open the web page.
	 */
	@Test
	@Given("^user directs to the login page$")
	public void user_directs_to_the_login_page() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium software\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();// to create a object to use methods in the interface that are not
									// overidden and overidden methods in chrome drive
		driver.get("https://ui.cogmento.com/");
		driver.manage().window().maximize();// To max the browser.
	}

	/**
	 * @throws Throwable
	 * To login the web page with email and password.
	 */
	@Test
	@When("^user enters username and password in their respective fields$")
	public void user_enters_username_and_password_in_their_respective_fields() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		LoginPagePOM lp = PageFactory.initElements(driver, LoginPagePOM.class);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("email")));
		lp.inputEmail("saisiddarthmanoj@gmail.com");
		lp.inputPassword("Manoj1999");
		lp.loginButton();
	}

	/**
	 * @throws Throwable
	 * Asserts if the login has been done or not.
	 */
	@Test
	@Then("^user should login and see home page$")
	public void user_should_login_and_see_home_page() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='listbox']")));
		driver.findElement(By.xpath("//div[@role='listbox']")).click();
		assert driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).isDisplayed();
	}

	/**
	 * @throws Throwable
	 * TO filter a contact with a valid condition.
	 */
	@Test(priority = 1)
	@When("^user filters a contact with valid condition$")
	public void user_filters_a_contact_with_valid_condition() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		ContactModulePOM cm = PageFactory.initElements(driver, ContactModulePOM.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Contacts')]")));
		cm.contactModule();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Show Filters')]")));
		cm.ShowFilterButton();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[class='search']")));
		cm.searchFilter("First Name");
		cm.filterOpertator("Equals");
		cm.filterValue("Ashok");
		cm.filterSearch();

	}

	/**
	 * @throws Throwable
	 * Asserts if the contacts are displayed according to the valid condition.
	 */
	@Test(priority = 2)
	@Then("^the contacts which satisfy the condition should be displayed$")
	public void the_contacts_which_satisfy_the_condition_should_be_displayed() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.cssSelector("tbody tr td:nth-child(2) a:nth-child(1)")));
		String name = driver.findElement(By.cssSelector("tbody tr td:nth-child(2) a:nth-child(1)")).getText();
		Assert.assertEquals(name, "Ashok Sai");

	}

	/**
	 * @throws Throwable
	 * To filter a contact with an invalid condition.
	 */
	@Test(priority = 3)
	@When("^user filters a contact with invalid condition$")
	public void user_filters_a_contact_with_invalid_condition() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		ContactModulePOM cm = PageFactory.initElements(driver, ContactModulePOM.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Contacts')]")));
		cm.contactModule();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Show Filters')]")));
		cm.ShowFilterButton();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[class='search']")));
		cm.searchFilter("Email");
		cm.filterOpertator("Ends with");
		cm.filterValue("Ashok");
		cm.filterSearch();
	}

	/**
	 * @throws Throwable
	 * Asserts if a message "no records found" is displayed for the invalid condition.
	 */
	@Test(priority = 4)
	@Then("^no contacts should be displayed$")
	public void no_contacts_should_be_displayed() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//p[normalize-space()='No records found']")));
		String msg = driver.findElement(By.xpath("//p[normalize-space()='No records found']")).getText();
		// System.out.println("msg error"+msg);
		Assert.assertEquals(msg, "No records found");
	}

	/**
	 * @throws Throwable
	 * To filter contacts with multiple valid filters.
	 */
	@Test(priority = 5)
	@When("^user filters a contact with valid conditions$")
	public void user_filters_a_contact_with_valid_conditions() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		ContactModulePOM cm = PageFactory.initElements(driver, ContactModulePOM.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Contacts')]")));
		cm.contactModule();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Show Filters')]")));
		cm.ShowFilterButton();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[class='search']")));
		cm.searchFilter("First Name");
		cm.filterOpertator("Equals");
		cm.filterValue("Ashok");
		cm.filterAddButton();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.xpath("//div[@class='ui search selection dropdown']//input[@type='text']")));
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[2]/div[1]/input[1]"))
				.sendKeys("Last Name");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[3]/div[1]"))
				.sendKeys("Contains");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[4]/div[1]/input[1]"))
				.sendKeys("Latha");
		cm.filterSearch();

	}

	/**
	 * @throws Throwable
	 * Asserts if contacts satisfying multiple valid conditions are being displayed or not.
	 */
	@Test(priority = 6)
	@Then("^the contacts which satisfy the conditions should be displayed$")
	public void the_contacts_which_satisfy_the_conditions_should_be_displayed() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//p[normalize-space()='No records found']")));
		String msg = driver.findElement(By.xpath("//p[normalize-space()='No records found']")).getText();
		Assert.assertNotEquals(msg, "No records found");
	}

	/**
	 * @throws Throwable
	 * TO filter contacts with multiple invalid conditions.
	 */
	@Test(priority = 7)
	@When("^user filters a contact with invalid conditions$")
	public void user_filters_a_contact_with_invalid_conditions() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		ContactModulePOM cm = PageFactory.initElements(driver, ContactModulePOM.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Contacts')]")));
		cm.contactModule();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Show Filters')]")));
		cm.ShowFilterButton();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[class='search']")));
		cm.searchFilter("Email");
		cm.filterOpertator("Equals");
		cm.filterValue("Ashok");
		cm.filterAddButton();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.xpath("//div[@class='ui search selection dropdown']//input[@type='text']")));
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[2]/div[1]/input[1]"))
				.sendKeys("First Name");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[3]/div[1]"))
				.sendKeys("Contains");
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[1]/div[4]/div[1]/input[1]"))
				.sendKeys("Latha");
		cm.filterSearch();

	}

	/**
	 * @throws Throwable
	 * Asserts if message "no records found" is being displayed or not for multiple invalid conditions 
	 */
	@Test(priority = 8)
	@Then("^user should not see any contacts$")
	public void user_should_not_see_any_contacts() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//p[normalize-space()='No records found']")));
		String msg = driver.findElement(By.xpath("//p[normalize-space()='No records found']")).getText();
		Assert.assertEquals(msg, "No records found");

	}

	/**
	 * @throws Throwable
	 * To filter contacts with a filter condition and then click on clear filter.
	 */
	@Test(priority = 9)
	@When("^user tries to filter contacts with a condition and then clicks on clear filter$")
	public void user_tries_to_filter_contacts_with_a_condition_and_then_clicks_on_clear_filter() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		ContactModulePOM cm = PageFactory.initElements(driver, ContactModulePOM.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Contacts')]")));
		cm.contactModule();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")));
		contact1 = driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")).getText();
		contact2 = driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")).getText();
		contact3 = driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")).getText();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Show Filters')]")));
		cm.ShowFilterButton();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[class='search']")));
		cm.searchFilter("First Name");
		cm.filterOpertator("Equals");
		cm.filterValue("Ashok");
		cm.filterSearch();
		Thread.sleep(2000);
		cm.filterClear();

	}

	/**
	 * @throws Throwable
	 * Asserts if all the contacts are being displayed or not after clearing the filter condition.
	 */
	@Test(priority = 10)
	@Then("^all the contacts should be displayed$")
	public void all_the_contacts_should_be_displayed() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")));
		String dashboardContact1 = driver
				.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")).getText();
		String dashboardContact2 = driver
				.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")).getText();
		String dashboardContact3 = driver
				.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")).getText();
		Assert.assertEquals(contact1, dashboardContact1);
		Assert.assertEquals(contact2, dashboardContact2);
		Assert.assertEquals(contact3, dashboardContact3);

	}

	/**
	 * @throws Throwable
	 * To delete contacts that are filtered by a condition.
	 */
	@Test(priority = 11)
	@When("^user filters contacts with valid condition and then delete it$")
	public void user_filters_contacts_with_valid_condition_and_then_delete_it() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		ContactModulePOM cm = PageFactory.initElements(driver, ContactModulePOM.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Contacts')]")));
		cm.contactModule();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Show Filters')]")));
		cm.ShowFilterButton();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[class='search']")));
		cm.searchFilter("First Name");
		cm.filterOpertator("Equals");
		cm.filterValue("Ashok");
		cm.filterSearch();
		Thread.sleep(2000);
		deleteContact = driver.findElement(By.cssSelector("tbody tr td:nth-child(2) a:nth-child(1)")).getText();
		cm.checkBox1();
		cm.actions();
		driver.findElement(By.xpath("//span[contains(text(),'Delete')]")).click();
		cm.actionsSelect();
		cm.deleteButtonAlert();
	}

	/**
	 * @throws Throwable
	 * Asserts if the contact is deleted and has moved to the bin.
	 */
	@Test(priority = 12)
	@Then("^contacts should be displayed in the bin$")
	public void contacts_should_be_displayed_in_the_bin() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		ContactModulePOM cm = PageFactory.initElements(driver, ContactModulePOM.class);
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.xpath("//p[normalize-space()='No records found']")));
		String msg = driver.findElement(By.xpath("//p[normalize-space()='No records found']")).getText();
		Assert.assertEquals(msg, "No records found");
		// Thread.sleep(5000);
		cm.recoveryBinButton();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[id='main-content'] a:nth-child(1)")));
		cm.recoveryBinContactButton();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")));
		String deletedContact = driver
				.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")).getText();
		Assert.assertEquals(deleteContact, deletedContact);
	}

	/**
	 * To close the browser after each scenario
	 */
	@After
	public void browserClose() {
		if (this.driver != null)//if condition is added to ensure that after does not run when this feature file is not called.
			driver.close();
	}

}
