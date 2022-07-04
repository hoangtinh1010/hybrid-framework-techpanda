package pageObject.user;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.user.HomePageUI;

public class HomePageObject extends BasePage {

	
	// Hàm khởi tạo - Constructor
	// Gọi đầu tiên khi khởi tạo 1 Class lên
	// Cùng tên với tên Class
	// Không có kiểu trả về
	// Có tham số hoặc không tham số
    //1 Class có thể có 1 hoặc nhiều hàm khởi tạo	
	// Nếu như mình không viết rõ hàm khởi tạo thì trong quá trình chạy nó sẽ gọi đến hàm khởi tạo
	// mặc định của Class đó (hàm khởi tạo rỗng: tên hàm/ ko có phần thân
	
	//Truy cập đến biến thuộc phạm vi Class (global trong case trùng tên với biến thuộc phạm vi hàm (local)
	WebDriver driver;
	
	// Map driver
	public HomePageObject(WebDriver driver) {
		this.driver = driver;
		
	}

	public void clickToMyAccountLink() {
		waitForElementClickable(driver,HomePageUI.MY_ACCOUNT_LINK);
		clickToElement(driver, HomePageUI.MY_ACCOUNT_LINK);
	}

}
