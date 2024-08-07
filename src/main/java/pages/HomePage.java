package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
		js = (JavascriptExecutor) driver;
		action = new Actions(driver);
	}
	
	// Different annotation for the driver.findby method
	@FindBy(xpath = "//a[@class='ico-register']")
	WebElement registerLink;
	@FindBy(xpath = "//a[@class='ico-login']")
	WebElement loginLink;
	@FindBy(xpath = "//a[@href='/contactus']")
	WebElement contactUsBtn;
	@FindBy(xpath = "//select[@id='customerCurrency']")
	public WebElement currencyList;	
	@FindBy(xpath = "//span[@id='price-value-4']")
	public WebElement productPriceLbl;
	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]")
	WebElement computersMenu;
	@FindBy(linkText = "Notebooks")
	WebElement notebooksMenu;
	@FindBy(xpath = "//h1[contains(text(),'Notebooks')]")
	public WebElement notebookHeadLine;
	public void openRegisterationPage () {
		clickBtn(registerLink);
	}
	
	public void openLoginpage() {
		clickBtn(loginLink);
	}
	
	public void openContactUsPage() {
		scrollToBtn();
		clickBtn(contactUsBtn);
	}
	
	public void changeCurrency() {
		sel = new Select(currencyList);
		sel.selectByIndex(1);
	}
	
	public void SelectNotebooksMenu() {
		// Simulating mouse movement
		//action.moveToElement(computersMenu).moveToElement(notebooksMenu).build().perform(); --> This one did not work, I don't know why
		action.moveToElement(computersMenu).build().perform();
		clickBtn(notebooksMenu);
	}
}
