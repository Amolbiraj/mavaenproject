package pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {
	public WebDriver driver;
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
//	public void waitElement(WebElement element,long timeOutInSeconds)
//	{
//	WebDriverWait wait=new WebDriverWait(driver,timeOutInSeconds);
//	wait.until(ExpectedConditions.visibilityOf(element));
//
//	}	
		

}
