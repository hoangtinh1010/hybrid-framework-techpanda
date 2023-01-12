package javaOOP;

import org.openqa.selenium.WebDriver;

public class Topic_05_This_Supper extends BaseOOP {
	private WebDriver driver;
	private int firstNumber;
	private int secondNumber;

	public Topic_05_This_Supper() {
		this(10, 15);
		System.out.println("Demo");
	}

	public Topic_05_This_Supper(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;

	}

	public void sumNumber() {
		System.out.println(this.firstNumber + this.secondNumber);

	}

	public void showNumber() {
		this.sumNumber();
	}

	public static void main(String[] args) {
		Topic_05_This_Supper topic = new Topic_05_This_Supper(15, 7);
		topic.sumNumber();

	}

}
