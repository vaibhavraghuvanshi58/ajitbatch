package org.day8;

import java.io.FileInputStream;
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args)throws Exception {
	Scanner input = new Scanner(new FileInputStream("C:/Users/User1/Desktop/Class_ppt/Cursor.txt"));	
//	System.out.println("Gimme your input ");
//	double nl = input.nextDouble();
//	System.out.println(nl);
	
	
	while(input.hasNext()){
		System.out.println(input.nextLine());		
	}
//	for(int i = 1 ;i < 10 ;i++){
//	}
	
//	System.out.println("Gimme your input ");
//	nl = input.nextLine();
//	System.out.println(nl);
//	
//	System.out.println("Gimme your input ");
//	nl = input.nextLine();
//	System.out.println(nl);
	}
}
