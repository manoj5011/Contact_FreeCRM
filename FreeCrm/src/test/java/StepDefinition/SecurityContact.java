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

public class SecurityContact {
	WebDriver driver;
	@Test(priority=1)
	@Given("^added user logs into the page$")
	public void added_user_logs_into_the_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium software\\chromedriver_win32 (1)\\chromedriver.exe");// To open Chrome through driver.
		driver = new ChromeDriver();// to create a object to use methods in the interface that are not
									// overidden and overidden methods in chrome drive
		driver.get("https://ui.cogmento.com/");// To open the website
		driver.manage().window().maximize();// To max the browser.
		WebDriverWait wait = new WebDriverWait(driver, 30);
		LoginPagePOM lp = PageFactory.initElements(driver, LoginPagePOM.class);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("email")));
		lp.inputEmail("jalalikrishna@gmail.com");
		lp.inputPassword("Capgemini");
		lp.loginButton();

	}
	@Test(priority=2)
	@When("^added user ties to access a private contact$")
	public void added_user_ties_to_access_a_private_contact() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		ContactModulePOM cm = PageFactory.initElements(driver, ContactModulePOM.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Contacts')]")));
		cm.contactModule();
	}
    
	@Test(priority=3)
	@Then("^user should be able to view/access/edit/delete the contact$")
	public void user_should_be_able_to_view_access_edit_delete_the_contact() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		ContactModulePOM cm = PageFactory.initElements(driver, ContactModulePOM.class);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Madhavi latha")));
		assert driver.findElement(By.linkText("Madhavi latha")).isDisplayed();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Madhavi latha")).click();
		//driver.findElement(By.xpath("//tbody/tr[1]/td[8]/a[1]/button[1]")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(text(),'Middle Name(s)')]")));
    	assert driver.findElement(By.xpath("//div[contains(text(),'Middle Name(s)')]")).isDisplayed();
    	driver.findElement(By.xpath("//button[@class='ui icon button']//i[@class='edit icon']")).click();
    	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//label[normalize-space()='First Name']")));
    	assert driver.findElement(By.xpath("//label[normalize-space()='First Name']")).isDisplayed();
    	cm.cancelButtonCreate();
    	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//i[@class='trash icon']")));
    	driver.findElement(By.xpath("//i[@class='trash icon']")).click();
    	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[normalize-space()='Delete']")));
    	assert driver.findElement(By.xpath("//button[normalize-space()='Delete']")).isDisplayed();
	}
	
	@Test(priority=4)
	@Given("^non added user logs into the page$")
	public void non_added_user_logs_into_the_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium software\\chromedriver_win32 (1)\\chromedriver.exe");// To open Chrome through driver.
		driver = new ChromeDriver();// to create a object to use methods in the interface that are not
									// overidden and overidden methods in chrome drive
		driver.get("https://ui.cogmento.com/");// To open the website
		driver.manage().window().maximize();// To max the browser.
		WebDriverWait wait = new WebDriverWait(driver, 30);
		LoginPagePOM lp = PageFactory.initElements(driver, LoginPagePOM.class);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("email")));
		lp.inputEmail("ranjan@gmail.com");
		lp.inputPassword("Capgemini");
		lp.loginButton();
	}
	
	@Test(priority=5)
	@When("^non added user ties to access a private contact$")
	public void non_added_user_ties_to_access_a_private_contact() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		ContactModulePOM cm = PageFactory.initElements(driver, ContactModulePOM.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Contacts')]")));
		cm.contactModule();
	}
    
	@Test(priority=6)
	@Then("^user should not be able to view the contact$")
	public void user_should_not_be_able_to_view_access_edit_delete_the_contact() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")));
		String contact1 = driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")).getText();
		String contact2 = driver.findElement(By.cssSelector("tbody tr:nth-child(2) td:nth-child(2) a:nth-child(1)")).getText();
		String contact3 = driver.findElement(By.cssSelector("tbody tr:nth-child(3) td:nth-child(2) a:nth-child(1)")).getText();
		Assert.assertNotEquals(contact1, "Madhavi latha");
		Assert.assertNotEquals(contact2, "Madhavi latha");
		Assert.assertNotEquals(contact3, "Madhavi latha");
	   
	}
	
	@Test(priority=7)
	@Given("^user logs into the page$")
	public void user_logs_into_the_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium software\\chromedriver_win32 (1)\\chromedriver.exe");// To open Chrome through driver.
		driver = new ChromeDriver();// to create a object to use methods in the interface that are not
									// overidden and overidden methods in chrome drive
		driver.get("https://ui.cogmento.com/");// To open the website
		driver.manage().window().maximize();// To max the browser.
		WebDriverWait wait = new WebDriverWait(driver, 30);
		LoginPagePOM lp = PageFactory.initElements(driver, LoginPagePOM.class);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("email")));
		lp.inputEmail("jalalikrishna@gmail.com");
		lp.inputPassword("Capgemini");
		lp.loginButton();

	}
	@Test(priority=8)
	@When("^user ties to access a public contact$")
	public void user_ties_to_access_a_public_contact() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		ContactModulePOM cm = PageFactory.initElements(driver, ContactModulePOM.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Contacts')]")));
		cm.contactModule();
	 
	}
    
	@Test(priority=9)
	@Then("^all user should be able to view/access/edit/delete the contact$")
	public void all_user_should_be_able_to_view_access_edit_delete_the_contact() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		ContactModulePOM cm = PageFactory.initElements(driver, ContactModulePOM.class);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Manoj Mummidi")));
		assert driver.findElement(By.linkText("Manoj Mummidi")).isDisplayed();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Manoj Mummidi")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(text(),'Middle Name(s)')]")));
    	assert driver.findElement(By.xpath("//div[contains(text(),'Middle Name(s)')]")).isDisplayed();
    	driver.findElement(By.xpath("//button[@class='ui icon button']//i[@class='edit icon']")).click();
    	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//label[normalize-space()='First Name']")));
    	assert driver.findElement(By.xpath("//label[normalize-space()='First Name']")).isDisplayed();
    	cm.cancelButtonCreate();
    	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//i[@class='trash icon']")));
    	driver.findElement(By.xpath("//i[@class='trash icon']")).click();
    	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[normalize-space()='Delete']")));
    	assert driver.findElement(By.xpath("//button[normalize-space()='Delete']")).isDisplayed();
	  
	}
	@After
	public void browserClose() {
		if(this.driver!=null)
		   driver.close();
	}
}
