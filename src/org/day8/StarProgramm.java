package org.day8;

import java.io.Console;

public class StarProgramm {
public static void main(String[] args) {
//	Scanner scan = new Scanner(System.in);
//	System.out.println("Enter you Star Count ");
//	int j = scan.nextInt();
//	System.out.println("==========================");
//	
//	
//	
//	for(int i = 1 ;i <= j ;i++){
//		for(int k = i ; k <= j ; k++){
//			System.out.print("*");
//		}
//		System.out.println();
//	}
	
	Console console = System.console();
	System.out.print("Username: ");
	String username = console.readLine();
	
	System.out.print("Password: ");
	char[] ipassword = console.readPassword();
	String password = new String(ipassword);
	System.out.println("you entered " +password);
	
	System.out.println("you r logged in");
}
}
