package TestCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Utilities.ReadConfig;

public class BaseClass {

	ReadConfig readconfig = new ReadConfig();

	public String baseURL = readconfig.getbaseURL();
	public String LoginName = readconfig.getLoginName();
	public String LoginNumber = readconfig.getLoginNumber();
	public String OTPvalue = readconfig.getOTP();

	public static WebDriver driver;
	public static Logger logger;

	@Parameters("browser")
	@SuppressWarnings("deprecation")
	@BeforeClass
	public void setup(String br) {

		/*
		 * Logger logger = Logger.getLogger("JdMart"); logger =
		 * Logger.getLogger(TC_001.class); DOMConfigurator.configure("Log4j.xml");
		 */

		logger = Logger.getLogger("JdMart");
		PropertyConfigurator.configure("Log4j.properties");

		if (br.equals("firefox")) 
		{
			System.setProperty("webdriver.firefox.driver", readconfig.getFirefoxpath());
			driver = new FirefoxDriver();
		}

		else if (br.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", readconfig.getChromepath());
			driver = new ChromeDriver();
		}
		driver.get(baseURL);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		driver.switchTo().alert().dismiss();
//		driver.switchTo().defaultContent();

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}

}
