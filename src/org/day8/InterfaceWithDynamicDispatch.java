package org.day8;

public class InterfaceWithDynamicDispatch {
	public static void main(String[] args) {
		Bank b1 = null ;
		String inputFromUser = "PNB";
		
		if(inputFromUser.equals("SBI")){
			b1= new SBI();
		}else if(inputFromUser.equals("ICICI")){
			b1= new ICICI();
		}else if(inputFromUser.equals("PNB")){
			b1= new PNB();
		}
		
//		else if(inputFromUser.equals("HDFC")){
//			b1= new HDFC();
//		}
		
		
		int irate = b1.getInterestRate();
		int totalMoney = irate + 100;
		System.out.println(totalMoney);
		
		int i1rate = b1.getPersonalLoanPercentage();
		int totalMoney1 = i1rate + 100;
		System.out.println(totalMoney1);
		
		
	}
}

interface Bank{
	public int getInterestRate();
	public int getPersonalLoanPercentage();
}


class SBI implements  Bank{
	public int getInterestRate() {
		return 9;
	}
	public int getPersonalLoanPercentage() {
		return 12;
	}
	public int getPersonalLoanPercentageForSpecialSBICustomer(){
		return 16;
	}
}

class PNB implements  Bank{
	public int getInterestRate() {
		return 10;
	}
	public int getPersonalLoanPercentage() {
		return 14;
	}
	public int getPersonalLoanPercentageForSpecialPNBCustomer(){
		return 16;
	}
}

class ICICI implements  Bank{
	public int getInterestRate() {
		return 12;
	}
	public int getPersonalLoanPercentage() {
		return 20;
	}

	public int getPersonalLoanPercentageForSpecialCustomer(){
		return 16;
	}
}
