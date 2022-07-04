package com.techpanda.account;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import commons.BasePage;

public class Level_2_Apply_BasePage_Part_II {
	//Khai báo = Declare
	WebDriver driver;
	BasePage basePage;
	
	//Khai báo + Khởi tạo = Declare + Initial
	String projectPath = System.getProperty("user.dir");
	

	@BeforeClass //Chạy trước cho testcase đầu tiên
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		basePage = new BasePage();
		
		//Che dấu việc khởi tạo của 1 đối tượng
		basePage = BasePage.getBasePageInstance();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	
	@BeforeMethod//Chạy trước cho tất cả testcase
	public void beforMethod() {
		basePage.openPageUrl(driver,"http://live.techpanda.org");
		basePage.clickToElement(driver, "//div[@class='footer']//a[text()='My Account']");
	
	}
	
	@Test
	public void Login_01_Empty_Email_And_Password() {
		
		basePage.senkeyToElement(driver, "//input[@id='email']", "");
		basePage.senkeyToElement(driver, "//input[@id='pass']", "");
		basePage.clickToElement(driver, "button[@id='send2']");
		
		Assert.assertEquals(basePage.getElementText(driver, "//div[@id='advice-required-entry-email']"), "This is a required field.");
		Assert.assertEquals(basePage.getElementText(driver, "//div[@id='advice-required-entry-pass']"), "This is a required field.");

	}
	
	@Test
	public void Login_02_Invalid_Email() {
		
		basePage.senkeyToElement(driver, "//input[@id='email']", "tinh@123.123");
		basePage.senkeyToElement(driver, "//input[@id='pass']", "123456");
		basePage.clickToElement(driver, "button[@id='send2']");
		
		Assert.assertEquals(basePage.getElementText(driver, "//div[@id='advice-validate-email-email']"), "Please enter a valid email address. For example johndoe@domain.com.");
		
	}
	
	@Test
	public void Login_03_Invalid_Password() {
		basePage.senkeyToElement(driver, "//input[@id='email']", "automation@gmail.com");
		basePage.senkeyToElement(driver, "//input[@id='pass']", "123");
		basePage.clickToElement(driver, "button[@id='send2']");
		Assert.assertEquals(basePage.getElementText(driver, "//div[@id='advice-validate-password-pass']"), "Please enter 6 or more characters without leading or trailing spaces.");
		
	}
	
	@Test
	public void Login_05_Incorrect_Email_And_Password() {
		//Existed Email + incorrect Password -> Unsuccess
		basePage.senkeyToElement(driver, "//input[@id='email']", "hoangtinh12345678@gmail.com");
		basePage.senkeyToElement(driver, "//input[@id='pass']", "123456");
		basePage.clickToElement(driver, "button[@id='send2']");
		Assert.assertEquals(basePage.getElementText(driver, "//span[text() ='Invalid login or password.']"), "Invalid login or password.");
	}
	@AfterClass
	public void afterClass() {
	driver.quit();
	} 
	
	@Test
	public int getRandomNumber() { 
		Random rand = new Random();
		return rand.nextInt(9999);
		
	}
}
