package com.wordpress.admin;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Admin_01_Post {
	WebDriver driver;
	String userUrl, adminUrl;

	@Parameters({ "browser", "userUrl", "adminUrl" })
	@BeforeClass
	public void beforeClass(String browserName, String userUrl, String adminUrl) {
		this.userUrl = adminUrl;
		this.adminUrl = adminUrl;

	}

	@Test
	public void Post_01_Create_New_Post() {

	}

	@Test
	public void Post_02_Search_View_Post() {

	}

	@Test
	public void Post_03_View_Post() {

	}

	@Test
	public void Post_04_Edit_Post() {

	}

	@Test
	public void Post_05_Delete_Post() {

	}

}
