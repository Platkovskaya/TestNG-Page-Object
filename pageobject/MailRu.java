package by.htp.library.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailRu extends BasePage {

	private static final String LOGIN = "3788870@mail.ru";
	private static final String PASSWORD = "*************";

	@FindBy(name = "login")
	private WebElement login;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//*[@id='mailbox:submit']/input")
	private WebElement entrance;

	public MailRu(WebDriver driver) {
		super(driver);
		PageFactory.initElements(getDriver(), this);
	}

	public void authorization() {
		login.clear();
		login.sendKeys(LOGIN);
		
		password.clear();
		password.sendKeys(PASSWORD);
		
		entrance.click();
	}

}