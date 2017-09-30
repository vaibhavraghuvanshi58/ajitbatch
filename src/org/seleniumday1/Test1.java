package org.seleniumday1;

import java.util.concurrent.TimeUnit;

import org.common.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 extends Thread{
	
	String TextToRun ;
	Test1(String inputStr){
		TextToRun = inputStr;
	}
	public static void main(String[] args) {
		//new Test1().run();
		for(int i = 1; i  < 5 ; i++){
			Thread th = new Thread(new Test1("test" + i));
			th.start();
		}
		
	}
	
	public void run(){
		
		WebDriver driver = Driver.getChrome();
		driver.get("http://www.google.com");
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		//driver.manage().window().maximize();
		
		By by = By.name("q");
		WebElement elem = driver.findElement(by);
		elem.sendKeys(TextToRun);
		
		By by1 = By.name("btnK");
		WebElement elem1 = driver.findElement(by1);
		elem1.click();

	}
}
