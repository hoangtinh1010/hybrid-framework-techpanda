package javaOOP;

public class Topic_03_Method {

	static void showCarName() {
		System.out.println("Huyndai");
	}

	static void showCarColor() {
		System.out.println("White");
	}

	public static void main(String[] args) {
		// Gọi vào trong 1 hàm static khác được
		showCarName();

		// Gọi qua instance/ object
		Topic_03_Method obj = new Topic_03_Method();
		obj.showCarColor();

		showCarColor();
		Topic_03_Method.showCarColor();

	}

}
