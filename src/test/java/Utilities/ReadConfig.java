package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;

	public ReadConfig() {
		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());

		}
		
		
		
	}

	public String getbaseURL() {
		String baseURL = pro.getProperty("baseURL");
		return baseURL;
	}

	public String getLoginName() {
		String LoginName = pro.getProperty("LoginName");
		return LoginName;
	}

	public String getLoginNumber() {
		String LoginNumber = pro.getProperty("LoginNumber");
		return LoginNumber;
	}

	public String getOTP() {
		String OTPvalue = pro.getProperty("OTPvalue");
		return OTPvalue;
	}

	public String getChromepath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}

	public String getFirefoxpath() {
		String firfoxpath = pro.getProperty("firfoxpath");
		return firfoxpath;
	}

}
