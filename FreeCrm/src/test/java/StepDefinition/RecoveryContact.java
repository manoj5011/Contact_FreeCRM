package StepDefinition;

import org.apache.poi.util.SystemOutLogger;
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

public class RecoveryContact {
	WebDriver driver;
	String recoverContact1,recoverContact2;

	@Test
	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium software\\chromedriver_win32 (1)\\chromedriver.exe");// To open Chrome through driver.
		driver = new ChromeDriver();// to create a object to use methods in the interface that are not
									// overidden and overidden methods in chrome drive
		driver.get("https://ui.cogmento.com/");// To open the website
		driver.manage().window().maximize();// To max the browser.
	}

	@Test
	@When("^user enters username and password in login page of freeCRM$")
	public void user_enters_username_and_password_in_login_page_of_freeCRM() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		LoginPagePOM lp = PageFactory.initElements(driver, LoginPagePOM.class);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("email")));
		lp.inputEmail("saisiddarthmanoj@gmail.com");
		lp.inputPassword("Manoj1999");
		lp.loginButton();
	}

	@Test
	@Then("^user should login and see the home page of freeCRM$")
	public void user_should_login_and_see_the_home_page_of_freeCRM() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='listbox']")));
		driver.findElement(By.xpath("//div[@role='listbox']")).click();
		assert driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).isDisplayed();
	}

	@Test(priority = 1)
	@When("^user tries to recover a contact from the bin$")
	public void user_tries_to_recover_a_contact_from_the_bin() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		ContactModulePOM cm = PageFactory.initElements(driver, ContactModulePOM.class);
		Thread.sleep(5000);
		cm.recoveryBinButton();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[id='main-content'] a:nth-child(1)")));
		cm.recoveryBinContactButton();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")));
		recoverContact1 = driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)"))
				.getText();
		// System.out.println("recoverContact1" + recoverContact1);
		Thread.sleep(5000);
		cm.checkBox1();
		cm.restoreSelectedButton();
		cm.OkButton();
		Thread.sleep(1000);
		cm.contactModule();

	}

	@Test(priority = 2)
	@Then("^contact should be visible on dashboard$")
	public void contact_should_be_visible_on_dashboard() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")));
		String DashboardContact1 = driver
				.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")).getText();
		Assert.assertEquals(DashboardContact1, recoverContact1);
	}

	@Test(priority = 3)
	@When("^user tries to recover multiple contacts from the bin$")
	public void user_tries_to_recover_multiple_contacts_from_the_bin() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		ContactModulePOM cm = PageFactory.initElements(driver, ContactModulePOM.class);
		Thread.sleep(5000);
		cm.recoveryBinButton();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[id='main-content'] a:nth-child(1)")));
		cm.recoveryBinContactButton();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")));
		recoverContact1 = driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)"))
				.getText();
		recoverContact2=driver.findElement(By.cssSelector("tbody tr:nth-child(2) td:nth-child(2) a:nth-child(1)"))
				.getText();
		//System.out.println("recoverContact1"+recoverContact1+"recoverContact2"+recoverContact2);
		Thread.sleep(5000);
		cm.checkBox1();
		cm.checkBox2();
		cm.restoreSelectedButton();
		cm.OkButton();
		Thread.sleep(1000);
		cm.contactModule();
	}

	@Test(priority = 4)
	@Then("^contacts should be visible on dashboard$")
	public void contacts_should_be_visible_on_dashboard() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")));
		String DashboardContact1 = driver
				.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")).getText();
		String DashboardContact2 = driver
				.findElement(By.cssSelector("tbody tr:nth-child(2) td:nth-child(2) a:nth-child(1)")).getText();
		//System.out.println("DashboardContact1"+DashboardContact1+"DashboardContact2"+DashboardContact2);
		Assert.assertEquals(DashboardContact1, recoverContact2);
		Assert.assertEquals(DashboardContact2, recoverContact1);

	}
	@After
	public void browserClose() {
		if(this.driver!=null)
		   driver.close();
	}

}
