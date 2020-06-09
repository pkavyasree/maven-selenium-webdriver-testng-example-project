package testcases.mytheresa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverSettings {
	
	public WebDriver driverSettings() {
		System.setProperty("webdriver.gecko.driver","/usr/local/bin/geckodriver");
		WebDriver driver = new FirefoxDriver();
		return driver;
	       
	}

}
