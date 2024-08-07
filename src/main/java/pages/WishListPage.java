package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends PageBase {

	public WishListPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*[@id='main']/div/div/div/div[2]/div[1]/form/div[1]/table/tbody/tr/td[8]/button")
	WebElement removeBox;
	//@FindBy(xpath = "//*[@id='updatecart']")
	//WebElement updateWishListBtn;
	@FindBy(xpath = "//div[@class='no-data']")
	public WebElement updatedWishListMsg;
	
	public void RemoveItem() {
		clickBtn(removeBox);
		//clickBtn(updateWishListBtn);
	}

}
