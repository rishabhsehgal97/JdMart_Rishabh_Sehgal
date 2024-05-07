package TestCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import PageObjects.SignInPage;

public class TC_001 extends BaseClass {
	@Test

	public void SigninPage() throws InterruptedException {

		SignInPage SP = new SignInPage(driver);

		SP.ClickSigninButton();
		SP.EnterNameField(LoginName);
		SP.EnterMobNumField(LoginNumber);
		SP.ClickSubmitButton();
		Thread.sleep(2000);
		SP.EnterOTPField(OTPvalue);
		Thread.sleep(2000);
		SP.ClickOTPSubmit();

//		SP.ClickonMyJdMart();
//		System.out.println(SP.CheckLoggedinName());
	}
	
	@Test

	public void Homepage() throws InterruptedException, IOException {
		logger.info(
				"********************************************************************************************************************************");

		logger.info("URL is opened");

		PageObjects.Homepage HP = new PageObjects.Homepage(driver);

		HP.ClickLocationDropdown();
		logger.info("Dropdown selected");
		Thread.sleep(1500);
		HP.SelectLocationBLR();
		logger.info("Location Bangalore Selected from dropdown");
		Thread.sleep(1500);
		HP.ClickHealthandMedical();
		logger.info("Health & Medical Category page opened ");
		Thread.sleep(1500);

		if (driver.getCurrentUrl().equals("https://www.jdmart.com/Bangalore/Health-Medical/tid-2")) {
			Assert.assertTrue(true);
			logger.info("URl is Mathcing");
		} else {
			captureScreen(driver, "Homepage");
			Assert.assertTrue(false);
			logger.info("URl is not Mathcing");
		}
//
//		//logger.info("********************************************************************************************************************************");
	}

}





//	         
//
//
//}
//
//        
