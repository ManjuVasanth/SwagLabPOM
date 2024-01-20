package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutInfoPageObject {

	@FindBy(id = "first-name")
	public static WebElement firstname;
	
	@FindBy(id = "last-name")
	public static WebElement lastname;
	
	@FindBy(id = "postal-code")
	public static WebElement postalcode;
	
	@FindBy(xpath = "//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")
	public static WebElement continuebtn;
}
