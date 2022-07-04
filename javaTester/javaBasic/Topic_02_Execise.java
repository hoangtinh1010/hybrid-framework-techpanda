package javaBasic;

import org.testng.annotations.Test;

public class Topic_02_Execise {
	@Test
	public void TC_01() {
		int a = 2;
		int b = 3;
		
		System.out.println("Tổng = " + (a+b));
		System.out.println("Hiệu = " + (a-b));
		System.out.println("Tích = " + (a*b));
		System.out.println("Thương = " + (a/b));
	}
	@Test
	public void TC_02() {
		float width = 7.5f;
		float heigh = 3.8f;
		
		System.out.println("Area = " + (width*heigh));
	}
	@Test
	public void TC_03() {
		String name = "Automation Testing";
		
		System.out.println("Hello " + name);
	}


}
