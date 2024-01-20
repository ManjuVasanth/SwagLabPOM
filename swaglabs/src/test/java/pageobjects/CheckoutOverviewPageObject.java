package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOverviewPageObject {

	@FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]")
	public static WebElement finish;
}
