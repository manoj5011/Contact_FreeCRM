package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactModulePOM {
	WebDriver driver;
	@FindBy(xpath = "//span[contains(text(),'Contacts')]")
	WebElement contactModule;
	@FindBy(xpath = "//button[normalize-space()='Create']")
	WebElement createButton;
	@FindBy(name = "first_name")
	WebElement firstNameField;
	@FindBy(name = "last_name")
	WebElement lastNameField;
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveButton;
	@FindBy(linkText ="ram sai")
	WebElement contactCheck;
	@FindBy(xpath = "//input[@placeholder='Email address']")
	WebElement emailField;
	@FindBy(xpath = "//input[@placeholder='Number']")
	WebElement phoneNoField;
	@FindBy(xpath = "//div[@name='hint']//input[@type='text']")
	WebElement phoneNoCountry;
	@FindBy(xpath = "//input[@placeholder='Street Address']")
	WebElement addressStreetField;
	@FindBy(xpath = "//input[@placeholder='City']")
	WebElement addressCityField;
	@FindBy(xpath = "//input[@placeholder='State / County']")
	WebElement addressStateField;
	@FindBy(xpath = "//input[@placeholder='Post Code']")
	WebElement addressCodeField;
	@FindBy(xpath = "//div[@name='country']")
	WebElement addressCountryField;
	@FindBy(xpath = "//input[@placeholder='Day']")
	WebElement birthdayDayField;
	@FindBy(xpath = "//div[@name='month']")
	WebElement birthdayMonthField;
	@FindBy(xpath = "//input[@placeholder='Year']")
	WebElement birthdayYearField;
	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	WebElement cancelButtonCreate;
	@FindBy(xpath = "//tbody/tr[3]/td[8]/a[2]/button[1]")
	WebElement editButton;
	@FindBy(xpath = "//tbody/tr[2]/td[8]/div[1]/button[1]")
	WebElement deleteButton;
	@FindBy(xpath = "//button[normalize-space()='Delete']")
	WebElement deleteButtonAlert;
	@FindBy(xpath = "//tbody/tr[2]/td[1]/div[1]/label[1]")
	WebElement checkBox2;
	@FindBy(xpath = "//tbody/tr[3]/td[1]/div[1]/label[1]")
	WebElement checkBox3;
	@FindBy(xpath = "//div[@name='action']")
	WebElement actions;
	@FindBy(xpath = "//div[@role='button']")
	WebElement actionsSelect;
	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	WebElement cancelDeleteAlert;
	@FindBy(xpath = "//button[normalize-space()='OK']")
	WebElement OkButton;
	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	WebElement CancelButton;
	@FindBy(xpath = "//button[contains(text(),'Show Filters')]")
	WebElement ShowFilterButton;
	@FindBy(css="input[class='search']")
	WebElement searchFilter;
	@FindBy(name="operator")
	WebElement filterOpertator;
	@FindBy(xpath="//input[@placeholder='Value']")
	WebElement filterValue;
	@FindBy(xpath="//button[5]")
	WebElement filterSearch;
	@FindBy(xpath="//div[@class='ui fluid container main-content']//button[2]")
	WebElement filterClear;
	@FindBy(xpath="//button[normalize-space()='Add Filter Row']")
	WebElement filterAddButton;
	@FindBy(xpath="//button[@class='ui basic button item']")
	WebElement recoveryBinButton;
	@FindBy(xpath="//a[normalize-space()='Contact (3)']")
	WebElement recoveryBinContactButton;
	@FindBy(xpath="//th[@class='collapsing']//label")
	WebElement recoveryBinCheckBoxAll;
	@FindBy(xpath="//tbody/tr[1]/td[1]/div[1]/label[1]")
	WebElement recoveryBinCheckBoxFirst;
	@FindBy(xpath="///button[normalize-space()='Restore Selected']")
	WebElement restoreSelectedButton;
		
	public ContactModulePOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void firstName(String fn) {
		firstNameField.sendKeys(fn);
	}

	public void lastName(String ln) {
		lastNameField.sendKeys(ln);
	}
	public void createButton() {
		createButton.click();
	}
	public void saveButton() {
		saveButton.click();
	}
	public void contactModule() {
		contactModule.click();
	}
	public boolean contactCheck() {
	return	contactCheck.isDisplayed();
	}
	public void emailField(String ef) {
		emailField.sendKeys(ef);
	}
	public void phoneNoField(String pf) {
		phoneNoField.sendKeys(pf);
	}
	public void phoneNoCountry(String pc) {
		Select sel=new Select(phoneNoCountry);
		sel.selectByVisibleText(pc);
	}
	public void addressCityField(String ac) {
		addressCityField.sendKeys(ac);
	}
	public void addressStreetField(String as) {
		addressStreetField.sendKeys(as);
	}
	public void addressStateField(String ast) {
		addressStateField.sendKeys(ast);
	}
	public void addressCodeField(String acod) {
		addressCodeField.sendKeys(acod);
	}
	public void addressCountryField(String acon) {
		Select sel=new Select(addressCountryField);
		sel.selectByVisibleText(acon);
	}
	public void birthdayDayField(String bd) {
		birthdayDayField.sendKeys(bd);
	}
	public void birthdayMonthField(String bm) {
		birthdayMonthField.sendKeys(bm);
	}
	public void birthdayYearField(String by) {
		birthdayYearField.sendKeys(by);
	}
	public void cancelButtonCreate() {
		cancelButtonCreate.click();
	}
	public void editButton() {
		editButton.click();
	}
	public void deleteButton() {
		deleteButton.click();
	}
	public void checkBox2() {
		checkBox2.click();
	}
	public void checkBox3() {
		checkBox3.click();
	}
	public void deleteButtonAlert() {
		deleteButtonAlert.click();
	}
	public void actions(String a) {
		Select sel=new Select(actions);
		sel.selectByVisibleText(a);
	}
	public void actionsSelect() {
		actionsSelect.click();
	}
	public void cancelDeleteAlert() {
		cancelDeleteAlert.click();
	}
	public void OkButton() {
		OkButton.click();
	}
	public void CancelButton() {
		CancelButton.click();
	}
	public void ShowFilterButton() {
		ShowFilterButton.click();
	}
	public void searchFilter(String sf) {
		Select sel=new Select(searchFilter);
		sel.selectByVisibleText(sf);
	}
	public void filterOpertator(String fo) {
		Select sel=new Select(filterOpertator);
		sel.selectByVisibleText(fo);
	}
	public void filterValue() {
		filterValue.click();
	}
	public void filterSearch() {
		filterSearch.click();
	}
	public void filterClear() {
		filterClear.click();
	}
	public void filterAddButton() {
		filterAddButton.click();
	}
	public void recoveryBinButton() {
		recoveryBinButton.click();
	}
	public void recoveryBinContactButton() {
		recoveryBinContactButton.click();
	}
	public void recoveryBinCheckBoxAll() {
		recoveryBinCheckBoxAll.click();
	}
	public void recoveryBinCheckBoxFirst() {
		recoveryBinCheckBoxFirst.click();
	}
	public void restoreSelectedButton() {
		restoreSelectedButton.click();
	} 
}
