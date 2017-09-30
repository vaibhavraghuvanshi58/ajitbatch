package org.day5;

public class ArrayWithFinal {

	int y2 = y+10;
	static int y = 90;

	public static void main(String[] args) {
		//	int x=9;
		System.out.println(x);
		x =9;
		System.out.println(x);
		changeme();
		System.out.println(x);
	}
	
	static int x = 10;

	public static void changeme(){
		x = 60;
	}


}
