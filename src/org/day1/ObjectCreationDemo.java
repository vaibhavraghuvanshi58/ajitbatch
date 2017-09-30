package org.day1;

public class ObjectCreationDemo {
	public static void main(String[] args) {
		
		// Object Create
		TestCase tc4 ;
		
		TestCase tc7 = new TestCase();
		tc7.checkForTestCasePass();
		
		System.out.println(tc7);
		
		
		
//		TestCase tc1 = new TestCase(5);
//		tc1.checkForTestCasePass();
//		tc1.checkForTestCasePass1();
		
		
		
//		TestCase tc2 = new TestCase();
//		tc2.checkForTestCasePass();
		// Space allocate -> Instantiation
		// TestCase() -> Construnction
	}
}


class TestCase{
	
	int ch = 10;
	static int hj = 30;
	// Default Constructor
	TestCase(){
		this(6);
		
		System.out.println("Default");
		ch= 10;
	}
	
	TestCase(int i){
		// logic written here
		this(6,7);
		System.out.println("1param");
		ch= 50;
	}
	TestCase(int i, int j){
		
		// logic written here
		System.out.println("2param");
		ch= 100; 
	}
	
	public void TestCase(){
		
	}
	
	int totalTestSteps;
	String testName;
	String testCreatedBy;
	TestStep[] testSteps;
	
	public void checkForTestCasePass(){
		// logic here
		System.out.println("TestCase -> checkForTestCasePass()");
	}
	public void checkForTestCasePass1(){
		// logic here
		System.out.println("TestCase -> checkForTestCasePass1()");
	}
}

class TestStep{
	int stepNumber;
	String ExpectedCondition;
	String ActualCondition;
	boolean isPass;
	
	public void checkForPass(){
		if(ExpectedCondition.equals(ActualCondition)){
			isPass = true;
		}else{
			isPass = false;
		}
	}
	
}