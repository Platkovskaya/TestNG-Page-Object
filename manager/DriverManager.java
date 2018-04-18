package by.htp.library.manager;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

	private static WebDriver driver;
	
	public static WebDriver getDriver() {
		
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "d:\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		}
		
		return driver;
	}
	
	public static void closeDriver() {
	    driver.close();
        driver.quit();
    }
	
}
