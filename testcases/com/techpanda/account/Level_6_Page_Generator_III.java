package com.techpanda.account;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObject.user.AccountInformationPageObject;
import pageObject.user.HomePageObject;
import pageObject.user.LoginPageObject;
import pageObject.user.MyDashboardPageObject;
import pageObject.user.PageGeneratorManager;

@Test
public class Level_6_Page_Generator_III extends BaseTest {

	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	HomePageObject homePage;
	LoginPageObject loginPage;
	MyDashboardPageObject myDashboardPage;
	AccountInformationPageObject accountInformationPage;

	@Parameters({ "browser" })
	@BeforeClass // Chạy trước cho testcase đầu tiên
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);
		homePage = PageGeneratorManager.getHomePage(driver);

	}

	@Test
	public void Login_01_Empty_Email_And_Password() {
		// HomePage -> click vào My Account Link - Qua trang LoginPage
		loginPage = homePage.clickToMyAccountLink();

		loginPage.inputToEmailAddressTextbox("");
		loginPage.inputToPasswordTextbox("");
		loginPage.clickToLoginButton();

		Assert.assertEquals(loginPage.getEmailAdressEmptyErrorMessage(), "This is a required field.");
		Assert.assertEquals(loginPage.getPasswordEmptyErrorMessage(), "This is a required field.");
	}

	@Test
	public void Login_02_Invalid_Email() {
		// HomePage -> click vào My Account Link - Qua trang LoginPage
		homePage.clickToMyAccountLink();

		loginPage = new LoginPageObject(driver);

		loginPage.inputToEmailAddressTextbox("tinh@123.123");
		loginPage.inputToPasswordTextbox("123456");
		loginPage.clickToLoginButton();

		Assert.assertEquals(loginPage.getEmailAdressInvalidErrorMessage(),
				"Please enter a valid email address. For example johndoe@domain.com.");
	}

	@Test
	public void Login_03_Invalid_Password() {
		// HomePage -> click vào My Account Link - Qua trang LoginPage
		homePage.clickToMyAccountLink();

		loginPage.inputToEmailAddressTextbox("tinh@gmail.com");
		loginPage.inputToPasswordTextbox("1234");
		loginPage.clickToLoginButton();

		Assert.assertEquals(loginPage.getPasswordInvalidErrorMessage(),
				"Please enter 6 or more characters without leading or trailing spaces.");
	}

	@Test
	public void Login_04_Incorrect_Email() {
		// HomePage -> click vào My Account Link - Qua trang LoginPage
		homePage.clickToMyAccountLink();

		loginPage.inputToEmailAddressTextbox("hoangthitinh" + getRandomNumber() + "@gmail.com");
		loginPage.inputToPasswordTextbox("123456");
		loginPage.clickToLoginButton();

		Assert.assertEquals(loginPage.getEmailAdressOrPasswordIncorrectErrorMessage(), "Invalid login or password.");
	}

	@Test
	public void Login_05_Incorrect_Password() {
		// HomePage -> click vào My Account Link - Qua trang LoginPage
		homePage.clickToMyAccountLink();

		loginPage.inputToEmailAddressTextbox("hoangtinh101001@gmail.com");
		loginPage.inputToPasswordTextbox("8654321");
		loginPage.clickToLoginButton();

		Assert.assertEquals(loginPage.getEmailAdressOrPasswordIncorrectErrorMessage(), "Invalid login or password.");
	}

	@Test
	public void Login_06_Success() {
		// 7 - HomwPage => new LoginPage
		homePage.clickToMyAccountLink();

		loginPage.inputToEmailAddressTextbox("hoangtinh101001@gmail.com");
		loginPage.inputToPasswordTextbox("123456");

		// 8- LoginPage => new MyDashboardPage
		myDashboardPage = loginPage.clickToLoginButton();
		Assert.assertEquals(myDashboardPage.getContactInfor(), "Hoang Tinh");
		Assert.assertEquals(myDashboardPage.getContactInfor(), "hoangtinh101001@gmail.com");
	}

	@Test
	public void Login_07_Update_Account_Information() {
		accountInformationPage = myDashboardPage.clickToAccountInformationPageObject();
		accountInformationPage.enterToFirstNameTextbox("Tỉnh 1");
		accountInformationPage.enterToLastNameTextbox("Hoàng");
		accountInformationPage.enterToEmailAddressTextbox("hoangtinh" + getRandomNumber() + "@gmail.com");

		accountInformationPage.enterToPasswordTextbox("123456");
		myDashboardPage = accountInformationPage.clickToSaveButton();
		Assert.assertTrue(myDashboardPage.isAccountInformationMessageSavedDisplayed());

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
