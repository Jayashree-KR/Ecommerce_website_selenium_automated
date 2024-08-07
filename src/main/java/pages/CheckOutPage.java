package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutPage extends PageBase {

	public CheckOutPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//button[@class='button-1 checkout-as-guest-button']")
	private WebElement guestBtn;
	@FindBy(xpath = "//*[@id='BillingNewAddress_FirstName']")
	private WebElement fnTxt;
	@FindBy(xpath = "//*[@id='BillingNewAddress_LastName']")
	private WebElement lnTxt;
	@FindBy(xpath = "//*[@id='BillingNewAddress_Email']")
	private WebElement emailTxt;
	@FindBy(xpath = "//*[@id='BillingNewAddress_CountryId']")
	private WebElement countryList;
	@FindBy(xpath = "//*[@id='BillingNewAddress_PhoneNumber']")
	private WebElement phoneTxt;
	@FindBy(xpath = "//*[@id='BillingNewAddress_City']")
	private WebElement cityTxt;
	@FindBy(xpath = "//*[@id='BillingNewAddress_Address1']")
	private WebElement addressTxt;
	@FindBy(xpath = "//*[@id='BillingNewAddress_ZipPostalCode']")
	private WebElement postCodeTxt;
	@FindBy(xpath = "//*[@id='billing-buttons-container']/button[2]")
	private WebElement continueBtn;
	@FindBy(xpath = "//*[@id='shippingoption_1']")
	private WebElement shippingMethodRdo;
	@FindBy(xpath = "//*[@id='shipping-method-buttons-container']/button")
	private WebElement continueShippingBtn;
	@FindBy(xpath = "//*[@id='payment-method-buttons-container']/button")
	private WebElement continuePaymentBtn;
	@FindBy(xpath = "//*[@id='payment-info-buttons-container']/button")
	private WebElement continueInfoBtn;
	@FindBy(css = "a.product-name")
	public WebElement prodcutName;
	@FindBy(xpath = "//*[@id='confirm-order-buttons-container']/button")
	private WebElement confirmBtn;
	@FindBy(css = "h1")
	public WebElement ThankYoulbl;
	@FindBy(css = "div.title")
	private WebElement orderCompleteMsg;
	@FindBy(linkText = "Click here for order details.")
	private WebElement orderDetailsLink;

	public void RegisteredUserChecksoutProduct(String countryName, String address, String postcode, String phone, 
			String city, String productName) throws InterruptedException {
		sel = new Select(countryList);
		sel.selectByVisibleText(countryName);
		setText(cityTxt, city);
		setText(addressTxt, address);
		setText(postCodeTxt, postcode);
		setText(phoneTxt, phone);
		clickBtn(continueBtn);
		clickBtn(shippingMethodRdo);
		clickBtn(continueShippingBtn);
		// Wait for the acordeon panel
		Thread.sleep(1000);
		clickBtn(continuePaymentBtn);
		Thread.sleep(1000);
		clickBtn(continueInfoBtn);
	}

	public void confirmOrder() throws InterruptedException {
		Thread.sleep(1000);
		clickBtn(confirmBtn);
		Thread.sleep(1000);
	}

	public void viewOrderDetails() {
		clickBtn(orderDetailsLink);
	}

	public void CheckoutProduct(String firstName, String lastName, String countryName, String email, String address,
			String postcode, String phone, String city, String productName) throws InterruptedException {
		setText(fnTxt, firstName);
		setText(lnTxt, lastName);
		setText(emailTxt, email);
		sel = new Select(countryList);
		sel.selectByVisibleText(countryName);
		setText(cityTxt, city);
		setText(addressTxt, address);
		setText(postCodeTxt, postcode);
		setText(phoneTxt, phone);
		clickBtn(continueBtn);
		clickBtn(shippingMethodRdo);
		clickBtn(continueShippingBtn);
		Thread.sleep(2000);
		clickBtn(continuePaymentBtn);
		Thread.sleep(2000);
		clickBtn(continueInfoBtn);
	}
}
