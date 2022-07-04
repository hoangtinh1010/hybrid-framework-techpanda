package commons;

import java.util.List;
import java.util.Set;

import javax.swing.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	//Chính bản thân hàm này có thể khởi tạo 1 đối tượng của class BasePage lên
	//Sau đó trả về đối tượng này ở 1 class khác
	
	//static vào hàm:
	//Thuộc phạm vi của Class (không cần thông qua 1 object/instance gọi ra dùng
	//Ko thuộc phạm vi của Object
	public static BasePage getBasePageInstance() {
		return new BasePage();
	}
	
 /*   Web Browser   */
	//1 - Access Modifier: public
	//2 - Kiểu trả về của hàm
	//2.1 - void: Action
	//2.2 - lấy dữ liệu ra: # void: String/int/boolean/Object/...
	//getXXX: getCurrentUrl/ getTitle/ getCssValue/ getTexxt/getAttribute/ getSize/...
	//3 - Tên hàm:
	//3.1 - Tính năng này dùng làm gì -> tên
	//3.2 - Convention (Camel Case)
	//homNayAnGi()
	//toiNayLamGi()
	// 4- Tham số truyền vào
	//Khai báo 1 biến bên trong:Kiểu dữ liệu - tên dữ liệu: String addressName, String pageUrl
	//5- Kiểu dữ liệu trả về trong hàm
	//5.1 Nếu là void: không cần return
	//5.2 nếu khác void thì return đúng capacity
	
	//Note:
	//1- Tham số đầu tiên bắt buộc của 1 hàm tương tác với Web Browser là "WebDriver dirver"
	
	
	/**
	 * Open any page Url
	 * @author Hoang Tinh
	 * @param driver
	 * @param pageUrl
	 */
	
	
	public void openPageUrl(WebDriver driver, String pageUrl) {
		driver.get(pageUrl);
		
	}
	
	/**
	 * Get current page Url
	 * 
	 * @param driver
	 * @return
	 */
	public String getPageUrl(WebDriver driver) {
		return driver.getCurrentUrl();
	}
	
	public String getPageTitle(WebDriver driver) {
		return driver.getTitle();	
	}
	
	public String getPageSourceCode(WebDriver driver) {
		return driver.getPageSource();
		
	}
	
	public void backToPage(WebDriver driver) {
		driver.navigate().back();
	}
	
	public void forwardToPage(WebDriver driver) {
		driver.navigate().forward();
	}
	
    public void refreshCurrentPage(WebDriver driver) {
		driver.navigate().refresh();
	}
    
    public Alert waitForAlertPresence(WebDriver driver) {
		return new WebDriverWait(driver, longTimeout).until(ExpectedConditions.alertIsPresent());
	}
	
	public void acceptAlert(WebDriver driver) {
		waitForAlertPresence(driver).accept();
	}

	public void canceltAlert(WebDriver driver) {
		waitForAlertPresence(driver).dismiss();;
	}
	
	public void sendkeyToAlert(WebDriver driver, String valueToSendkey) {
		waitForAlertPresence(driver).sendKeys(valueToSendkey);
	}
	
	public String getAlertText(WebDriver driver) {
		return waitForAlertPresence(driver).getText();
	}
    
	public void switchToWindowByID(WebDriver driver, String expectedTitle) {
		Set<String> allTabIDs = driver.getWindowHandles();
		
		for (String id : allTabIDs) {
			if (!id.equals(allTabIDs)) {
				driver.switchTo().window(id);
				break;
			}
		}
		
	}
	
    public void switchToWindowByTitle(WebDriver driver, String expectedTitle) {
		Set<String> allTabIDs = driver.getWindowHandles();
		
		for (String id : allTabIDs) {
			if (!id.equals(allTabIDs)) {
				driver.switchTo().window(id);
				String actualTitle = driver.getTitle();
				if (actualTitle.equals(expectedTitle)) {
					break;
				}
			}
		}
		
	}
	
	public boolean closeAllWWindowsWithoutParrent(WebDriver driver, String parentID) {
		Set<String> allWindows = driver.getWindowHandles();
		for (String runWindows : allWindows) {
			if (!runWindows.equals(parentID)) {
				driver.switchTo().window(runWindows);
				driver.close();
			}
		}
		
		driver.switchTo().window(parentID);
		if (driver.getWindowHandles().size() == 1)
			return true;
		else
			return false;
			
	}
	
	/* WebElement */
	//Note:
	// 1 - Tham số đầu tiên thuộc của 1 hàm tương tác vs Web Browser là "WebDriver driver"
	// 2- Tham số thứ hai bắt buộc của 1 hàm tương tác với web Browser là "String locator"
	// Locator: Thao tác vs element nào
	// Xpath/Css/Id/Name/Class/...
	// Text/Xpath Axes
	// 3 - Nhưng step nào có dùng element lại >=2 -> Khai báo 1 biến local
	// 4 -Verify true/false
	// Các hàm trả về kiểu boolean luôn có tiền tố là is
	public By getByXpath(String locator) {
		return By.xpath(locator);
	}
	public WebElement getWebElement(WebDriver driver, String locator) {
		return driver.findElement(getByXpath(locator));
	}
	
	public List<WebElement> getListElement(WebDriver driver, String locator) {
		return driver.findElements(getByXpath(locator));
		
	}
	//Hàm dùng chung để click vào bất kỳ 1 element nào
	public void clickToElement(WebDriver driver, String locator) {
		driver.findElement(By.xpath(locator)).click();
	}
	
	public void senkeyToElement(WebDriver driver, String locator,String valueToInput) {
		WebElement element = getWebElement(driver, locator);
		element.clear();
		element.sendKeys(valueToInput);
		
	}
	
	public String getElementText(WebDriver driver, String locator) {
		return getWebElement(driver, locator).getText();
	}
	
	public void selectItemDefaultDropdown(WebDriver driver, String locator, String itemText) {
		Select select = new Select(getWebElement(driver, locator));
		select.selectByVisibleText(itemText);
	}
	
	public String getFirstSelectedTextItem(WebDriver driver, String locator, String itemText) {
		Select select = new Select(getWebElement(driver, locator));
		return select.getFirstSelectedOption().getText();	
	}
	
	public boolean isDropdownMultiple(WebDriver driver, String locator) {
		Select select = new Select(getWebElement(driver, locator));
		return select.isMultiple();
	}
	
	public void selectItemInCustomDropdownList(WebDriver driver, String parentXpath,  String childXpath,  String expectedTextItem) {
		
		getWebElement(driver, parentXpath).click();
		sleepInSecond(2);
		
		List<WebElement> childItems = new WebDriverWait(driver,30).until(ExpectedConditions.presenceOfAllElementsLocatedBy(getByXpath(childXpath)));
		for (WebElement item : childItems) {
			if (item.equals(expectedTextItem)) {	
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", item);
				sleepInSecond(1);
				item.click();
				sleepInSecond(1);
				break;
			}
		}
	}
	
	public String getElementAtribute(WebDriver driver, String locator, String attributeName) {
		return getWebElement(driver,locator).getAttribute(attributeName);
	}
	
	public String getElementCssValue(WebDriver driver, String locator, String propertyName) {
		return getWebElement(driver,locator).getCssValue(propertyName);
	}
	
	public int getListElementSize(WebDriver driver, String locator) {
		return getListElement(driver, locator).size();
	}
	
	public void checkToCheckBoxOrRadio(WebDriver driver, String locator) {
		if (!isElementSelected(driver, locator)) {
			clickToElement(driver,locator);
		}
	}
	
	public void unCheckToCheckBoxOrRadio(WebDriver driver, String locator) {
		if (isElementSelected(driver, locator)) {
			clickToElement(driver, locator);
		}
	}
	
	public boolean isElementDisplayed(WebDriver driver, String locator) {
		return getWebElement(driver, locator).isDisplayed();
	}
	
	public boolean isElementEnabled(WebDriver driver, String locator) {
		return getWebElement(driver, locator).isEnabled();
	}
	
	public boolean isElementSelected(WebDriver driver, String locator) {
		return getWebElement(driver, locator).isSelected();
	}
	
	public void switchToIframe(WebDriver driver, String locator) {
		driver.switchTo().frame(getWebElement(driver, locator));
	}
	
	public void hoverMouseToElement(WebDriver driver, String locator) {
		Actions action = new Actions(driver);
		action.moveToElement(getWebElement(driver, locator)).perform();;
	}
	
	public void rightClickToElement(WebDriver driver, String locator) {
		Actions action = new Actions(driver);
		action.contextClick(getWebElement(driver, locator)).perform();;
	}
	
	public void doubleClickToElement(WebDriver driver, String locator) {
		Actions action = new Actions(driver);
		action.doubleClick(getWebElement(driver, locator)).perform();;
	}
	
	public void dragAndDropElement(WebDriver driver, String sourcelocator, String targetLocator) {
		Actions action = new Actions(driver);
		action.dragAndDrop(getWebElement(driver, sourcelocator), getWebElement(driver, targetLocator)).perform();
	}
	
	public void pressKeyToElement(WebDriver driver, String locator, Keys key) {
		Actions action = new Actions(driver);
		action.sendKeys(getWebElement(driver, locator), key).perform();
	}
	
	public void waitForElementVisible(WebDriver driver, String locator) {
		new WebDriverWait(driver, longTimeout).until(ExpectedConditions.visibilityOfElementLocated(getByXpath(locator)));
	}
	
	public void waitForElementInvisible(WebDriver driver, String locator) {
		new WebDriverWait(driver, longTimeout).until(ExpectedConditions.invisibilityOfElementLocated(getByXpath(locator)));
	}
	
	
	public void waitForElementClickable(WebDriver driver, String locator) {
		new WebDriverWait(driver, longTimeout).until(ExpectedConditions.elementToBeClickable(getByXpath(locator)));
	}
	
	
	
	
	public void sleepInSecond(long timeInSecond) {
		try {
			Thread.sleep(timeInSecond * 10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void sleepInsecond(long timeInSecond) {
		try {
			Thread.sleep(timeInSecond * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private long longTimeout = 30;
	private long shortTimeout = 5;
	public void testcaseSample() {
		//clickToElement(driver, "//button[@title='Subscribe']");
		//clickToElement(driver, "//button[@title='Email']");
		//clickToElement(driver, "//button[@title='Register']");
		
	}
	}
