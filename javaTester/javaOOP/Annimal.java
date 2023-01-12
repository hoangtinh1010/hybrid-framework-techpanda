package javaOOP;

public abstract class Annimal {

	// Variable
	String annimalName = "Dog";

	// Method
	// Không có phần thần (body)
	// public, protected,private,static, final, transient, volatile
	// BẮt buộc cấc class con phải override các hàm này lại
	abstract void setAnnimalName();

}
