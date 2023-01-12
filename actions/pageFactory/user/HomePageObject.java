package pageFactory.user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject extends BasePageFactory {

	WebDriver driver;

	public HomePageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Cách định nghĩa 1 element(1)
	@FindBy(xpath = "//div[@class='footer']//a[@title='My Account']")
	WebElement myAccountLink;

//	public static final String MY_ACCOUNT_LINK = "//div[@class='footer']//a[@title='My Account']";

	public void clickToMyAccountLink() {
		waitForElementClickable(driver, myAccountLink);
		clickToElement(driver, myAccountLink);
	}

}
