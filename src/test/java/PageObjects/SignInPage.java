package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	WebDriver ldriver;

	public SignInPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	/******* FindBy *******/

	@FindBy(xpath = "//span[contains(@class,'jdmart_huser_icon')]")
	WebElement SignInButton;

	@FindBy(xpath = "//input[contains(@class,'loginnamefield')]")
	WebElement Namefield;

	@FindBy(xpath = "//input[contains(@class,'loginmobilefield')]")
	WebElement MobNumfield;

	@FindBy(xpath = "//div[@class='jdmart_login_action']//button")
	WebElement SubmitButton;

	@FindBy(xpath = "//div[contains(@class,'jdmart_login_otpfield')]/input")
	WebElement OTPfield;

	@FindBy(xpath = "//div[contains(@class,'jdmart_login_otpfield')]/input")
	List<WebElement> EnterOTP;

	@FindBy(xpath = "//div[contains(@class,'jdmart_login_otpmsg')]//following-sibling::div//button")
	WebElement OTPSubmit;

	@FindBy(className = "jdmart_menuanchor")
	WebElement MyJdMart;

	@FindBy(xpath = "//div[contains(@class,'jdmart_profile_name')]")
	WebElement LoggedInName;

	@FindBy(xpath = "")
	WebElement OtpPageName;

	
	

	/******* Methods *******/


	public void ClickSigninButton() 
	{
		SignInButton.click();

	}

	public void EnterNameField(String LoginName) 
	{
		Namefield.sendKeys(LoginName);

	}

	public void EnterMobNumField(String LoginNumber) 
	{
		MobNumfield.sendKeys(LoginNumber);

	}
	

	public void ClickSubmitButton() 
	{
		SubmitButton.click();

	}
	
	public void EnterOTPField(String OTPvalue)
	{
	//	String[] OtpArray = OTPvalue.split("");
		
		for (int i = 0; i<EnterOTP.size(); i++)
		{
			//OTPvalue.sendKeys(EnterOTP.get(i),OtpArray[i]);
			
		}

	}


	public void ClickOTPSubmit() 
	{
		OTPSubmit.click();

	}
	

	public void ClickonMyJdMart() 
	{
		MyJdMart.click();

	}

	public String CheckLoggedinName() 
	{
		return LoggedInName.getText();

	}
	
	

}
