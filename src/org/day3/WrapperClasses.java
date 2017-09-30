package org.day3;

public class WrapperClasses {
	public static void main(String[] args) {
		int i = 010; // Data type
		
		System.out.println(i);
		
		Integer i1 = 10; // Object
		System.out.println(i1.toBinaryString(i1));
		
		System.out.println(i1);
		
		Integer i2 = i; // Autoboxing
		int i4 = i2; // Unboxing
		
		String testnumber = "50.9";
//		Integer i5 = Integer.parseInt(testnumber);  // Parsing
//		int i6 = i5;
		Float fl = Float.parseFloat(testnumber);
		float hu = fl;
		
		double sh = 90.0;
		String jk = String.valueOf(sh);
		System.out.println(jk);
		
		Integer valueOftest = 90;
		String hj = String.valueOf(valueOftest);
		
		System.out.println(hj);
		//String.val
		hello(10,20);
		
		
	}
	
	public static int hello(int i, int j){
		return 89;
	}
}
