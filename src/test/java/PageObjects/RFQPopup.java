package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RFQPopup {

	WebDriver ldriver;

	public RFQPopup(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	/******* FindBy *******/

	@FindBy(xpath = "(//div[@class='rfqdeal_pop_text']//span)[1]")
	WebElement GetBestDealHeading;

	@FindBy(xpath = "//div[contains(@class,'jdmart_modal_close')]")
	WebElement RFQClose;

	/******* Methods *******/

	public String CheckGBDHeading() 
	{
		return GetBestDealHeading.getText();

	}

	public void RFQPopupClose() 
	{
		RFQClose.click();

	}

}
