package org.seleniumday1;

import java.util.List;

import org.common.Driver;
import org.common.FileFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment1 {
	
	@Test
	public static void main() {
		
		WebDriver driver = Driver.getChrome();
		// Navigate to Google Selenium SERP
		driver.get("https://www.google.co.in/search?source=hp&q=java");
		
		// Clicking on Third Link
		String prevTitle = driver.getTitle();
		int counter = 0;
		
		List<WebElement> ls = driver.findElements(By.tagName("h3"));
		System.out.println(ls.size());
		for(int i = 0 ; i < ls.size() ; i++){
			WebElement elem = ls.get(i);
			if(elem.getAttribute("class").equals("r")){
				counter++;
				
				if(counter == 3){
					System.out.println("Clicking");
					elem.findElement(By.tagName("a")).click();
					break;
				}
			}
			
		}
		String currentTitle = driver.getTitle();
		if(prevTitle.equals(currentTitle)){
			Assert.assertFalse(true, prevTitle + " not matched with " + currentTitle);
		}
		
		WebElement body = driver.findElement(By.tagName("body"));
		String text = body.getText();
		//System.out.println(text);
		
		FileFunctions.writeFile("C:/Users/User1/Desktop/Class_ppt/fileio/output.txt", text);
		
	}
}
