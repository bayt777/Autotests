package basicPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import basicPage.Service;

public class LoginPage extends Page {

	@FindBy(id = "mailbox__login")
	private WebElement loginField;

	@FindBy(id = "mailbox__password")
	private WebElement passwordField;

	@FindBy(xpath = ".//*[@class='w-mailbox__auth__button w-mailbox__auth__button_main']")
	private WebElement loginButton;

	public LoginPage(WebDriver driver, String Url) {
		super(driver);
		PageFactory.initElements(driver, this);
		driver.get("https://" + Url);
		validatePage();
	}

	@Override
	public String getPageId() {
		return "mailbox";
	}

	public MailPage login() throws InterruptedException {
		loginField.clear();
		loginField.sendKeys(Service.login);
		passwordField.clear();
		passwordField.sendKeys(Service.password);
		Thread.sleep(1000);
		loginButton.click();
		Thread.sleep(10000);
		return new MailPage(driver);
	}
}
