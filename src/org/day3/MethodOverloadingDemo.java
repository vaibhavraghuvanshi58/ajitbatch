package org.day3;

public class MethodOverloadingDemo {
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		//int p = calc.add(10, 12, 23);
		int p = calc.add(13, 67);
		System.out.println(p);
		
	}
}


class Calculator{
	int add(int i,int j){
		System.out.println("Calculator->add(int i,int j)");
		int k= i + j ;
		return k;
	}
	int add(int i,long j){
		System.out.println("Calculator->add(int i,long j)");
		int k= i + (int)j ;
		return k;
	}
	int add(long i,int j){
		System.out.println("Calculator->add(int i,long j)");
		int k= (int)i + j ;
		return k;
	}


}
