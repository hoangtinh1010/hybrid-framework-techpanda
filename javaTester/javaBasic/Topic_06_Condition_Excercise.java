package javaBasic;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Topic_06_Condition_Excercise {
	WebDriver driver;
	Scanner scanner = new Scanner(System.in);
	
	public void TC_01() {
		int number = scanner.nextInt();
		 int afterNumber = number % 2;
		 System.out.println(number);
		 
		 boolean status = afterNumber ==0;
		 System.out.println(status);
		 
		 if (number % 2 ==0) {
			 System.out.println("Số: " + number + " là số chẵn");
		 }else {
			 System.out.println("Số: " + number + " là số lẻ");
		 }
	}
	
	
	public void TC_02() {
		int numberA = scanner.nextInt();
		int numberB = scanner.nextInt();
		
		if (numberA >= numberB) {
			System.out.println(numberA + " lơn hơn hoặc bằng " + numberB);
		}else {
			System.out.println(numberA + " nhỏ hơn " + numberB);
		}
	}
	
	
	public void TC_03() {
		String nameA = scanner.nextLine();
		String nameB = scanner.nextLine();
		
		//Referece: String
		//Kiểm tra cái value của biên
		//Kiểm tra vị trí của biến trong vùng nhớ
		if (nameA.equals(nameB)) {
			System.out.println("Hai sinh viên tên giống nhau");	
		} else {
			System.out.println("Hai sinh viên tên khác nhau");	
		}
		
		//Kiểu primitive type
		if (nameA == nameB) {
			System.out.println("Hai sinh viên tên giống nhau");
		}else {
			System.out.println("Hai sinh viên tên khác nhau");
		}
	}
	

	public void TC_04() {
		int numberA = scanner.nextInt();
		int numberB = scanner.nextInt();
		int numberC = scanner.nextInt();
		
		if (numberA > numberB && numberA>numberC) {
			System.out.println(numberA + " là số lớn nhất");
		}else if (numberB > numberC) {
			System.out.println(numberB + " là số lớn nhất");		
		}else {
			System.out.println(numberC + " là số lớn nhất");
		}
			
		
		
	}
	
	
	public void TC_05() {
		int numberA = scanner.nextInt();
		
		if (numberA > 10 && numberA <100) {
			System.out.println(numberA + " nằm trong khoảng (10-100)");
		} else {
			System.out.println(numberA + " nằm ngoài khoảng (10-100)");
		}
}
	
	public void TC_06() {
		float diem = scanner.nextFloat();
		
		// 0<5  Điểm D
		//5 <7.5 Điểm C
		//7.5 < 8.5 Điểm B
		//8.5 - 10 Điểm A
		 if (diem<=10 && diem >= 8.5) {
			System.out.println("Hệ số A"); 
		 } else if(diem>=7.5) {
			System.out.println("Hệ số B"); 
		 } else if (diem>=5) {
			System.out.println("Hệ số C");
		 } else if (diem<5 && diem>=0) {
			System.out.println("Hệ số D");
		 } else {
			 System.out.println("Bạn vui lòng nhập lại");
		 }	 
	}
	
	@Test
	public void TC_07() {
		int month = scanner.nextInt();
		
		//1 3 5 7 8 10 12
		if (month == 1 ||month == 3 ||month == 5 ||month == 7 ||month == 8 ||month == 10 ||month == 12 ) {
			System.out.println("Tháng này có 31 ngày");
		}else if (month == 2) {
			System.out.println("Tháng này có 28 ngày");
		}else if (month == 4 ||month == 6 ||month == 9 ||month == 11 ) {
			System.out.println("Tháng này có 30 ngày");
		}
		
	}
}
