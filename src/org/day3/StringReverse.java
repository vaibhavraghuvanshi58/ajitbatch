package org.day3;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class StringReverse {
public static void main(String[] args) {
	String str1 = "2314789412348976";
	
	char[]  str1Ar = str1.toCharArray();
	char[] reverstrArr = new char[str1.length()];
	int counter = 0;
	for(int i = str1Ar.length-1 ; i >= 0 ; i--){
		reverstrArr[counter] = str1Ar[i];
		counter++;
	}
	
	String reverseString = new String(reverstrArr);
	System.out.println(reverseString);
}
}
