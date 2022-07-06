package javaBasic;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class Topic_08_For_ForEach {
	
	public void TC_01_For() {
//		for (int i = 0; i <= 5; i++) {
//			System.out.println(i);
//			
//		}
		
		//Lần 1:
		//i=0
		//0<5: đúng
		//System.out.println(0)
		//i++: Tăng i thêm 1 đơn vị (i=1)
		
		//Lần 2:
		//i=1
		//1<5: đúng
		//System.out.println(1)
		//i++: Tăng i thêm 1 đơn vị (i=2)
		// .....
		
//		for (int i=1;i<5;i++) {
//			System.out.println(i);
//		}
//		
		
		//Array
		String[] cityName = {"Ha Noi", "Ho Chi Minh","Da Nang"};
		
		//Array/List/Set/queue (index) thì cho i=0 vì những loại này sẽ bắt đầu từ 0
		
		//For kết hợp if: Thỏa mãn điều kiện mới action
		//Biến đếm dùng để điều kiện để filter
		for (int i=1;i<cityName.length ; i++) {
			if(cityName[i].equals("Da Nang")) {
				//Action
				System.out.println(" Do action");
				break;
			}
		}
		
		for (int i=1;i<cityName.length ; i++) {
			if(cityName[i].equals("Da Nang")) {
				//Action
				System.out.println(" Do action");
			}
			//Nếu ko dùng break, tất cả các giá trị (element) đều được chạy qua dù đã thỏa mãn điều kiện rồi
		}
		
		//Dùng for để chạy hết giá trị
		for(int i=0;i<cityName.length; i++) {
			System.out.println(cityName[i]);
		}
	}
	
	@Test
	public void TC_02_For_Each() {
		String[] cityName = {"Ha Noi", "Ho Chi Minh","Da Nang","Can Tho"} ;
		for (String city : cityName) {
			System.out.println(city);	
		}
		
		//Java Collection
		//Class: ArrayList/LinkedList/Vector/..
		//Interface: List/ Set/ Queue
		List<String> cityAddress = new ArrayList<String>();
		
		//Complie (Coding)
		cityAddress.add("Bac Giang");
		cityAddress.add("Ha Giang");
		cityAddress.add("Sa Pa");
		
		System.out.println(cityAddress.size());
		
		//Runtime (Running)
		for (String city : cityName) {
			cityAddress.add(city);
		}
			
		
		
		
	}

}
