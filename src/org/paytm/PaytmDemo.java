package org.paytm;

import java.util.concurrent.TimeUnit;

import org.common.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PaytmDemo {

	//@Test
	public void paytmTestcase()throws Exception{

		WebDriver wd = Driver.getChrome();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("https://paytm.com/");

		wd.findElement(By.xpath("//label[text()='Mobile Number']/parent::div/input")).sendKeys("");
		 wd.quit();

	}

	//@Test
	public void vodafoneRechargeTestcase()throws Exception{
		WebDriver wd = Driver.getChrome();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("https://shop.vodafone.in/shop/prepaid/easy-online-recharge.jsp");

		wd.findElement(By.xpath("//input[@id='mobileNum']")).sendKeys("9764326834");
		wd.findElement(By.xpath("//input[@id='rechAmount']")).sendKeys("100");
		wd.findElement(By.xpath("//a[@title='Go']")).click();
		Thread.sleep(10000);

		wd.findElement(By.xpath("//input[@id='rechAmount']")).sendKeys("100");
		wd.findElement(By.xpath("//a[@title='Go']")).click();
		wd.findElement(By.xpath("//a[text()='Buy now ']")).click();
		wd.quit();
	}
	public static void main(String[] args) throws Exception{
		new PaytmDemo().paytmTestcase();
	}
}
