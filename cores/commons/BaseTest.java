package commons;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String osName = System.getProperty("os.name");

	protected WebDriver getBrowserDriver(String browserName) {

		BrowserList browserList = BrowserList.valueOf(browserName.toUpperCase());

		switch (browserList) {
		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case CHROME:
			// Lastest version
			WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case EDGE:
			WebDriverManager.edgedriver().setup();
			System.setProperty("webdriver.edge.driver", projectPath + "\\browserDrivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		default:
			throw new RuntimeException("Browser name is not valid");

		}
		driver.get("http://live.techpanda.org/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		return driver;
	}

	protected WebDriver getBrowserDriverID(String browserName) {

		BrowserList browserList = BrowserList.valueOf(browserName.toUpperCase());

		switch (browserList) {
		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case CHROME:
			// Lastest version
			WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case EDGE:
			WebDriverManager.edgedriver().setup();
			System.setProperty("webdriver.edge.driver", projectPath + "\\browserDrivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		default:
			throw new RuntimeException("Browser name is not valid");

		}

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(browserName);

		return driver;
	}

	private String getEnviromentValue(String serverName) {
		String envUrl = null;
		EnviromentList enviroment = EnviromentList.valueOf(serverName.toUpperCase());
		if (enviroment == EnviromentList.DEV) {
			envUrl = "https://demo.nopcommerce.com/";

		} else if (enviroment == EnviromentList.STAGING) {
			envUrl = "https://admin-demo.nopcommerce.com/";
		} else if (enviroment == EnviromentList.PRODUCTION) {
			envUrl = "https://production.orangehrmlive.com/";
		}

		return envUrl;

	}

	protected int getRandomNumber() {
		Random rand = new Random();
		return rand.nextInt(9999);

	}

}
