package stepdefination;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pageobjects.AccountRegistration;
import pageobjects.HomePage;
import pageobjects.LoginOpencart;
import utility.ReadConfig;

public class BaseClass {
	
	public WebDriver driver;
	HomePage hp;

	AccountRegistration ar;	
	Logger logger;
	ReadConfig rc;
	public static String generateRandomString()
	{
		String randomstring=RandomStringUtils.randomAlphabetic(5);
		return randomstring;
	}
	

	

	
	
	
	
	

}
