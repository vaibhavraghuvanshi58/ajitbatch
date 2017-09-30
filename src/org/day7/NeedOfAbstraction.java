package org.day7;

public class NeedOfAbstraction {
	public static void main(String[] args) {
		T3 t3 = new T3();
		t3.method1();
	}
}

class T1{
	public void method1(){
		System.out.println("T1-> method1");
	}
}

class T2{
	public void method1(){
		System.out.println("T2-> method1");
	}
}

class T3 extends T1{
	
}

