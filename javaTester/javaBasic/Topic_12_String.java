package javaBasic;

public class Topic_12_String {

	public static void main(String[] args) {

		String schoolName = "Automation Testing";
		String schoolName2 = "Ho Chi Minh";
		String schoolName3 = "automation testing";
		System.out.println("Do dai = " + schoolName.length());
		System.out.println("Lay ra 1 ky tu = " + schoolName.charAt(0));

		//
		System.out.println("Noi 2 chuoi = " + schoolName.concat(schoolName2));
		System.out.println("Noi 2 chuoi = " + schoolName + schoolName2);

		// Tuyet doi
		System.out.println("Kiem tra 2 chuoi bang nhau tuyet doi = " + schoolName.equals(schoolName2));
		System.out
				.println("Kiem tra 2 chuoi bang nhau tuyet doi = " + schoolName.equals("Automation Testing Advanced"));

		// Muilti browser
		System.out.println("Kiem tra 2 chuoi bang nhau tuong doi(ko phan biet hoa thuong) = "
				+ schoolName.equalsIgnoreCase(schoolName3));

		// startWith/endsWith/contains
		System.out.println("Có bắt đầu bằng 1 ký tự/chuỗi ký tự " + schoolName.startsWith("A"));
		System.out.println("Có bắt đầu bằng 1 ký tự/chuỗi ký tự " + schoolName.startsWith("Automation"));
		System.out.println("Có bắt đầu bằng 1 ký tự/chuỗi ký tự " + schoolName.startsWith("T"));

		System.out.println("Có chứa 1 ký tự/chuỗi ký tự " + schoolName.contains("Automation"));
		System.out.println("Có chứa 1 ký tự/chuỗi ký tự " + schoolName.contains("A"));
		System.out.println("Có chứa 1 ký tự/chuỗi ký tự " + schoolName.contains("Testing"));

		System.out.println("Có kết thúc bằng 1 ký tự/chuỗi ký tự " + schoolName.endsWith("g"));
		System.out.println("Có kết thúc bằng 1 ký tự/chuỗi ký tự " + schoolName.endsWith("A"));
		System.out.println("Có kết thúc bằng 1 ký tự/chuỗi ký tự " + schoolName.endsWith("Testing"));

		System.out.println("Vị trí của 1 ký tự/chuỗi ký tự trong chuỗi " + schoolName.indexOf("A"));
		System.out.println("Vị trí của 1 ký tự/chuỗi ký tự trong chuỗi " + schoolName.indexOf("utomation"));
		System.out.println("Vị trí của 1 ký tự/chuỗi ký tự trong chuỗi " + schoolName.indexOf("Testing"));
		System.out.println("Tách 1 ký tự/chuỗi ký tự trong chuỗi " + schoolName.substring(11));
		System.out.println("Tách 1 ký tự/chuỗi ký tự trong chuỗi " + schoolName.substring(11, 15));

		// Split: Tách chuỗi thành 1 mảng dự vào 1 ký tự hoặc chuỗi ký tự
		String result = "Viewing 48 of 132 results";
		String results[] = result.split(" ");
		System.out.println(results[1]);

		// Replace
		String productPrice = "$100.00";
		String productPriceR = productPrice.replace("$", "");
		System.out.println(productPriceR);

		// Sắp xếp nó: Sort Data (Asc/Desc)
		float productPriceF = Float.parseFloat(productPriceR);
		System.out.println(productPriceF);

		productPrice = String.valueOf(productPriceF);
		System.out.println(productPrice);

		// Khoảng trắng/ Xuống dòng/ tab
		String helloWorld = " \n  \t  Hello World!   ";
		System.out.println(helloWorld);
		System.out.println(helloWorld.trim());

	}

}
