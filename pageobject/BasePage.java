package by.htp.library.pageobject;

import org.openqa.selenium.WebDriver;

public class BasePage {

	private WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver getDriver() {
		return this.driver;
	}
	
}
