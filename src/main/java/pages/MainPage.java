package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.WaitUtils;

public class MainPage extends AbstractPage {

	// links
	@FindBy(linkText = "MP3 Players")
	private WebElement linkMP3Players;

	@FindBy(linkText = "Show All MP3 Players")
	private WebElement linkAllMP3Players;

	// buttons
	@FindBy(id = "list-view")
	public WebElement buttonListView;

	@FindBy(css = "#content > div > div.col-sm-4 > div.btn-group > button:nth-child(1)")
	public WebElement buttonAddToWishList;

	
	@FindBy(css = "#product-product > div.alert.alert-success.alert-dismissible")
	public WebElement wishListMessage;
	
	public MainPage(WebDriver driver) {
		super(driver);

	}

	public void clickLinkMP3Players() {
		linkMP3Players.click();
	}

	public void clickAllLinkMP3Players() {
		linkAllMP3Players.click();
	}

	public void clickListView() {
		buttonListView.click();
	}


	public String searchProductNameFromListView(String productName) {
		return driver.findElement(By.linkText(productName)).getText();
//		WaitUtils.waitForJS(driver);
	}
	public void clickFoundProductName(String productName) {
		driver.findElement(By.linkText(productName)).click();
//	WaitUtils.waitForJS(driver);
	}

	public void clickAddToWishList() {
		buttonAddToWishList.click();
	}
	public String addToWishListMessage() {
		return wishListMessage.getText();
	}
}
