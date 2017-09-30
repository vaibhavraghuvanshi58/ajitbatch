package org.day7;

public class DynamicDispatchDemo {
	public static void main(String[] args) {
		A1 c1 = new C();
		c1.common();
		//c1.b1();
	}
}

class A1{
	
	public void a1(){
		
	}
	public void common(){

	}
}
class B1 extends A1{
	public void b1(){

	}
	public void common(){

	}

}
class C extends B1{
	public void c(){

	}
	public void common(){

	}

}
