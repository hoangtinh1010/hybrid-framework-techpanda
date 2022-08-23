package javaBasic;

import org.testng.annotations.Test;

public class Topic_12_Excecise {
	String courseName = "Automation 18 45 76 Testing AdvaNced";

	@Test
	public void TC_01() {
		char courceNameArr[] = courseName.toCharArray();
		int countUpper = 0;
		int countLower = 0;
		int countNumber = 0;
		for (char character : courceNameArr) {
			// Uppercase
			if (character <= 'Z' && character >= 'A') {
				countUpper++;
			}
			// Lowercase
			if (character <= 'z' && character >= 'a') {
				countLower++;
			}

			// Number
			if (character <= '9' && character >= '0') {
				countLower++;

			}
		}
	}

	@Test
	public void TC_02() {
		char courceNameArr[] = courseName.toCharArray();
		int count = 0;

		for (char c : courceNameArr) {
			if (c == 'a') {
				count++;
			}
		}
		System.out.println(count);
	}

	@Test
	public void TC_03() {
		char courceNameArr[] = courseName.toCharArray();

		// cach 1
		for (int i = courceNameArr.length - 1; i >= 0; i--) {
			System.out.print(courceNameArr[i]);
		}
	}

}
