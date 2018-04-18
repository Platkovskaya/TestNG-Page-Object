package by.htp.library.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuccessLetter extends BasePage {

	@FindBy(className = "message-sent__title")
	private WebElement sentTitle;
	
	public SuccessLetter(WebDriver driver) {
		super(driver);
		PageFactory.initElements(getDriver(), this);
	}
	
	public String getSentTitle() {
		return sentTitle.getText();
	}
	
}
