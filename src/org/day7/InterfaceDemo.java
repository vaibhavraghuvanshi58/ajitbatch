package org.day7;

public class InterfaceDemo {

}

interface inter1{
	int i = 10; // static, final, public
	 void m1();
	 void m2(); 
}

interface inter2 {
	int i = 12; 
	 void m4();
	 void m2(); 
}

class Z11 implements inter1 ,  inter2{
	
	@Override
	public void m4() {
		// TODO Auto-generated method stub
	int j = inter2.i+10;
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
}
