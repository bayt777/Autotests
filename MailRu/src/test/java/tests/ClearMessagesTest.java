package tests;

import basicPage.Service;
import basicPage.MailPage;
import basicPage.*;

import org.testng.annotations.Test;

public class ClearMessagesTest extends SuperTest {

	private MailPage mailPage = null;
	private LoginPage loginPage = null;
    
	@Test
	public void deleteInboxMessages() throws InterruptedException {
		System.out.println("--Тест удаление 200 сообщений--");
		loginPage = new LoginPage(driver, Service.URL);
		mailPage = loginPage.login();
		mailPage.removeAllMessages();
	}
}