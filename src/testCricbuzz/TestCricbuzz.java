package testCricbuzz;

import org.common.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCricbuzz {
	
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = Driver.getChrome();
		driver.get("https://www.google.co.in");
		driver.findElement(By.id("lst-ib")).sendKeys("Cricbuzz");
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.xpath(".//*[@id='rso']/div[1]/div/div/div/div/h3/a")).click();
		driver.findElement(By.xpath(".//*[@id='rso']/div[1]/div/div/div/div/h3/a")).click();
		
		//driver.manage().timeouts().;
	    driver.findElement(By.className("Live Cricket Score")).click();
	       
	    
	    //driver.close();
			
	}
}

