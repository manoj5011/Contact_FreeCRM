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

public class EditContact {
	WebDriver driver;
	String name, emailID, phoneNumber;

	@Test
	@Given("^user goes to the login page$")
	public void user_goes_to_the_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium software\\chromedriver_win32 (1)\\chromedriver.exe");// To open Chrome through driver.
		driver = new ChromeDriver();// to create a object to use methods in the interface that are not
									// overidden and overidden methods in chrome drive
		driver.get("https://ui.cogmento.com/");// To open the website
		driver.manage().window().maximize();// To max the browser.
	}

	@Test
	@When("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		LoginPagePOM lp = PageFactory.initElements(driver, LoginPagePOM.class);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("email")));
		lp.inputEmail("saisiddarthmanoj@gmail.com");
		lp.inputPassword("Manoj1999");
		lp.loginButton();
	}

	@Test
	@Then("^user should login$")
	public void user_should_login() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='listbox']")));
		driver.findElement(By.xpath("//div[@role='listbox']")).click();
		assert driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).isDisplayed();

	}

	@Test(priority = 1)
	@When("^user edits required fields and clicks on save$")
	public void user_edits_required_fields_and_clicks_on_save() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		ContactModulePOM cm = PageFactory.initElements(driver, ContactModulePOM.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Contacts')]")));
		cm.contactModule();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[1]/td[8]/a[2]/button[1]")));
		driver.findElement(By.xpath("//tbody/tr[1]/td[8]/a[2]/button[1]")).click();
		// wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("first_name")));
		Thread.sleep(1000);
		driver.findElement(By.name("first_name")).clear();
		Thread.sleep(2000);
		cm.firstName("Ashok");
		cm.saveButton();
		Thread.sleep(5000);
		cm.contactModule();

	}

	@Test(priority = 2)
	@Then("^user should see an edited contact$")
	public void user_should_see_an_edited_contact() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("gopal Krishna")));
		assert driver.findElement(By.linkText("Ashok Sai")).isDisplayed();
	}

	@Test(priority = 3)
	@When("^user edits non required fields and clicks on save$")
	public void user_edits_non_required_fields_and_clicks_on_save() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		ContactModulePOM cm = PageFactory.initElements(driver, ContactModulePOM.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Contacts')]")));
		cm.contactModule();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[1]/td[8]/a[2]/button[1]")));
		driver.findElement(By.xpath("//tbody/tr[1]/td[8]/a[2]/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Email address']")).clear();
		Thread.sleep(2000);
		cm.emailField("Ashok@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Number']")).clear();
		Thread.sleep(1000);
		cm.phoneNoField("9347483222");
		cm.saveButton();
		Thread.sleep(5000);
		cm.contactModule();

	}

	@Test(priority = 4)
	@Then("^user should view an edited contact$")
	public void user_should_view_an_edited_contact() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.cssSelector("tbody tr:nth-child(1) td:nth-child(7)")));
		String editedEmailID = driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(7)")).getText();
		String editedPhoneNumber = driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(6)"))
				.getText();
		//System.out.println("editedPhoneNumber" + editedPhoneNumber);
		Assert.assertEquals(editedEmailID, "Ashok@gmail.com");
		Assert.assertTrue(editedPhoneNumber.contains("9347483222"));

	}

	@Test(priority = 5)
	@When("^user does not edit any field and clicks on save$")
	public void user_does_not_edit_any_field_and_clicks_on_save() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		ContactModulePOM cm = PageFactory.initElements(driver, ContactModulePOM.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Contacts')]")));
		cm.contactModule();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")));
		name = driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")).getText();
		emailID = driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(7)")).getText();
		phoneNumber = driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(6)")).getText();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[1]/td[8]/a[2]/button[1]")));
		driver.findElement(By.xpath("//tbody/tr[1]/td[8]/a[2]/button[1]")).click();
		Thread.sleep(2000);
		cm.saveButton();
		Thread.sleep(5000);
		cm.contactModule();

	}

	@Test(priority = 6)
	@Then("^user should view an non edited contact$")
	public void user_should_view_an_non_edited_contact() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.cssSelector("tbody tr:nth-child(1) td:nth-child(7)")));
		String editedEmailID = driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(7)")).getText();
		String editedPhoneNumber = driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(6)"))
				.getText();
		String	editedname = driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")).getText();
		//System.out.println("editedPhoneNumber" + editedPhoneNumber);
		Assert.assertEquals(editedEmailID, emailID);
		Assert.assertTrue(editedPhoneNumber.contains(phoneNumber));
		Assert.assertEquals(editedname, name);

	}

	@Test(priority = 7)
	@When("^user does not edit any field and clicks on cancel$")
	public void user_does_not_edit_any_field_and_clicks_on_cancel() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		ContactModulePOM cm = PageFactory.initElements(driver, ContactModulePOM.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Contacts')]")));
		cm.contactModule();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")));
		name = driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")).getText();
		emailID = driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(7)")).getText();
		phoneNumber = driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(6)")).getText();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[1]/td[8]/a[2]/button[1]")));
		driver.findElement(By.xpath("//tbody/tr[1]/td[8]/a[2]/button[1]")).click();
		Thread.sleep(2000);
		cm.cancelButtonCreate();
		Thread.sleep(5000);
		cm.contactModule();

	}

	@Test(priority = 8)
	@Then("^user should see an non edited contact$")
	public void user_should_see_an_non_edited_contact() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.cssSelector("tbody tr:nth-child(1) td:nth-child(7)")));
		String editedEmailID = driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(7)")).getText();
		String editedPhoneNumber = driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(6)"))
				.getText();
		String	editedname = driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")).getText();
		//System.out.println("editedPhoneNumber" + editedPhoneNumber);
		Assert.assertEquals(editedEmailID, emailID);
		Assert.assertTrue(editedPhoneNumber.contains(phoneNumber));
		Assert.assertEquals(editedname, name);

	}

	@After
	public void browserClose() {
		// driver.close();
	}

}
