package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public static WebDriver driver;
	
	public static WebDriver getDriver() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\PRATHEEP A\\eclipse-workspace\\Testing1\\driver\\geckodriver (2).exe");
		driver=new FirefoxDriver();
		return driver;
	}
	
	public static void quitBrowser() {
		driver.quit();
	}

}
