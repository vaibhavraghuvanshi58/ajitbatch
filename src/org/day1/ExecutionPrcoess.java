package org.day1;

public class ExecutionPrcoess {
	static int i = 10;
	static{
		i = i  +1;
		System.out.println("static block 1");
//		System.exit(1);
	}
	public static void main(String[] args) {
		System.out.println("Step1 " + i );
		ExecutionPrcoess ex =new ExecutionPrcoess();
		System.out.println("sdhsdkj");
	}
	public void hello(){
		System.out.println("jk");
	}
	
	{
		System.out.println("non static block");
	}
}