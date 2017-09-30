package org.day1;

public class IfElseConditionDemo {
	public static void main(String[] args) {
		int age = 50;
		String type = "";
		if(age > 18 && age < 30){
			type = "adult";
		}else if(age > 30 && age < 45){
			type = "middle age";
		}else if(age > 45 && age < 70){
			type = "old age";
		}else{
			type = "child";
		}

		
		
		
		//		type = age >18 ? "adult" : "child"; // ternary operator ?:

		System.out.println(type);
	}
}
