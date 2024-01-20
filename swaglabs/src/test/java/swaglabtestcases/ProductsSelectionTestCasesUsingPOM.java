package swaglabtestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobjects.SwagLabLoginPageObject;
import pageobjects.SwagLabProductsPageObject;

public class ProductsSelectionTestCasesUsingPOM {
	@Test
	public void productSelection() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/v1/");
		
		PageFactory.initElements(driver, SwagLabLoginPageObject.class);
		SwagLabLoginPageObject.username.sendKeys("standard_user");
		SwagLabLoginPageObject.password.sendKeys("secret_sauce");
		SwagLabLoginPageObject.login.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/v1/inventory.html");
	
		PageFactory.initElements(driver, SwagLabProductsPageObject.class);
		SwagLabProductsPageObject.backpack.click();
		

	}
	

}
