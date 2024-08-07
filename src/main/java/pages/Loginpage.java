package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends PageBase{

	public Loginpage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id='Email']")
	WebElement emailBoxLogin;
	@FindBy(xpath = "//*[@id='Password']")
	WebElement passwordBoxLogin;
	@FindBy(xpath = "//button[@type='submit' and @class='button-1 login-button']")
	WebElement loginBtn;
	
	public void userLogin(String email, String password) {
		setText(emailBoxLogin, email);
		setText(passwordBoxLogin, password);
		clickBtn(loginBtn);
	}
}
