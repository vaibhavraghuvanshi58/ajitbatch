package org.day7;

public class P1 {
	public static void main(String[] args) {
		
//		P2 p = new P2(); // HAS A Relationship
//		p.parentMethod();
		
		P2 c1 = new P2();
		c1.parentMethod();
		
//		C1 c1 = new C1();
//		c1.childMethod();
//		c1.parentMethod();
		// C1 is a P2 
		
		
	}
}

class Z1{
	public void parentMethod(){
		System.out.println("Z1 -> parentMethod()");
	}
}

class P2 extends Z1{
	public void parentMethod(){
		System.out.println("P2->parentMethod");
	}
	public void z1parentmethod(){
		super.parentMethod();
	}
}

class C1 extends P2{
	public void parentMethod(){
		System.out.println("C1->childMethod");
	}
	public void P2parentMethod(){
		super.parentMethod();
	}
}
