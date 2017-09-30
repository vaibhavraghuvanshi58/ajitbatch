package org.day5;

public class ArrayCRDemo {
	final static int[] iArray = new int[5];
	public static void main(String[] args) {
		
		iArray[0] =10;
		
		for(int i: iArray){
			System.out.print(i +" ");
		}
		System.out.println();
		System.out.println("---------------");
		
		changeMyValue(iArray,1,45);
		changeMyValue(iArray,2,50);
		changeMyValue(iArray,3,90);
		changeMyValue(iArray,4,40);
		changeMyValue(iArray,0,98);
		
		for(int i: iArray){
			System.out.print(i +" ");
		}
		System.out.println();
		System.out.println("---------------");
	}
	
	public static void changeMyValue(int[] iar, int indexValue, int chnageValue){
		iar[indexValue] = chnageValue;
	}
}
