package javaOOP;

public class Topic_04_Non_Access_Modifier {
	// static: Varable/ Method
	// Dùng cho tất cả các insance/object
	// Phạm vi cho toàn bộ system sử dụng nó
	// Có thể override (có thể gán lại) được
	static String browserName = "Chrome";
	// Non static
	String serverName = "Testing";

	// Hằng số
	static final String colorCar = "Red";

	public static void main(String[] args) {

		System.out.println(browserName);

		browserName = "Firefox";
		System.out.println(browserName);

		Topic_04_Non_Access_Modifier topic = new Topic_04_Non_Access_Modifier();
		System.out.println(topic.serverName);

		// final không được phép gán lại giá trij
		System.out.println(topic.colorCar);

		topic.clickToElement("Button");

		senkeyToElement("Link");
	}

	// Non static
	public void clickToElement(String elementName) {
		System.out.println(elementName);

	}

	// Static
	public static void senkeyToElement(String elementNam) {
		System.out.println(elementNam);

	}

	// Final
	public final void setCarName() {

	}

}
