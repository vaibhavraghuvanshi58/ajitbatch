package org.seleniumday1;

import org.common.Driver;
import org.openqa.selenium.WebDriver;

public class Cricbuzz {
	public static void main(String[] args) {
		WebDriver driver = Driver.getChrome();
		driver.get("http://www.cricbuzz.com/live-cricket-scores/16852/eng-vs-wi-1st-test-west-indies-tour-of-england-2017");
		System.out.println(driver.getTitle());
	}
}
