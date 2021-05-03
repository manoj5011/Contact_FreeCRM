package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

public class DeleteContact {
	WebDriver driver;
	String contact1, contact2, contact3,contact4,contact5;

	@Test
	@Given("^user goes to the login page of freeCRM$")
	public void user_goes_to_the_login_page_of_freeCRM() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium software\\chromedriver_win32 (1)\\chromedriver.exe");// To open Chrome through driver.
		driver = new ChromeDriver();// to create a object to use methods in the interface that are not
									// overidden and overidden methods in chrome drive
		driver.get("https://ui.cogmento.com/");// To open the website
		driver.manage().window().maximize();// To max the browser.
	}

	@Test
	@When("^user enters username and password in the login page$")
	public void user_enters_username_and_password_in_the_login_page() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		LoginPagePOM lp = PageFactory.initElements(driver, LoginPagePOM.class);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("email")));
		lp.inputEmail("saisiddarthmanoj@gmail.com");
		lp.inputPassword("Manoj1999");
		lp.loginButton();

	}

	@Test
	@Then("^user should login and see logout option$")
	public void user_should_login_and_see_logout_option() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='listbox']")));
		driver.findElement(By.xpath("//div[@role='listbox']")).click();
		assert driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).isDisplayed();
	}

	@Test(priority = 1)
	@When("^user deletes a particular contact$")
	public void user_deletes_a_particular_contact() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		ContactModulePOM cm = PageFactory.initElements(driver, ContactModulePOM.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Contacts')]")));
		cm.contactModule();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")));
		contact1 = driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")).getText();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[1]/td[8]/div[1]/button[1]/i[1]")));
		driver.findElement(By.xpath("//tbody/tr[1]/td[8]/div[1]/button[1]/i[1]")).click();
		cm.deleteButtonAlert();
	}

	@Test(priority = 2)
	@Then("^contact should move to the bin$")
	public void contact_should_move_to_the_bin() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		ContactModulePOM cm = PageFactory.initElements(driver, ContactModulePOM.class);
		Thread.sleep(5000);
		cm.recoveryBinButton();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[id='main-content'] a:nth-child(1)")));
		cm.recoveryBinContactButton();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")));
		String deleteContact1 = driver
				.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")).getText();
		Assert.assertEquals(deleteContact1, contact1);
	}

	@Test(priority = 3)
	@When("^user selects multiple contacts and clicks on delete$")
	public void user_selects_multiple_contacts_and_clicks_on_delete() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		ContactModulePOM cm = PageFactory.initElements(driver, ContactModulePOM.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Contacts')]")));
		cm.contactModule();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")));
		contact2 = driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")).getText();
		contact3 = driver.findElement(By.cssSelector("tbody tr:nth-child(2) td:nth-child(2) a:nth-child(1)")).getText();
//		System.out.println("co2"+contact2+"co3"+contact3);
		Thread.sleep(5000);
		cm.checkBox1();
		cm.checkBox2();
		cm.actions();
		driver.findElement(By.xpath("//span[contains(text(),'Delete')]")).click();
		cm.actionsSelect();
		cm.deleteButtonAlert();
	}

	@Test(priority = 4)
	@Then("^contacts should move to the bin$")
	public void contacts_should_move_to_the_bin() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		ContactModulePOM cm = PageFactory.initElements(driver, ContactModulePOM.class);
		Thread.sleep(5000);
		cm.recoveryBinButton();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[id='main-content'] a:nth-child(1)")));
		cm.recoveryBinContactButton();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")));
		String deleteContact3 = driver
				.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")).getText();
		String deleteContact2 = driver
				.findElement(By.cssSelector("tbody tr:nth-child(2) td:nth-child(2) a:nth-child(1)")).getText();
//		System.out.println("c3"+deleteContact3+" c2"+deleteContact2);
		Assert.assertEquals(deleteContact2, contact2);
		Assert.assertEquals(deleteContact3, contact3);

	}

	@Test(priority = 5)
	@When("^user selects to delete a contact and then click on cancel$")
	public void user_selects_to_delete_a_contact_and_then_click_on_cancel() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		ContactModulePOM cm = PageFactory.initElements(driver, ContactModulePOM.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Contacts')]")));
		cm.contactModule();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")));
		contact4 = driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")).getText();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[1]/td[8]/div[1]/button[1]/i[1]")));
		driver.findElement(By.xpath("//tbody/tr[1]/td[8]/div[1]/button[1]/i[1]")).click();
		cm.cancelDeleteAlert();
	}

	@Test(priority = 6)
	@Then("^contact should not move to the bin$")
	public void contact_should_not_move_to_the_bin() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		ContactModulePOM cm = PageFactory.initElements(driver, ContactModulePOM.class);
		Thread.sleep(5000);
		cm.recoveryBinButton();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[id='main-content'] a:nth-child(1)")));
		cm.recoveryBinContactButton();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")));
		String deleteContact = driver
				.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")).getText();
		Assert.assertNotEquals(deleteContact, contact4);

	}

	@Test(priority = 7)
	@When("^user selects multiple contacts to delete and then click on cancel$")
	public void user_selects_multiple_contacts_to_delete_and_then_click_on_cancel() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		ContactModulePOM cm = PageFactory.initElements(driver, ContactModulePOM.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Contacts')]")));
		cm.contactModule();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")));
		contact4 = driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")).getText();
		contact5 = driver.findElement(By.cssSelector("tbody tr:nth-child(2) td:nth-child(2) a:nth-child(1)")).getText();
//		System.out.println("co2"+contact2+"co3"+contact3);
		Thread.sleep(5000);
		cm.checkBox1();
		cm.checkBox2();
		cm.actions();
		driver.findElement(By.xpath("//span[contains(text(),'Delete')]")).click();
		cm.actionsSelect();
		cm.cancelDeleteAlert();
	}

	@Test(priority = 8)
	@Then("^contacts should not move to the bin$")
	public void contacts_should_not_move_to_the_bin() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		ContactModulePOM cm = PageFactory.initElements(driver, ContactModulePOM.class);
		Thread.sleep(5000);
		cm.recoveryBinButton();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[id='main-content'] a:nth-child(1)")));
		cm.recoveryBinContactButton();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")));
		String deleteContact5 = driver
				.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")).getText();
		String deleteContact4 = driver
				.findElement(By.cssSelector("tbody tr:nth-child(2) td:nth-child(2) a:nth-child(1)")).getText();
//		System.out.println("c3"+deleteContact3+" c2"+deleteContact2);
		Assert.assertNotEquals(deleteContact4, contact4);
		Assert.assertNotEquals(deleteContact5, contact5);

	}

	@After
	public void browserClose() {
		// driver.close();
	}

}
