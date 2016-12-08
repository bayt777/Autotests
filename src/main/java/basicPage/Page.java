package basicPage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public abstract class Page {

	protected WebDriver driver = null;

	public Page(WebDriver driver) {
		this.driver = driver;
	}

	public abstract String getPageId();

	public boolean validatePage() {
		String pageName = (this.getClass().getSimpleName()).replaceAll("\\d+", "").replaceAll("(.)([A-Z])", "$1 $2");
		if (this.isElementPresent(
				By.xpath("//*[contains(@id,'" + getPageId() + "') or contains(@class,'" + getPageId() + "')]"))) {
			System.out.println("То что надо!!!" + pageName);
			return false;
		} else {
			System.out.println("Не то!!!" + pageName);
			return true;
		}
	}

	public boolean isElementPresent(By by) {
		try {
			driver.findElement(by).isDisplayed();
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}
