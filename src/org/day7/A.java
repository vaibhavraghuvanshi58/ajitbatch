package org.day7;

public class A {
public static void main(String[] args) {
	B b = new B();
	b.go();
	b.go();
	
	B.hello();
	
}
}


class B{
	
	B(){
		this(5);
		System.out.println("i am in construtor");
	}
	
	B(int i){
		System.out.println("i am int wala construnctor");
	}
	
	public void go(){
		hello();	
	}
	
	public static void hello(){
		
	}
}
