package testcases.mytheresa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverSettings {
	
	public WebDriver driverSettings() {
		System.setProperty("webdriver.gecko.driver","/usr/local/bin/geckodriver");
	        driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		return driver;
	}

}
