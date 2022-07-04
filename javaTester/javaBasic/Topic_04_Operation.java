package javaBasic;

import org.testng.Assert;

public class Topic_04_Operation {
	public static void main (String[] args) {
		int number = 10;
		number += 5;
		System.out.println(number);
		
		System.out.println(number / 5);
		
		//15%6=2 dư 3
		System.out.println(number % 6);
		
		System.out.println(number++);
		//In number ra trước: 10
		//++ = tăng number lên 1 =11
		System.out.println(++number);
		//++ = tăng number lên 1 = 12
		//In number ra sau: 12
		System.out.println(number--);
		
		for (int i = 0; i<3; ++i) {
			System.out.println(i);
		}
		
		Assert.assertTrue(5<6);
		String address = "Hồ Chí Minh";
		
		if (!(address == "Ha Noi")) {
			System.out.println("Address is not the same");
		}
		
	}

}
