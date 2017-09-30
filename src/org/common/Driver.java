package org.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {
	
	public static WebDriver getChrome(){
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize(); //fullscreen
		return driver;
	}
	
	public static WebDriver getIE(){
		System.setProperty("webdriver.ie.driver", "C:/ProgramData/jars/driver/IEDriverServer/3.5/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize(); //fullscreen
		return driver;
	}
}
