package org.day1;

public class OperatorDemo {
	/**
	 * This main method is very important to run your code
	 */
	public static void main(String[] args) {
		int i = 10;
		
		// increment and decrement
		// pre increment - first increase then assign
		// post increment - first assign then increase
		int j = ++i + i-- + i++ + --i + i++ + i-- + ++i;
		//11 + 11 + 10 + 10 + 10 +11 + 11
		System.out.println(j);
		
		i = i + 5; 
		i -=6; 
		i =  i +6;
		
		i++; //  1 increase
		
	//	bitwise operator
		
		
		/* AND
		 *  T & T = T
		 *  T & F = F
		 *  F & T = F
		 *  F & F = F 
		 */
		// logical operator && ||
		
		
		/*
		 * OR
		 *  T | T = T
		 *  T | F = T
		 *  F | T = T
		 *  F | F = F 
		 */
		
	}
}
