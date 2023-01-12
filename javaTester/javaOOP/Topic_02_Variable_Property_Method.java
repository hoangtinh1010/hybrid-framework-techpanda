package javaOOP;

public class Topic_02_Variable_Property_Method {
	static int studentNumber;
	static String studentCountry;
	static boolean status;

	// Access Modifier (private, public,..)
	// Data type
	// Variable name
	// Variable value
	private String studentName = "Automation FC"; // Biến toàn cục (Global variable)

	// Static variable: dùng và gán lại dùng
	public static String studentAddress = "Ho Chi Minh";

	// Dùng trong phạm vi class này (cho tất cả instance/object dùng)
	private static String StudentPhone = "0987654331";

	// Final variable: không cho phép gán lại/ko override lại
	// Cố đinh dữ liệu không được phép thay đổi trong quá trình chạy
	final String coutry = "Viet Nam";

	// Static final variable: hằng số
	// Không được ghi đè, có thể truy cập rộng rãi cho tất cả các instance/thread
	static final float PI_NUMBER = 3.1423544f;

	// Access modifier: default
	int studentID = 100056;

	// Hàm (method) - static
	public static void main(String[] args) {
		// Local variable - biến cục bộ: hàm
		String studentName = "Automation";

		if (studentName.startsWith("Automation")) {
			/// Local variable - biến cục bộ: block code
			int number = 100;
		}

		// Local variable : bắt buộc phải khởi tạo thì mới sử dụng thì mới đc sử dụng

		System.out.println(studentNumber);
	}

	// Contructor
	public Topic_02_Variable_Property_Method() {
		/// Local variable - biến cục bộ: constructor
		String studentName = "Automation";
	}

	// Hàm (method) - non static
	public void display() {
		// Local variable - biến cục bộ: hàm/block code/ constructor
		String studentame = "Automation";
	}

}
