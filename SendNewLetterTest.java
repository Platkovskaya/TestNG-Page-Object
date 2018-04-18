package by.htp.library.example;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import by.htp.library.manager.DriverManager;
import by.htp.library.pageobject.Letter;
import by.htp.library.pageobject.MailBox;
import by.htp.library.pageobject.MailRu;
import by.htp.library.pageobject.SuccessLetter;

public class SendNewLetterTest {
	
	private MailRu mailRu;
	private MailBox mailBox;
	private Letter letter;
	private SuccessLetter successLetter;
	
	@BeforeTest
	public void init() {
		WebDriver driver = DriverManager.getDriver();
		driver.get("https://mail.ru");
		mailRu = new MailRu(driver);
		mailBox = new MailBox(driver);
		letter = new Letter(driver);
		successLetter = new SuccessLetter(driver);
	}
	
	@Test
	public void sendNewLetterTest() {
	
		mailRu.authorization();
		mailBox.makeNewLetter();
		letter.fillOutLetter();
		letter.sendLetter();
		
		Assert.assertTrue(successLetter.getSentTitle().contains("Ваше письмо отправлено"), "Wrong letter 'sent title'!");
	}
	
	@AfterTest
	public void finalization() {
		DriverManager.closeDriver();
	}

}
