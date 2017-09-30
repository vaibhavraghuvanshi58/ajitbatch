package org.day1;

import org.day1.C1;

public class Methods {
	
	
	public static void main(String[] args) {
	Methods m1 = new Methods();
	C1 c1 = new C1();
//	int kl = m1.add(10, 20);
//	kl = m1.add(kl, kl);
//	System.out.println(kl);
	
	}
	
	String add(int i, int j){
		int k = i + j;
		
		if(k > 18){
			return "adult";
		}else if(k  > 10){
			return "child";
		}
		return "hello";
	}
	
}
