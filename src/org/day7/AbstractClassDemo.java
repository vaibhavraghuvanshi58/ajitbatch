package org.day7;

public class AbstractClassDemo {
	public static void main(String[] args) {
		//R1 r  =new R1();
		// Object nhi bante hian 
		//  we cn only extends them
		
		R1 r1 = new Y1();
		r1.hello();
		

	}
}

final class F1{
	
}

abstract class R1{

	abstract public void hello();
	
	private void privateMethod(){
		System.out.println("sdfjhsda");
	}
	public void go(){
		privateMethod();
		System.out.println("hello");
	}
}

class Y1 extends R1{

	@Override
	public void hello() {
		// TODO Auto-generated method stub

	}


	public void hello1() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void go() {
		// TODO Auto-generated method stub
		super.go();
	}

}