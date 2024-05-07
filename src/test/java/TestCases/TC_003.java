package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.RFQPopup;

public class TC_003 extends BaseClass

{
	@Test
	public void RFQTest() throws InterruptedException, IOException {
		RFQPopup RP = new RFQPopup(driver);

		Thread.sleep(10000);
	

		if (RP.CheckGBDHeading().equals("Get Best Deal")) 
		{
			Assert.assertTrue(true);
			logger.info("RFQPopup Heading is correct");
		} else 
		{
			captureScreen(driver, "RFQTest");
			Assert.assertTrue(false);
			logger.info("RFQPopup Heading is incorrect");

		}
		Thread.sleep(1500);
		RP.RFQPopupClose();
		logger.info("RFQPopup Closed");
	

	}
	
}
