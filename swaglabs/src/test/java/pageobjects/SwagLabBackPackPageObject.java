package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SwagLabBackPackPageObject {
	
	@FindBy(xpath = "//*[@id=\"inventory_item_container\"]/div/div/div/button")
	public static WebElement addToCart;
	
	@FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a/span")
	public static WebElement shoppingCart;

}
