package by.htp.library.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Letter extends BasePage {

	@FindBy(xpath = "//*[@data-original-name='To']")
	private WebElement to;
	
	@FindBy(name = "Subject")
	private WebElement subject;
	
	@FindBy(id = "tinymce")
	private WebElement content;
	
	@FindBy(xpath = "//span[contains(., 'Отправить')]")
	private WebElement sendLetter;
	
	@FindBy(xpath = "//iframe[@scrolling='auto']")
	private WebElement contentFrame;
	
	public Letter(WebDriver driver) {
		super(driver);
		PageFactory.initElements(getDriver(), this);
	}
	
	public void fillOutLetter() {
		to.clear();
		to.sendKeys("marusy.net@mail.ru");
		
		subject.clear();
		subject.sendKeys("From Irina");
		
		getDriver().switchTo().frame(contentFrame);
		
		content.clear();
		content.sendKeys("Hello Masha! How are you? Do you like to stading java?");
		
		getDriver().switchTo().defaultContent();
	}
	
	public void sendLetter() {
		sendLetter.click();
	}
	
}