package org.day4;

public class TestCaseExecutor {
	public void buildTest(String testID){
		
		System.out.println("start executing " + testID);
		
		TestStep ts1 = new TestStep();
		ts1.stepName = "step1";
		
		TestStep ts2 = new TestStep();
		ts2.stepName = "step2";
		
		TestStep[] tsteparray = new TestStep[2];
		tsteparray[0] = ts1;
		tsteparray[1] = ts2;
		
		
		TestCase tc1 = new TestCase();
		tc1.TestSteps = tsteparray;
		runTest(tc1);
		// Reporting code
		
		TestStep[] allsteps =  tc1.TestSteps;
		for(int i = 0; i < allsteps.length ; i++){
			
			if(allsteps[i].stepStatus == false){
				tc1.TestCaseStatus = false;
			}
			System.out.println(allsteps[i].stepName + " -> " + allsteps[i].stepStatus);
		}
		
		if(tc1.TestCaseStatus ==  true){
			System.out.println(testID + " is Passed");
		}else{
			System.out.println(testID + " is Failed");			
		}
	}
	
	
	public void runTest(TestCase tc){
		TestStep[] steps = tc.TestSteps;
		for(int i = 0; i < steps.length ; i++){
			TestStep ts1 = steps[i];
			System.out.println("Running " + ts1.stepName);
			ts1.stepStatus = true;
		}
	}
}
