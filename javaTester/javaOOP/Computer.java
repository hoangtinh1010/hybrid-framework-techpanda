package javaOOP;

public abstract class Computer {

	// Normal Method
	public void showComputerPerfomance() {
		System.out.println("Show computer performance");

	}

	// Abstract Method
	// Khung để cho các Class con kế thừa nó phải override (implement) lại
	public abstract void showComputerRam();

}
