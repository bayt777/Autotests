package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class SuperTest {

	public WebDriver driver = null;
	
	@BeforeClass
	public void init() {
		this.driver = new FirefoxDriver();
	}
	
	@AfterClass
	public void close() {
		driver.close();
		System.out.println("--Done--");
	}
}	