package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	WebDriver ldriver;

	public Homepage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	/******* FindBy *******/

	@FindBy(id = "mainctypeinput")
	WebElement LocationDropdown;

	@FindBy(xpath = "//div[contains(text() ,'Bangalore')]")
	WebElement SelectBLRLocation;

	@FindBy(xpath = "//a[@title='Health & Medical']")
	WebElement HealthandMedical;


	
	
	

	/******* Methods *******/


	public void ClickLocationDropdown() 
	{
		LocationDropdown.click();

	}

	public void SelectLocationBLR() 
	{
		SelectBLRLocation.click();

	}

	public void ClickHealthandMedical() 
	{
		HealthandMedical.click();

	}

	
	

}
