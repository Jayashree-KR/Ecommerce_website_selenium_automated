package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBase {

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "strong.current-item")
    public WebElement productNameBreadCrumb;
    
    // Fixed XPath with escaped double quotes
    @FindBy(xpath = "//button[@class='button-2 email-a-friend-button']")
    public WebElement emailFriendBtn;
    
    // Fixed XPath with escaped double quotes
    @FindBy(xpath = "//a[@href='#addreview']")
    public WebElement addReviewLink;
    
    @FindBy(xpath = "//*[@id='add-to-wishlist-button-5']")
    public WebElement addToWishListBtn;
    
    @FindBy(xpath = "//a[@class='ico-wishlist']")
    public WebElement wishListLink;
    
    @FindBy(xpath = "//button[contains(@class, 'add-to-compare-list-button')]")
    WebElement addToCompareBtn;
    
    @FindBy(xpath = "//a[contains(text(),'product comparison')]")
    public WebElement addToCompareLink;
    
    @FindBy(id = "add-to-cart-button-5")
    WebElement addToCartBtn;
    
    // Fixed XPath with escaped double quotes
    @FindBy(xpath = "//*[@id='topcartlink']/a/span[1]")
    public WebElement shoppingCartLink;

    public void openSendEmail() {
        clickBtn(emailFriendBtn);
    }
    
    public void openReviewPage() {
        clickBtn(addReviewLink);
    }
    
    public void wishListPage() {
        clickBtn(addToWishListBtn);
        clickBtn(wishListLink);
    }
    
    public void AddToCompare() {
        clickBtn(addToCompareBtn);
    }
    
    public void GoToComparePage() {
        clickBtn(addToCompareLink);
    }
    
    public void AddProductToCart() {
        clickBtn(addToCartBtn);
    }
    
    public void GoToShoppingCartPage() {
        clickBtn(shoppingCartLink);
    }
}
