package javaBasic;

import java.util.Scanner;

import org.testng.annotations.Test;

//Class
public class Topic_09_While_Do_While {
	static Scanner scanner = new Scanner(System.in);
	
	//Function
	public static void main(String[] args) {
		
		//Block code
		for (int i = 0; i <= 5; i++) {
			System.out.println("For: " + i);
			
		}
		
		//i = 5 không thỏa mãn
		int i=0;
		while (i<5) {
			System.out.println("While: " + i);
			i++;
		}
		
		//in i=5 rồi dừng
		do {
			System.out.println("Do-While: " + i);
			i++;
		} while (i<5);
		
	}
	
	
	public static void TC_02() {
		int number = scanner.nextInt();
		
		while (number<100) {
			if (number % 2==0) {
				System.out.println(number);
				number++;
			}
			
		}
		
	}
	
	
	
	public static void TC_04_While() {
		int numberA = scanner.nextInt();
		int numberB = scanner.nextInt();
		
		//CÁc số từ a tới b
		while (numberA<100) {
			//chia hết cho cả 3 và 5
			if (numberA % 3==0 && numberB % 5 == 0) {
				System.out.println(numberA);
				
			}
			numberA++;
			
		}
		
	}
	
	
	public static void TC_05_While() {
		int numberA = scanner.nextInt();
		int i = 0;
	
		while (numberA>0) {
			//chia hết cho cả 3 và 5
			if (numberA % 2 != 0 ) {
				i+=numberA;
				//i=i+numberA		
			}
			numberA--;	
		}
		System.out.println(i);
	}

@Test
public static void TC_06_While() {
	int numberA = scanner.nextInt();
	int i = 1;

	while (numberA > 0) {
			i *=numberA;		
			numberA--;	
	}
	
	System.out.println(i);
	}

}
	
	
	

