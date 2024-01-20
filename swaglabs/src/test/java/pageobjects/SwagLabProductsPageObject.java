package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SwagLabProductsPageObject {

	@FindBy(xpath = "//*[@id=\"item_4_title_link\"]/div")
	public static WebElement backpack;

	
}
