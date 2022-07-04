package javaBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Topic_02_Data_Type {
	//Primitive type/value type:Nguyên thủy
	byte bNumber = 6;
	short sNumber = 1500 ;
	int iNumber = 150000;
	long lNumber = 34555 ;
	float fNumber = 3.5f;
	double dNumber = 15.98d;
	char cChar = '1';
	boolean bStatus;
	
	//Reference  type: Tham chiếu
	
	//STring
	String address = "Ho Chi Minh";
	
	//Array
	String [] studentAddress = {address, "Ha Noi", "Da Nang"};
	Integer[] studentNumber = {15,20,40};
	
	//Class
	Topic_02_Data_Type topic;
	
	//Interface
	WebDriver driver;
	
	//Object
	Object aOpject;
	
	//Collection
	//List/Set/Queqe/Map
	List<WebElement> homePageLinks = driver.findElements(By.tagName("a"));
	Set<String> allWindows = driver.getWindowHandles();
	List<String> productName = new ArrayList<String>();
	
	//Sự khác biệt
	public void clickToElment() {
		address.trim();
		studentAddress.clone();
		driver.getCurrentUrl();
		aOpject.getClass();
		homePageLinks.size();
		
	}
	
	public static void main(String[] args) {
		
	}
	

}
