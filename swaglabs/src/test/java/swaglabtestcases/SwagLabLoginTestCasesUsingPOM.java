package swaglabtestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjects.SwagLabLoginPageObject;

public class SwagLabLoginTestCasesUsingPOM {
	@Test
	public void swaglabLogin() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		PageFactory.initElements(driver, SwagLabLoginPageObject.class);
		SwagLabLoginPageObject.username.sendKeys("standard_user");
		SwagLabLoginPageObject.password.sendKeys("secret_sauce");
		SwagLabLoginPageObject.login.click();
		driver.quit();

	}

}
