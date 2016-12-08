package tests;

import org.testng.annotations.Test;
import basicPage.*;

public class DeleteOneMessage extends SuperTest {

	private MailPage mailPage = null;
	private LoginPage loginPage = null;

	@Test
	public void deleteLastMessage() throws InterruptedException{
		System.out.println("--Тест удаление последнего сообщения--");
		loginPage = new LoginPage(driver, Service.URL);
		mailPage = loginPage.login();
		mailPage.removeLastMessage();
	}
}
