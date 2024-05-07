package TestCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.SignInPage;
import Utilities.XLUtils;

public class TC_002 extends BaseClass

{
	@Test(dataProvider="LoginData")
	public void LoginDDT(String LName, String LNum) throws InterruptedException
	{
		SignInPage SP = new SignInPage(driver);
		
		SP.ClickSigninButton();
		SP.EnterNameField(LName);
		SP.EnterMobNumField(LNum);
		SP.ClickSubmitButton();
		Thread.sleep(2000);
		SP.EnterOTPField(OTPvalue);
		Thread.sleep(2000);
		SP.ClickOTPSubmit();
	}
	
	
//	ß
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/TestData/LoginData.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);//1 0
			}
				
		}
	return logindata;
	}
	
}
