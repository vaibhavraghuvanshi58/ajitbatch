package org.day1;

public class AccessModifier {

	public void publicMethod(){
		
	}
	void defaultMethod(){
		privateMethod();
	}
	private void privateMethod(){
			
	}
}

class CR{
	public static void main(String[] args) {
		AccessModifier mod1 = new AccessModifier();
		mod1.defaultMethod();
		mod1.publicMethod();
		
	}
}
