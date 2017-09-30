package org.day1;

public class StaticNonStaticDemo {
	
	int j1 = i1+1;
	static int i1 = 10;
	
	public static void main(String[] args) {
		StaticVaribales stat1 = new StaticVaribales();
		stat1.increase();
		stat1.showValues();
		StaticVaribales stat2 = new StaticVaribales();
		stat2.increase();
		stat2.showValues();
	}
}
class StaticVaribales{
int i = 10;
static int s = 10;
public void increase(){
	i++;
	s++;
}
public void showValues(){
	System.out.println("i -> " + i);
	System.out.println("s -> " + s);
}
}
