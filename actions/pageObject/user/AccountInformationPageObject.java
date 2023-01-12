package pageObject.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.user.AccountInformationPageUI;

public class AccountInformationPageObject extends BasePage {
	WebDriver driver;

	public AccountInformationPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void enterToFirstNameTextbox(String firstName) {
		waitForElementVisible(driver, AccountInformationPageUI.FIRSTNAME_TEXTBOX);
		senkeyToElement(driver, AccountInformationPageUI.FIRSTNAME_TEXTBOX, firstName);

	}

	public void enterToLastNameTextbox(String lastName) {
		waitForElementVisible(driver, AccountInformationPageUI.LASTNAME_TEXTBOX);
		senkeyToElement(driver, AccountInformationPageUI.LASTNAME_TEXTBOX, lastName);

	}

	public void enterToEmailAddressTextbox(String emailAddress) {
		waitForElementVisible(driver, AccountInformationPageUI.EMAIL_ADDRESS_TEXTBOX);
		senkeyToElement(driver, AccountInformationPageUI.EMAIL_ADDRESS_TEXTBOX, emailAddress);

	}

	public void enterToPasswordTextbox(String password) {
		waitForElementVisible(driver, AccountInformationPageUI.PASSWORD_TEXTBOX);
		senkeyToElement(driver, AccountInformationPageUI.PASSWORD_TEXTBOX, password);

	}

	public MyDashboardPageObject clickToSaveButton() {
		waitForElementClickable(driver, AccountInformationPageUI.SAVE_BUTTON);
		clickToElement(driver, AccountInformationPageUI.SAVE_BUTTON);
		return PageGeneratorManager.getDashboardPage(driver);
	}

}
