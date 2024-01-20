package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SwagLabYourCartPageObject {

	@FindBy(xpath = "//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")
	public static WebElement checkout;
}
