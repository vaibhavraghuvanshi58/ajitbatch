package org.day5;

public class CalByRefByValDemo {
	
	public static void main(String[] args) {
		CalByRefByValDemo demo = new CalByRefByValDemo();
//		int i = 90;
//		int j = 70;
//		i = demo.ChangeMyValue(i, j);
		
		Calc cv = new Calc();
		cv.i = 90;
		demo.ChangeMyValue(cv);
		
		System.out.println("i -> " + cv.i);
		
//		System.out.println("j -> " + j);
	}
	public int ChangeMyValue(int i,int j){
		i = 10;
		j = 20;
		return i;
	}
	public void ChangeMyValue(Calc cal){
		cal.i = 10;
	}
}

class Calc{
	int i = 10;
}
