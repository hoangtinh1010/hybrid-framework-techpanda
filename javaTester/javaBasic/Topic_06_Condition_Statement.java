package javaBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Topic_06_Condition_Statement {
	WebDriver driver;
	
	String projectPath = System.getProperty("user.dir");
	
	@Test
	public void TC_01_If() {
		boolean status = 5>3;
		System.out.println(status);
		
		//Hàm if sẽ nhận vào 1 điều kiện đúng
		//Kiểm tra duy nhất 1 điều kiện
		//Nếu điều kiện này đún thì sẽ action (xxx) trong Phần thân
		if (status) {
			//Đúng thì  vào phần thân của if
			//Sai thì bỏ qua
			System.out.print("Go to if");
		}
		
		// Gán (assign)
				int studentNumber = 10;
				// == So sánh
				status =(studentNumber == 10);
				System.out.println(status);
		
		WebDriver driver = new FirefoxDriver();
		
		WebElement salePopup = driver.findElement(By.id(""));
		//Element luôn luôn có trong DOM dù popup hiển thị hay không
		if (salePopup.isDisplayed()) {
			
		}
		
		//Element không có trong DOM khi popup không hiển thị
		List<WebElement> salePopups = driver.findElements(By.id(""));
		
		//Check element không hiển thị
		if(salePopups.size() > 0 && salePopups.get(0).isDisplayed()) {
			
		}
		
		//UnCheck to checkbox
		WebElement languagesCheckbox = driver.findElement(By.id(""));
		if (languagesCheckbox.isSelected()) {
			languagesCheckbox.click();
			
		}
		
		//Check to checkbox
		if (!languagesCheckbox.isSelected()) {
			languagesCheckbox.click();
		}
	}
	public void TC_02_If_Else() {
		// có tới 2 điều kiện: nếu như đúng thì vào if - sai thì vào else
		
		//Nếu driver start với browse như Chrome/Firefox/ Edge/ Safari thì dùng hàm click 
		//thông thường (builtin) của Selenium Webdriver
		
		//Nếu driver là IE thì dùng hà click của JavascriptExecutor
//		System.setProperty("webdriver.ie.driver", projectPath + "\\browserDrivers\\IEDriverServer.exe");
//		driver = new InternetExplorerDriver();
		
		System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println(driver.toString());
		
		if(driver.toString().contains("internet explorer")) {
			System.out.println("Click by Javascript Executor");
		} else {
			System.out.println("Click by Selenium WebElement");
		}
		
	}

	@Parameters ("browsers")
	@Test
	public void IC_03_If_Else_If_Else(String browserName) {
		//Có nhiều điều kiện
		//Best practive: khôn nên if - else quá nhiều
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", projectPath + "\\browserDrivers\\edge.exe");
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", projectPath + "\\browserDrivers\\ie.exe");
			driver = new InternetExplorerDriver();
		
		}else {
			throw new RuntimeException ("Please input correct the browser name! ");
		}
	}
  
	@Test
	public void TC_04_If_Else_If_Else() {
		//Page Object
		//Dynamic Page
		
		String pageName = "Login";
		
		if(pageName.equals("Login")) {
			//LoginPage loginPage = new LoginPage();
			//return loginPage
		} else if (pageName.equals("Register")) {
			//RegisterPage registerPage = new RegisterPage();
			//return registerPage;
		}else if (pageName.equals("New Customer")) {
			//CustomerPage customerPage = new RegisterPage();
			//return customerPage;
		}else {
			//HomePage homePage = new HomePage();
			//return homePage;
		}
		
		//if-else
		
		int age = 18;
		String access =(age<18) ? "You can not access" : "Welcom to our system!";
		
		if (age<18) {
			access = "You can not access";
		}else {
			access =  "Welcom to our system!";
		}
		System.out.println(access);
	}
	
}
