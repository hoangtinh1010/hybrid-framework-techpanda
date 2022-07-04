package javaBasic;

public class Topic_05_Casting {
	
	public static void main(String[] args) {
		//Ngầm định = Không mất dữ liệu
//		byte bNumber = 126;
//		System.out.println(bNumber);
//		
//		short sNumber = bNumber;
//		System.out.println(sNumber);
//		
//		int iNumber = sNumber;
//		System.out.println(iNumber);
//		
//		long lNumber = iNumber;
//		System.out.println(lNumber);
//		
//		float fNumber = lNumber;
//		System.out.println(fNumber);
//		
//		double dNumber = fNumber;
//		System.out.println(dNumber);
		
		//Tường minh (Cast)
		
		double dNumber = 6543233;
		
		float fNumber = (float) dNumber ;
		
		long lNumber = (long) fNumber;
		
		int iNumber = (int) lNumber;
		
		short sNumber = (short) iNumber;
		
		byte bNumber = (byte) sNumber;
		
		
	}

}
