package org.day8;

import org.testng.annotations.Test;

public class TestNGDemo {
	
@Test
void mehod1(){
	System.out.println("m1");
}

@Test
void mehod2(){
	System.out.println("m2");
	
}

@Test
void mehod3(){
	
	System.out.println("m3");
}

@Test
public static void main(String[] st) {
	System.out.println("m4");
}
}
