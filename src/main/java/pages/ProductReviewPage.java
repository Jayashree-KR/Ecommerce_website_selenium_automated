package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductReviewPage extends PageBase {

	public ProductReviewPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id='AddProductReview_Title']")
	WebElement reviewTitleBox;
	@FindBy(xpath = "//*[@id='AddProductReview_ReviewText']")
	WebElement reviewMsgBox;
	@FindBy(id = "addproductrating_4")
	WebElement ratingRadioBtn;
	@FindBy(xpath = "//*[@id='add-review']")
	WebElement submitReviewBtn;
	@FindBy(xpath = "//*[@id='bar-notification']/div")
	public WebElement successReviewMsg;
	
	public void AddProductReview(String review, String reviewsMsg) {
		setText(reviewTitleBox, reviewsMsg);
		setText(reviewMsgBox, reviewsMsg);
		clickBtn(ratingRadioBtn);
		clickBtn(submitReviewBtn);
	}
}
