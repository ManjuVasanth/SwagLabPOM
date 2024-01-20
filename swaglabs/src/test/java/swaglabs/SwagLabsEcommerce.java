package swaglabs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SwagLabsEcommerce {
	public static void main(String[] args) {
		System.setProperty("weddriver.chrome.driver", "D:\\Manju\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
		WebElement backpack = driver.findElement(By.id("item_4_title_link"));
		backpack.click();
		WebElement addToCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		addToCart.click();
		WebElement shoppingCart = driver.findElement(By.id("shopping_cart_container"));
		shoppingCart.click();
		WebElement checkOut = driver.findElement(By.id("checkout"));
		checkOut.click();
		//driver.quit();
		WebElement firstname = driver.findElement(By.id("first-name"));
		firstname.sendKeys("Mickey");
		WebElement lastname = driver.findElement(By.id("last-name"));
		lastname.sendKeys("Mouse");
		WebElement postalCode = driver.findElement(By.id("postal-code"));
		postalCode.sendKeys("23456");
		WebElement continueCheckOut = driver.findElement(By.id("continue"));
		continueCheckOut.click();
		WebElement finishCheckout = driver.findElement(By.id("finish"));
		finishCheckout.click();
		driver.navigate().to("https://www.saucedemo.com/");
		
		
	}

}
