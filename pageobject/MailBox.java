package by.htp.library.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailBox extends BasePage {

	@FindBy(linkText = "Написать письмо")
	private WebElement newLetter;
	
	public MailBox(WebDriver driver) {
		super(driver);
		PageFactory.initElements(getDriver(), this);
	}
	
	public void makeNewLetter() {
		newLetter.click();
	}
	
}