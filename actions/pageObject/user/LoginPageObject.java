package pageObject.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.user.LoginPageUI;

public class LoginPageObject extends BasePage {
	WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;

	}

	public void inputToEmailAddressTextbox(String emailAddres) {
		waitForElementVisible(driver, LoginPageUI.EMAIL_ADDRESS_TEXTBOX);
		senkeyToElement(driver, LoginPageUI.EMAIL_ADDRESS_TEXTBOX, emailAddres);

	}

	public void inputToPasswordTextbox(String password) {
		waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
		senkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, password);
	}

	public MyDashboardPageObject clickToLoginButton() {
		waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
		return new MyDashboardPageObject(driver);

	}

	public String getEmailAdressEmptyErrorMessage() {
		waitForElementVisible(driver, LoginPageUI.EMAIL_ADDRESS_EMPTY_ERROR_MESSAGE);
		return getElementText(driver, LoginPageUI.EMAIL_ADDRESS_EMPTY_ERROR_MESSAGE);
	}

	public String getPasswordEmptyErrorMessage() {
		waitForElementVisible(driver, LoginPageUI.PASSWORD_EMPTY_ERROR_MESSAGE);
		return getElementText(driver, LoginPageUI.PASSWORD_EMPTY_ERROR_MESSAGE);
	}

	public String getEmailAdressInvalidErrorMessage() {
		waitForElementVisible(driver, LoginPageUI.EMAIL_ADDRESS_INVALID_ERROR_MESSAGE);
		return getElementText(driver, LoginPageUI.EMAIL_ADDRESS_INVALID_ERROR_MESSAGE);
	}

	public String getPasswordInvalidErrorMessage() {
		waitForElementVisible(driver, LoginPageUI.PASSWORD_INVALID_ERROR_MESSAGE);
		return getElementText(driver, LoginPageUI.PASSWORD_INVALID_ERROR_MESSAGE);
	}

	public String getEmailAdressOrPasswordIncorrectErrorMessage() {
		waitForElementVisible(driver, LoginPageUI.EMAIL_ADDRESS_OR_PASSWORD_INCORRECT_ERROR_MASSAGE);
		return getElementText(driver, LoginPageUI.EMAIL_ADDRESS_OR_PASSWORD_INCORRECT_ERROR_MASSAGE);
	}

}
