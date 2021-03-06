package StepDefinition;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import POM.ContactModulePOM;
import POM.LoginPagePOM;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateContact {
	WebDriver driver;
	/**
	 * @throws Throwable
	 * To set the chrome driver and to open the web page.
	 */
	@Test
	@Given("^user navigates to the login page$")
	public void user_navigates_to_the_login_page() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium software\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();// to create a object to use methods in the interface that are not
									// overridden and overridden methods in chrome drive
		driver.get("https://ui.cogmento.com/");
		driver.manage().window().maximize();// To max the size of browser.
	}

	/**
	 * @throws Throwable
	 * To login the web page with email and password.
	 */
	@Test
	@When("^user enters username and password in the fields$")
	public void user_enters_username_and_password_in_the_fields() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		LoginPagePOM lp = PageFactory.initElements(driver, LoginPagePOM.class);//Created an object for loginPagePom class. 
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("email")));//Added wait in order to ensure that the page loads and email field is visible. 
		lp.inputEmail("saisiddarthmanoj@gmail.com"); 
		lp.inputPassword("Manoj1999");
		lp.loginButton();

	}

	/**
	 * @throws Throwable
	 * Asserts if the login has been done or not.
	 */
	@Test
	@Then("^user should login and should be on home page$")
	public void user_should_login_and_should_be_on_home_page() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);//Created an object for implicit wait. A implicit wait of 30 seconds is given.
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Contacts')]")));
		assert driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).isDisplayed();
	}

	/**
	 * @throws Throwable
	 * Created contact with first name, last name and clicked on save.
	 */
	@Test(priority = 1)
	@When("^user enters first name, last name and clicks on save$")
	public void user_enters_first_name_last_name_and_clicks_on_save() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		ContactModulePOM cm = PageFactory.initElements(driver, ContactModulePOM.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Contacts')]")));
		cm.contactModule();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Create']")));
		cm.createButton();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("first_name")));
		cm.firstName("gopal");
		cm.lastName("Krishna");
		cm.saveButton();
		Thread.sleep(5000);
		cm.contactModule();
	}

	/**
	 * @throws Throwable
	 * Asserts if the created contact done by using above method
	 * is visible on the contact dash board or not. 
	 */
	@Test(priority = 2)
	@Then("^user should see the contact on the dashboard$")
	public void user_should_see_the_contact_on_the_dashboard() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("gopal Krishna")));
		assert driver.findElement(By.linkText("gopal Krishna")).isDisplayed();
		
	}

	/**
	 * @param firstname
	 * @throws Throwable
	 * Tried to create a contact by entering on one of the required field and clicked on save.
	 */
	@Test(priority = 3)
	@When("^user user enters ([^\\\"]*) and clicks on save$")
	public void user_user_enters_first_name_and_clicks_on_save(String firstname) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		ContactModulePOM cm = PageFactory.initElements(driver, ContactModulePOM.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Contacts')]")));
		cm.contactModule();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Create']")));
		cm.createButton();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("first_name")));
		cm.firstName(firstname);
		cm.saveButton();
	}

	/**
	 * @throws Throwable
	 * Asserts if a contact can be created by only entering one required field.
	 */
	@Test(priority = 4)
	@Then("^user should see see a error message$")
	public void user_should_see_see_a_error_message() throws Throwable {
		assert driver.findElement(By.xpath("//span[contains(text(),'The field Last Name is required')]")).isDisplayed();
		
	}

	/**
	 * @throws Throwable
	 * Tried to create a contact with valid details like name, email, address, phone number, birthday.
	 * Data here is imported from the xlsx file using Apache POI.
	 */
	@Test(priority = 5)
	@When("^user enters valid first name,last name,email id,phone number,address_street,address_city,address_state,address_code,address_country,birthday_day,birthday_month,birthday_year and click on save$")
	public void user_enters_valid_first_name_last_name_email_id_phone_number_address_street_address_city_address_state_address_code_address_country_birthday_day_birthday_month_birthday_year_and_click_on_save()
			throws Throwable {
		File cred = new File(
				"D:\\capG_projects\\Contact_FreeCRM\\FreeCrm\\src\\test\\resources\\CreateContactxlss\\validData.xlsx");
		FileInputStream fis = new FileInputStream(cred);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);

		int rowcount = sheet1.getLastRowNum();

		for (int i = 0; i <= rowcount; i++) {
			String firstName = sheet1.getRow(i).getCell(0).getStringCellValue();
			String lastName = sheet1.getRow(i).getCell(1).getStringCellValue();
			String emailId = sheet1.getRow(i).getCell(2).getStringCellValue();
			double phoneNo = sheet1.getRow(i).getCell(3).getNumericCellValue();
			String phoneNumber = Double.toString(phoneNo);
			String phoneNumberUpdated = phoneNumber.substring(0, 11);
			String addressStreet = sheet1.getRow(i).getCell(4).getStringCellValue();
			String addressCity = sheet1.getRow(i).getCell(5).getStringCellValue();
			String addressState = sheet1.getRow(i).getCell(6).getStringCellValue();
			double addressCode = sheet1.getRow(i).getCell(7).getNumericCellValue();
			String addressCodestring = Double.toString(addressCode);
			String addresscodeUpdated = addressCodestring.substring(0, 6);
			String addressCountry = sheet1.getRow(i).getCell(8).getStringCellValue();
			double birthdayDay = sheet1.getRow(i).getCell(9).getNumericCellValue();
			String birthdayDayString = Double.toString(birthdayDay);
			String birthdayDayUpdated = birthdayDayString.substring(0, 1);
			String birthdayMonth = sheet1.getRow(i).getCell(10).getStringCellValue();
			double birthdayYear = sheet1.getRow(i).getCell(11).getNumericCellValue();
			String birthdayYearString = Double.toString(birthdayYear);
			String birthdayYearUpdated = birthdayYearString.substring(0, 4);

			WebDriverWait wait = new WebDriverWait(driver, 40);
			ContactModulePOM cm = PageFactory.initElements(driver, ContactModulePOM.class);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Contacts')]")));
			cm.contactModule();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Create']")));
			cm.createButton();
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("first_name")));
			cm.firstName(firstName);
			cm.lastName(lastName);
			cm.emailField(emailId);
			cm.phoneNoCountry(addressCountry);
			driver.findElement(By.xpath("//input[@placeholder='Number']")).sendKeys(phoneNumberUpdated);
			cm.addressStreetField(addressStreet);
			cm.addressCityField(addressCity);
			cm.addressStateField(addressState);
			driver.findElement(By.xpath("//input[@placeholder='Post Code']")).sendKeys(addresscodeUpdated);
			cm.birthdayDayField(birthdayDayUpdated);
			cm.birthdayMonthField();
			wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("//span[normalize-space()='" + birthdayMonth + "']")));
			driver.findElement(By.xpath("//span[normalize-space()='" + birthdayMonth + "']")).click();//Dynamic xpath is used as the input months may change.  
			cm.birthdayYearField(birthdayYearUpdated);
			cm.saveButton();
			Thread.sleep(5000);
			cm.contactModule();

		}
	}

	/**
	 * @throws Throwable
	 * Assets if a contact is being created by valid data or not.
	 */
	@Test(priority = 6)
	@Then("^user should see the contact on the contacts dashboard$")
	public void user_should_see_the_contact_on_the_contacts_dashboard() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Siddarth Sai")));
		assert driver.findElement(By.linkText("Siddarth Sai")).isDisplayed();
		assert driver.findElement(By.linkText("Manoj Mummidi")).isDisplayed();
		

	}

	/**
	 * @throws Throwable
	 * Tried to create a contact with invalid details like name, email, address, phone number, birthday.
	 */
	@Test(priority = 7)
	@When("^user enters invalid first name,last name,email id,phone number,address_street,address_city,address_state,address_code,address_country,birthday_day,birthday_month,birthday_year and click on save$")
	public void user_enters_invalid_first_name_last_name_email_id_phone_number_address_street_address_city_address_state_address_code_address_country_birthday_day_birthday_month_birthday_year_and_click_on_save()
			throws Throwable {
		String Month = "March";
		WebDriverWait wait = new WebDriverWait(driver, 40);
		ContactModulePOM cm = PageFactory.initElements(driver, ContactModulePOM.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Contacts')]")));
		cm.contactModule();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Create']")));
		cm.createButton();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("first_name")));
		cm.firstName("12345");
		cm.lastName("$575^%%$#");
		cm.emailField("saimanoj");
		cm.phoneNoField("1234");
		cm.addressStreetField("$%#%");
		cm.addressCityField("*9765");
		cm.addressStateField("+_987hs");
		cm.birthdayDayField("e");
		cm.birthdayMonthField();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='" + Month + "']")));
		driver.findElement(By.xpath("//span[normalize-space()='" + Month + "']")).click();
		cm.birthdayYearField("1234567");
		cm.saveButton();
		Thread.sleep(5000);
		cm.contactModule();

	}

	/**
	 * @throws Throwable
	 * Assets if a contact is being created by invalid data or not.
	 */
	@Test(priority = 8)
	@Then("^user should not see the contact on the contacts dashboard$")
	public void user_should_not_see_the_contact_on_the_contacts_dashboard() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("12345 $575^%%$#")));
		String text = driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)"))
				.getText();
		System.out.println(text);
		Assert.assertNotEquals(text, "12345 $575^%%$#");
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param birthdayDay
	 * @param birthdayMonth
	 * @param birthdayYear
	 * @throws Throwable
	 * Tries to create a contact by giving the data and then clicks on cancel.
	 * Data is taken from scenario outline examples.
	 */
	@Test(priority = 9)
	@When("^user gives data ([^\\\"]*),([^\\\"]*),([^\\\"]*),([^\\\"]*),([^\\\"]*),([^\\\"]*) and clicks on cancel$")
	public void user_gives_data_first_name_last_name_email_birthday_day_birthday_month_birthday_year_and_clicks_on_cancel(
			String firstName, String lastName, String email, String birthdayDay, String birthdayMonth,
			String birthdayYear) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		ContactModulePOM cm = PageFactory.initElements(driver, ContactModulePOM.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Contacts')]")));
		cm.contactModule();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Create']")));
		cm.createButton();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("first_name")));
		cm.firstName(firstName);
		cm.lastName(lastName);
		cm.emailField(email);
		cm.birthdayDayField(birthdayDay);
		cm.birthdayMonthField();
		if (birthdayMonth == "January" || birthdayMonth == "February" || birthdayMonth == "March"
				|| birthdayMonth == "April" || birthdayMonth == "May" || birthdayMonth == "June"
				|| birthdayMonth == "July" || birthdayMonth == "August" || birthdayMonth == "September"
				|| birthdayMonth == "October" || birthdayMonth == "November" || birthdayMonth == "December") {//If condition is added to ensure that it doesn't run when birthday month is empty.
			wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("//span[normalize-space()='" + birthdayMonth + "']")));
			driver.findElement(By.xpath("//span[normalize-space()='" + birthdayMonth + "']")).click();
		}
		cm.birthdayYearField(birthdayYear);
		cm.cancelButtonCreate();
	}

	/**
	 * @throws Throwable
	 * Asserts if a contact is being created after entering the data and clicks on cancel.
	 */
	@Test(priority = 10)
	@Then("^user should not see the contacts$")
	public void user_should_not_see_the_contacts() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(
				ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[normalize-space()='Create']")));
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://ui.cogmento.com/contacts");
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)")));
		String text = driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(2) a:nth-child(1)"))
				.getText();
		Assert.assertNotEquals(text, "Ram Sai");
		Assert.assertNotEquals(text, "Mounika Mummidi");
		Assert.assertNotEquals(text, "   ");
	}
	/**
	 * To close the browser after each scenario
	 */
	@After
	public void browserClose() {
		if(this.driver!=null)//if condition is added to ensure that after does not run when this feature file is not called.
		driver.close();
	}
}
