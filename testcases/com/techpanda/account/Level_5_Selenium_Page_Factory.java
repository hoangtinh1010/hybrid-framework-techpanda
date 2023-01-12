package com.techpanda.account;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageFactory.user.HomePageObject;
import pageFactory.user.LoginPageObject;
import pageFactory.user.MyDashboardPageObject;

public class Level_5_Selenium_Page_Factory extends BaseTest {

	WebDriver driver;
	HomePageObject homePage;
	LoginPageObject loginPage;
	MyDashboardPageObject dashboardPage;
	String projectPath = System.getProperty("user.dir");

	@Parameters({ "browser" })
	@BeforeClass // Chạy trước cho testcase đầu tiên
	public void beforeClass(String browserName) {
		driver = getBrowserDriver(browserName);
		homePage = new HomePageObject(driver);

	}

	@Test
	public void Login_01_Empty_Email_And_Password() {
		// HomePage -> click vào My Account Link - Qua trang LoginPage
		homePage.clickToMyAccountLink();

		loginPage = new LoginPageObject(driver);

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
		homePage.clickToMyAccountLink();

		loginPage = new LoginPageObject(driver);

		loginPage.inputToEmailAddressTextbox("tinh@gmail.com");
		loginPage.inputToPasswordTextbox("1234");
		loginPage.clickToLoginButton();

		Assert.assertEquals(loginPage.getPasswordInvalidErrorMessage(),
				"Please enter 6 or more characters without leading or trailing spaces.");
	}

	@Test
	public void Login_04_Incorrect_Email() {
		homePage.clickToMyAccountLink();

		loginPage = new LoginPageObject(driver);

		loginPage.inputToEmailAddressTextbox("hoangthitinh" + getRandomNumber() + "@gmail.com");
		loginPage.inputToPasswordTextbox("123456");
		loginPage.clickToLoginButton();

		Assert.assertEquals(loginPage.getEmailAddressOrPasswordIncorrectErrorMessage(), "Invalid login or password.");
	}

	@Test
	public void Login_05_Incorrect_Password() {
		homePage.clickToMyAccountLink();

		loginPage = new LoginPageObject(driver);

		loginPage.inputToEmailAddressTextbox("hoangtinh101001@gmail.com");
		loginPage.inputToPasswordTextbox("8654321");
		loginPage.clickToLoginButton();

		Assert.assertEquals(loginPage.getEmailAddressOrPasswordIncorrectErrorMessage(), "Invalid login or password.");
	}

	@Test
	public void Login_06_Success() {
		homePage.clickToMyAccountLink();

		loginPage = new LoginPageObject(driver);
		dashboardPage = new MyDashboardPageObject(driver);

		loginPage.inputToEmailAddressTextbox("hoangtinh101001@gmail.com");
		loginPage.inputToPasswordTextbox("123456");
		loginPage.clickToLoginButton();

		Assert.assertEquals(dashboardPage.getContactInfor(), "Invalid login or password.");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	public int getRandomNumber() {
		Random rand = new Random();
		return rand.nextInt(9999);

	}
}
