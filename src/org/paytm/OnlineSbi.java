package org.paytm;

import java.util.concurrent.TimeUnit;

import org.common.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OnlineSbi {
	public void accountOpencase()throws Exception{

		WebDriver wd = Driver.getChrome();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("https://onlinesbi.com/");

		wd.findElement(By.xpath("//label[text()='Mobile Number']/parent::div/input")).sendKeys("");
wd.quit();

	}
}
