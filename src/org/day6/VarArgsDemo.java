package org.day6;

public class VarArgsDemo {

	public  int add(int uj,int...incoming ){
		int sum = 0;
		for(int i = 0 ; i < incoming.length ;i++){
			sum = sum + incoming[i];
		}
		return sum;
	}
	
	public static final void main(String...args) {
		VarArgsDemo ob = new VarArgsDemo();
		System.out.println(ob.add(8));
		System.out.println(ob.add(1,'A'));
		System.out.println(ob.add(5,2));
		System.out.println(ob.add(3,5,6,7,8,8,5,5,4,4,4));
		System.out.println(ob.add(4,7,8,5,5));
		System.out.println(ob.add(3,8,3,4));
		
		
	}
}
