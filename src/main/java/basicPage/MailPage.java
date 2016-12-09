package basicPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailPage extends Page {

	public MailPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		validatePage();
	}

	@FindBy(xpath = ".//*[@class='b-datalist__item__panel']")
	private WebElement message;

	@FindBy(xpath = ".//*[@class='b-datalist__body']/div[1]//*[@class='js-item-checkbox b-datalist__item__cbx']/div/div[1]")
	private WebElement checkBoxSelect;

	@FindBy(xpath = ".//*[@class='b-toolbar__group']//*[@class='b-dropdown__ctrl']/div[1]/div[1]")
	private WebElement checkBoxSelectAll;

	@FindBy(xpath = ".//*[contains(text(),'Удалить')]")
	private WebElement remove;

	@Override
	public String getPageId() {
		return "LEGO";
	}

	public void removeAllMessages() throws InterruptedException {
		while (message.isDisplayed()) {
			try {
				message.isDisplayed();
				checkBoxSelectAll.click();
				Thread.sleep(3000);
				remove.click();
				Thread.sleep(3000);
			} catch (Exception e) {
				System.out.println("Писем нет для удаления");
			}
		}
	}

	public void removeLastMessage() throws InterruptedException {
		try {
			checkBoxSelect.isDisplayed();
			checkBoxSelect.click();
			Thread.sleep(3000);
			remove.click();
		} catch (Exception e) {
			System.out.println("Писем нет для удаления");
		}
	}

}
