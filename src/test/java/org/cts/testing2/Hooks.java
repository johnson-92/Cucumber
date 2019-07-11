package org.cts.testing2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	public static WebDriver driver;
	
	@Before
	public static WebDriver method1() {
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\PRATHEEP A\\eclipse-workspace\\Testing1\\driver\\geckodriver (2).exe");
		   driver=new FirefoxDriver();
		   return driver;
	}
	@After
	public static void method2() {
		
		driver.close();
		driver.quit();
	}
	
}
