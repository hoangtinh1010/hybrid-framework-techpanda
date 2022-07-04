package pageObject.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.user.LoginPageUI;
import pageUIs.user.MyDashboardPageUI;

public class MyDashboardPageObject extends BasePage {
WebDriver driver;
	
	public MyDashboardPageObject(WebDriver driver) {
		this.driver = driver;
		
	}
	public String getContactInfor() {
		waitForElementVisible(driver, MyDashboardPageUI.CONTACT_INFOR_TEXT);
		return getElementText(driver, MyDashboardPageUI.CONTACT_INFOR_TEXT);
	}

}
