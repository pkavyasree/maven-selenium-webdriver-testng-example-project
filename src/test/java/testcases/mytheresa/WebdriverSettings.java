package testcases.mytheresa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverSettings {
	
	public WebDriver driverSettings() {
		System.setProperty("webdriver.chrome.driver", "C:\Program Files (x86)\Google\Chrome\Application\chrome.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

}
