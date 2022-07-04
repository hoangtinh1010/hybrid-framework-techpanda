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

public class Level_2_Apply_BasePage_Part_III extends BasePage {
	
	WebDriver driver;

	String projectPath = System.getProperty("user.dir");
	

	@BeforeClass //Chạy trước cho testcase đầu tiên
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	
	@BeforeMethod//Chạy trước cho tất cả testcase
	public void beforMethod() {
		openPageUrl(driver,"http://live.techpanda.org");
		clickToElement(driver, "//div[@class='footer']//a[text()='My Account']");
	
	}
	
	@Test
	public void Login_01_Empty_Email_And_Password() {
		
		senkeyToElement(driver, "//input[@id='email']", "");
		senkeyToElement(driver, "//input[@id='pass']", "");
		clickToElement(driver, "//button[@id='send2']");
		
		Assert.assertEquals(getElementText(driver, "//div[@id='advice-required-entry-email']"), "This is a required field.");
		Assert.assertEquals(getElementText(driver, "//div[@id='advice-required-entry-pass']"), "This is a required field.");

	}
	
	@Test
	public void Login_02_Invalid_Email() {
		
		senkeyToElement(driver, "//input[@id='email']", "tinh@123.123");
		senkeyToElement(driver, "//input[@id='pass']", "123456");
		clickToElement(driver, "//button[@id='send2']");
		
		Assert.assertEquals(getElementText(driver, "//div[@id='advice-validate-email-email']"), "Please enter a valid email address. For example johndoe@domain.com.");
		
	}
	
	@Test
	public void Login_03_Invalid_Password() {
		senkeyToElement(driver, "//input[@id='email']", "automation@gmail.com");
		senkeyToElement(driver, "//input[@id='pass']", "123");
		clickToElement(driver, "//button[@id='send2']");
		Assert.assertEquals(getElementText(driver, "//div[@id='advice-validate-password-pass']"), "Please enter 6 or more characters without leading or trailing spaces.");
		
	}
	
	@Test
	public void Login_05_Incorrect_Email_And_Password() {
		//Existed Email + incorrect Password -> Unsuccess
		senkeyToElement(driver, "//input[@id='email']", "hoangtinh12345678@gmail.com");
		senkeyToElement(driver, "//input[@id='pass']", "123456");
		clickToElement(driver, "//button[@id='send2']");
		Assert.assertEquals(getElementText(driver, "//span[text() ='Invalid login or password.']"), "Invalid login or password.");
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
