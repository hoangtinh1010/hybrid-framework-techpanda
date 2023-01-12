package pageFactory.user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject extends BasePageFactory {
	WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "email")
	WebElement emailAddressTextbox;

	@FindBy(id = "pass")
	WebElement passwordTexbox;

	@FindBy(id = "send2")
	WebElement loginButton;

	@FindBy(css = "advice-required-entry-email")
	WebElement emailAddressEmptyErrorMessage;

	@FindBy(css = "advice-validate-email-email")
	WebElement emailAddressInvalidErrorMessage;

	@FindBy(css = "advice-required-entry-pass")
	WebElement passwordEmptyErrorMessage;

	@FindBy(css = "advice-validate-password-pass")
	WebElement passwordInvalidErrorMessage;

	@FindBy(xpath = "//li[@class='error-msg']//span")
	WebElement emailAddressOrPasswordIncorrectErrorMassage;

	public void inputToEmailAddressTextbox(String emailAddres) {
		waitForElementVisible(driver, emailAddressTextbox);
		senkeyToElement(driver, emailAddressTextbox, emailAddres);

	}

	public void inputToPasswordTextbox(String password) {
		waitForElementVisible(driver, passwordTexbox);
		senkeyToElement(driver, passwordTexbox, password);
	}

	public void clickToLoginButton() {
		waitForElementClickable(driver, loginButton);
		clickToElement(driver, loginButton);

	}

	public String getEmailAdressEmptyErrorMessage() {
		waitForElementVisible(driver, emailAddressEmptyErrorMessage);
		return getElementText(driver, emailAddressEmptyErrorMessage);
	}

	public String getPasswordEmptyErrorMessage() {
		waitForElementVisible(driver, passwordEmptyErrorMessage);
		return getElementText(driver, passwordEmptyErrorMessage);
	}

	public String getEmailAddressOrPasswordIncorrectErrorMessage() {
		waitForElementVisible(driver, emailAddressOrPasswordIncorrectErrorMassage);
		return getElementText(driver, emailAddressOrPasswordIncorrectErrorMassage);
	}

	public String getEmailAdressInvalidErrorMessage() {
		waitForElementVisible(driver, emailAddressInvalidErrorMessage);
		return getElementText(driver, emailAddressInvalidErrorMessage);
	}

	public String getPasswordInvalidErrorMessage() {
		waitForElementVisible(driver, passwordInvalidErrorMessage);
		return getElementText(driver, passwordInvalidErrorMessage);
	}

}